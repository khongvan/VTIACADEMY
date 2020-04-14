USE TestingSystem;
-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale 
DROP VIEW IF EXISTS DSNV;
CREATE VIEW DSNV AS
SELECT a.full_name
FROM  `Account` a 
INNER JOIN Department d ON a.departmentID= d.departmentID
WHERE d.departmentID = (SELECT d1.departmentID
							FROM Department d1
                            WHERE departmentName='Sale');

SELECT * FROM DSNV;
						
-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất  
DROP VIEW IF EXISTS
CREATE VIEW TTNV AS
SELECT
FROM
WHERE 

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi  
WITH Cau_hoi_dai AS(
SELECT	*
FROM	Question
WHERE	content = (SELECT MAX(SL)
					FROM	Question q
                    WHERE s
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạ