DROP DATABASE IF EXISTS management;
CREATE DATABASE management;
 USE management;
 
DROP TABLE IF EXISTS Student;
CREATE TABLE Student(
	RN			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Name`		VARCHAR(50) NOT NULL UNIQUE KEY,
    Age			TINYINT UNSIGNED NOT NULL,	
	Gender		ENUM ('Male','Female','Unknown')
    );
    
DROP TABLE IF EXISTS `Subject`;
CREATE TABLE `Subject`(
	sID		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    sName	VARCHAR(50) NOT NULL UNIQUE KEY
);

DROP TABLE IF EXISTS StudentSubject;
CREATE TABLE StudentSubject(
	RN			TINYINT UNSIGNED NOT NULL,
    sID			TINYINT UNSIGNED NOT NULL,
    Mark		TINYINT UNSIGNED CHECK(Mark<=10) NOT NULL,
    `Date`		DATETIME DEFAULT NOW() ,
	FOREIGN KEY (RN) REFERENCES Student(RN) ON DELETE CASCADE,
    FOREIGN KEY (sID) REFERENCES `Subject` (sID) ON DELETE CASCADE,
    PRIMARY KEY (RN, sID)
);

-- Thêm ít nhất 3 bản ghi vào table 

INSERT INTO Student (	`Name`,					Age,		Gender	)
VALUES              ( 	'Khổng Thị Vân',		22,			'Female'),			
                    ( 	'Nguyễn Đức Toàn',		22,			'Male'	),		
                    ( 	'Nguyễn Ngọc Trí',		22,			'Male'	),			
                    ( 	'Đỗ Thị Ngọc',			20,			'Female'),			
					(	'Mai Thành Hưng',		21,			'Male'	),			
					(	'Phùng Viết Tùng',		21,			'Male'	),			
					(	'Trịnh Thị Tú',			20,			'Female'),			
					(	'Trần Thị Hường',		20,			'Female'),			
					(	'Trần Thị Hòa',		 	19,			'Female'),			
					(	'Hoàng Thị Thủy',		20,			'Female');
	

INSERT INTO `Subject`	(	sName			)
VALUES                	(	'Java core'		),               
						( 	'Toán'			),
						(	'Lý'			),
						(	'Hóa'			),
						(	'SQL'			),
						(	'Phân tích thiết kế'),
						(	'Gỉai tích '	),
						(	'C#'			),
						(	'Hình họa'		),
						(	'Đạo đức nghề nghiệp');
	

INSERT INTO StudentSubject 	( 	RN, 	sID, 	Mark, 	`Date`		)
VALUES						(	1,		2,		8,		'2020-02-12'),
							(	2,		8,		7,		'2020-02-12'),
                            (	3,		1,		6,		'2020-04-17'),
                            (	1,		3,		4,		'2020-02-15'),
                            (	3,		3,		6,		'2020-03-10'),
                            (	4,		5,		10,		'2020-03-20'),
                            (	5,		6,		9,		'2020-02-09'),
                            (	7,		9,		10,		'2020-03-31'),
							(	2,		5,		7,		'2020-04-06'),
                            (	1,		1,		4,		'2020-02-05'),
                            (	5,		1,		8,		'2020-04-07');
                            
-- b) Viết lệnh để 
	-- a. Lấy tất cả các môn học không có bất kì điểm nào 
    SELECT	s.sName, ss.Mark 
    FROM 	`Subject` s
    JOIN	StudentSubject ss ON s.sID = ss.sID
    WHERE	ss.Mark IS NULL
    GROUP BY s.sName;
    
	-- b. Lấy danh sách các môn học có ít nhất 2 điểm
    SELECT     	s.sID, s.sName, COUNT(ss.sID)
     FROM 	`Subject` s
    JOIN	StudentSubject ss ON s.sID = ss.sID
	HAVING        COUNT(ss.sID) > 2;

-- c) Tạo "StudentInfo" view có các thông tin về học sinh bao gồm: RN,sID,Name, Age, Gender, sName, Mark, Date. 
	-- Với cột Gender show 0 để thay thế cho Male,1  thay thế cho Female và chưa có thay thế cho Unknow. 
    
    DROP VIEW IF EXISTS StudentInfo;
	CREATE VIEW 		StudentInfo AS
    SELECT 	s.RN,b.sID,s.`Name`, s.Age,b.sName, a.Mark, a.`Date`,
			CASE s.Gender	WHEN 'Male' THEN '0'
							WHEN 'Female' THEN '1'
                            ELSE	'chưa có'
                            END AS GT
    FROM	Student s
    JOIN	StudenSubject a ON s.RN = a.RN 
    JOIN	`Subject` b ON a.sID = b.sID;
    
	SELECT * FROM StudentInfo;
-- d) Tạo `trigger` cho table `Subject: 
	-- a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của cột sID của table StudentSubject cũng thay đổi theo 
    UPDATE	`Subject`
	SET		sID = 4
    WHERE	sID= 3;
    
    DROP TRIGGER IF EXISTS Update_sID;
	DELIMITER $$
	CREATE TRIGGER		Update_sID
	AFTER UPDATE ON		`Subject`
	FOR EACH ROW
	BEGIN
		UPDATE StudentSubject
        SET		sID =NEW.sID
        WHERE	sID= OLD.sID;
	END$$
	DELIMITER ;
    
	-- b. Trigger casDel: Khi xóa 1 student, các dữ liệu của table StudentSubject cũng sẽ bị xóa theo 
   DELETE
   FROM	 Student
   WHERE	RN= 2;
   
   DROP TRIGGER IF EXISTS Update_sID;
	DELIMITER $$
	CREATE TRIGGER		Update_sID
	BEFORE DELETE ON	StudentSubject
	FOR EACH ROW
	BEGIN
		 DELETE
		FROM	 StudentSubject
		WHERE	RN= OLD.RN;
	END$$
	DELIMITER ;
    

	
-- e) Viết 1 thủ tục (có 2 parameters: student name, mark).
--  Thủ tục sẽ xóa tất cả các thông tin liên quan tới học sinh có cùng tên như parameter và tất cả các điểm nhỏ hơn của các học sinh đó.  
-- Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh

 DROP PROCEDURE IF EXISTS mark_of_student;
DELIMITER $$
CREATE PROCEDURE mark_of_student (IN in_ TINYINT UNSIGNED)
BEGIN
	SELECT	a.RN, s.`Name`, a.Mark
    FROM	Student s
    JOIN	StudenSubject a ON s.RN = a.RN;
	
END$$
DELIMITER ;