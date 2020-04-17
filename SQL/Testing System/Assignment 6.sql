USE TestingSystem;

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó 
DROP PROCEDURE IF EXISTS Department_Account;
DELIMITER $$
CREATE PROCEDURE Department_Account ( IN in_deparmentName VARCHAR(50))
	BEGIN
    SELECT		a.accountID, a.email, a.full_name
    FROM		`Account`a
    INNER JOIN	Department d ON a.departmentID = d.departmentID
    WHERE		departmentName = in_deparmentName;
    END$$
DELIMITER ;
 
 CALL Department_Account('Sale');
 
-- Question 2: Tạo store để in ra số lượng account trong mỗi group  
DROP PROCEDURE IF EXISTS Account_Group;

DELIMITER $$
CREATE PROCEDURE Account_Group ()
	BEGIN
		SELECT 		g.groupID,g.groupName, COUNT(accountID) AS Soluong
		FROM		Groupaccount ga
        INNER JOIN	 `Group` g ON ga.groupID = g.groupID
		GROUP BY	g.groupID;
    END$$
DELIMITER ;

CALL Account_Group();
 
-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tạI
DROP PROCEDURE IF EXISTS Type_of_question;

DELIMITER $$
CREATE PROCEDURE Type_of_question ( )
	BEGIN
		SELECT GROUP_CONCAT(typeName,'') AS typeName, COUNT (q.questionID) AS SL
        FROM	Question q
        INNER JOIN	TypeQuestion tq ON q.typeID = tq.typeID
        GROUP BY	tq.typeID
        HAVING 		SL= SELECT MAX(b)
						FROM	(SELECT  MONTH(q1.createDate),COUNT(q1.questionID) AS b
								FROM	Question q1
								GROUP BY	MONTH(q1.createDate) )AS c;
    END$$
DELIMITER ;

CALL	Type_of_question();

 
-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất 
DROP PROCEDURE IF EXISTS type_question;

DELIMITER $$
CREATE PROCEDURE type_question (OUT out_type_question TINYINT UNSIGNED )
	BEGIN
		SELECT		q.typeID INTO out_type_question
        FROM		Question q
        INNER JOIN	TypeQuestion tq ON q.typeID = tq.typeID
        GROUP BY	q.typeID
        HAVING		COUNT(q.questionID)=	(SELECT MAX(b)
											FROM ( SELECT COUNT (q1.questionID) AS b
													FROM	Question q1
                                                    GROUP BY q1.typeID) AS c);
    END$$
DELIMITER ;

SET @typeID = 0;
call type_question(@typeID);
select @typeID;

 
-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question 
SELECT	typeName
FROM	TypeQuestion
WHERE	TypeID = @Type_ID;
 
-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào 
 DROP PROCEDURE IF EXISTS GRND;
 
 DELIMITER $$
 CREATE PROCEDURE GRND ( OUT  out_username VARCHAR(50), OUT out_groupName VARCHAR(50))
	BEGIN
		SELECT		CONCAT(a.username) AS username, g.groupName  INTO  out_username ,out_groupName
        FROM		`Account` a
        INNER JOIN	GroupAccount ga ON a.accountID = ga.accountID
        INNER JOIN	`Group` g ON ga.groupID = g.groupID;
    END$$
 DELIMITER ;
 
 SET 	@username = '';
 SET 	@groupName ='';
 CALL 	GRND(@username,@groupName);
 SELECT (@username,@groupName);
 
 
-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán   username sẽ giống email nhưng bỏ phần @..mail đi  positionID: sẽ có default là developer  departmentID: sẽ được cho vào 1 phòng chờ Sau đó in ra kết quả tạo thành công 
 
-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất 
 
-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID 
 
-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa), sau đó in số lượng record đã remove từ các table liên quan trong khi removing 
 
-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc 
 
-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay 
 