USE TestingSystem;
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale 
DROP VIEW IF EXISTS DSNV;
CREATE VIEW 		DSNV AS
SELECT				a.full_name
FROM 				`Account` a 
INNER JOIN			 Department d ON a.departmentID= d.departmentID
WHERE 				d.departmentID = (	SELECT	d1.departmentID
										FROM	Department d1
										WHERE	departmentName='Sale');

SELECT * FROM DSNV;
						
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất  
DROP VIEW IF EXISTS	TTNV;
CREATE VIEW 		TTNV AS
SELECT		a.accountID,a.email,a.email, COUNT (g.accountID) AS SL
FROM		`Account` a
INNER JOIN 	GroupAccount g ON a.accountID= g.accountID
GROUP BY 	g.accountID
HAVING		SL =(SELECT MAX(b)
				FROM (	SELECT	COUNT(c.accountID) AS b
						FROM	GroupAccount c
						GROUP BY c.accountID) AS c);
                    
SELECT * FROM TTNV;

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi  
DROP VIEW IF EXISTS 	DSCH;
CREATE VIEW  			DSCH   AS
SELECT			questionID, LENGTH(content)
FROM			Question
WHERE			LENGTH(Content) > 75 ;

SELECT * FROM 			DSCH;

DELETE			a			
from			answer a
INNER JOIN		DSCH  d	ON   a.questionID = D.questionID ;

DELETE			q
FROM			Question q
JOIN			DSCH d ON d.questionID = q.questionID;

-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
DROP VIEW IF EXISTS DSPB;
CREATE VIEW 		DSPB AS
SELECT 				a.departmentID,COUNT(a.accountID) AS SL
FROM 				Department d
INNER  JOIN 		`Account` a ON d.departmentID = a.departmentID
GROUP BY  			a.departmentID
HAVING				SL=(SELECT MAX(b) 
						FROM	(SELECT COUNT(  a.departmentID) AS b
								FROM	`Account` a
								GROUP BY   a.departmentID) AS c);
			
SELECT * FROM DSPB;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyen tạo
DROP VIEW IF EXISTS CHDT;
CREATE VIEW 		CHDT AS
SELECT				 a.full_name,q.content
FROM 				`Account` a
INNER JOIN			 Question q ON a.accountID = q.creatorID
WHERE 				a.full_name LIKE 'Nguyễn%'
GROUP BY 			a.accountID;

SELECT * FROM CHDT

