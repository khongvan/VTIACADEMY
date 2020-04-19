
USE TestingSystem;

-- Question 1: Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước 
INSERT INTO `Group`	(	groupName,	creatorID,		createDate)
VALUES				(	'Nhóm hg',			2,		'2019-02-10'),
					(	'Nhóm kjl',			1,		'2019-10-20');
                    
DROP TRIGGER IF EXISTS create_group; 
DELIMITER $$
CREATE TRIGGER	create_group
BEFORE INSERT ON `Group`
FOR EACH ROW
BEGIN
	IF NEW.`createDate`< DATE_SUB(NOW(),INTERVAL 1 year) THEN
		SIGNAL SQLSTATE '12345'
        SET MESSAGE_TEXT = ' field createDate';
	END IF;
END$$
DELIMITER ;

 SELECT DATE_SUB(NOW(),INTERVAL 1 year);

-- Question 2: Tạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user" 
INSERT INTO `Account`	(	email,					username,		full_name,			departmentID,	positionID,	createDate)
VALUES					('doanvan@gmail.com',		'Doanvan',		'Đoàn Văn Vấn',		1,				2,			'2020-01-20');

 DROP TRIGGER IF EXISTS create_group; 
DELIMITER $$
CREATE TRIGGER create_group
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN
  
      IF NEW.departmentID = (SELECT departmentID FROM Department WHERE DepartmentName ='Sale') THEN
         SIGNAL SQLSTATE '12345'
         SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
	  END IF ;

END $$
DELIMITER ;
 
-- Question 3: Cấu hình 1 group có nhiều nhất là 5 user. 
DROP TRIGGER IF EXISTS max_group_5;
DELIMITER $$
CREATE TRIGGER max_group_5
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN	
		IF (SELECT COUNT(1) FROM `Account` GROUP BY deartmentID) > 5 THEN
			SIGNAL SQLSTATE '12345'
			SET MESSAGE_TEXT = 'Mỗi Department tối đa được 5 Account ';
		END IF ;
END$$
DELIMITER ;

 
-- Question 4: Cấu hình 1 bài thi có nhiều nhất là 2 Question 
DROP TRIGGER IF EXISTS In_Exam_Max_Question;
DELIMITER $$
CREATE TRIGGER In_Exam_Max_Question
BEFORE INSERT ON `ExamQuestion`
FOR EACH ROW
BEGIN
	  IF (SELECT COUNT(1) FROM `ExamQuestion` GROUP BY EexamID) > 2 THEN
		SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Mỗi bài thi nhiều nhất 2 câu hỏi';
	  END IF ;
END $$
DELIMITER ;

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com 
	-- (đây là tài khoản admin, không cho phép user xóa), 
    -- còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó 
 DROP TRIGGER IF EXISTS Delete_Account
DELIMITER $$
CREATE TRIGGER Delete_Account
BEFORE DELETE ON `Account`
FOR EACH ROW
BEGIN 
      DECLARE 	`admin` TINYINT UNSIGNED;
      SELECT 	accountID INTO `admin`
      FROM 		`Account`
      WHERE 	email = 'Dongoc@gmail.com';
			IF accountID = `admin` THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT = 'đây là tài khoản admin, không cho phép user xóa';
			END IF;
            IF accountID =`admin` THEN
				DELETE 
				FROM	GroupAccount ;
			END IF;
END $$
DELIMITER ;
-- Question 6: Không sử dụng cấu hình default cho field DepartmentID của table Account, 
-- hãy tạo trigger cho phép người dùng khi tạo account không điền vào departmentID thì sẽ được phân vào phòng ban "Marketing"   
 DROP TRIGGER IF EXISTS DepartmentID
DELIMITER $$
CREATE TRIGGER Is_Null_DepartmentID
BEFORE INSERT ON `Account`
FOR EACH ROW
BEGIN 
      DECLARE		V_departmentID TINYINT ;
      SELECT 		departmentID INTO V_departmentID
      FROM 			Department d
      INNER JOIN 	`Account` a  ON a.departmentID = d.departmentID 
      WHERE			departmentName = 'Marketing';
		IF NEW.departmentID IS NULL THEN
		SET NEW.departmentID =  V_departmentID;
		END IF;
END $$
DELIMITER 
 
-- Question 10: Viết trigger chỉ cho phép người dùng chỉ được update, delete các question khi question đó chưa nằm trong exam nào 

DROP TRIGGER IF EXISTS Update_delete;
DELIMITER $$
CREATE TRIGGER Update_delete
BEFORE UPDATE  ON Question
FOR EACH ROW
	BEGIN
		DECLARE		question_on_Exam TINYINT;   
		SELECT		q.questionID INTO question_on_Exam
		FROM 		Question q
		LEFT JOIN 	ExamQuestion eq ON q.questionID = eq.questionID
		WHERE 		eq.examID IS NULL;
			IF NEW.questionID != question_on_Exam THEN
				SIGNAL SQLSTATE '12345'
				SET MESSAGE_TEXT = 'Không thể thêm vào'; 
			END IF ;
	END $$
DELIMITER ;
-- Question 12: Lấy ra thông tin exam trong đó  
  -- Duration <= 30 thì sẽ đổi thành giá trị "Short time" 
  -- 30 < duration <= 60 thì sẽ đổi thành giá trị "Medium time" 
  -- duration >60 thì sẽ đổi thành giá trị "Long time" 
  
  SELECT	e.examID, e.createDate, e.Codes,
		CASE
			WHEN	e.duration <=30 THEN "Short time"
            WHEN	e.duration >60 THEN "Long time"
            ELSE 'Medium time'
		END AS a
  FROM Exam e;
  
-- Question 13: Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:  
	-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few 
    -- Nếu số lượng user trong group <= 20 và > 5  thì sẽ có giá trị là normal
    -- Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher 

		SELECT g.GroupName, COUNT(ga.accountID),
			CASE
				WHEN	COUNT(ga.accountID) =< 5 THEN "few" 
                WHEN	COUNT(ga.accountID) <= 20 THEN "normal"
                ELSE	"higher"
			END AS 	the_number_user_amount
		FROM `Group` g 
		JOIN GroupAccount ga ON g.groupID = ga.groupID 
		GROUP BY accountID;

-- Question 14: Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User" 
SELECT departmentName,
       CASE 
            WHEN COUNT(a.accountID) = 0 THEN 'Không có user'
            ELSE COUNT(a.accountID)
		END AS Number_user_in_department
FROM Department d
LEFT JOIN `Account` a ON d.DepartmentID = a.DepartmentID
GROUP BY a.departmentID;

-- Question 7: Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng. 
-- Question 8: Viết trigger sửa lại dữ liệu cho đúng: 
-- nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database 

-- Question 9: Viết trigger không cho phép người dùng xóa bài thi mới tạo được 2 ngày 