USE TestingSystem;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT  accountID,email,full_name,username, departmentName
FROM	Department d INNER JOIN `Account` a ON d.deparmentID = a.departmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT
FROM 
WHERE
-- Question 3: Viết lệnh để lấy ra tất cả các developer 
SELECT *
FROM	`Account` a INNER JOIN position p ON a.positionID= p.positionID
WHERE	p.positionName ='Dev'
-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT	*	
FROM	Department d INNER JOIN `Account` a ON d.departmentID= a.deparmentID
WHERE	a.accountID > 3;
-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất  
SELECT q.content, COUNT(e.questionID)
FROM ExamQuestion e INNER JOIN Question q ON e.questionID= q.questionID
GROUP BY e.questionID
HAVING	COUNT (e.questionID) = (SELECT 

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 



-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
SELECT * 
FROM	Answer a INNER JOIN Question q ON q.questionID= a.questionID
WHERE	
-- Question 9: Thống kê số lượng account trong mỗi group  
-- Question 10: Tìm chức vụ có ít người nhất  
-- Question 11: thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM  
-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … 
-- Question 13: lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm 
-- Question 14: lấy ra group không có account nào
-- Question 15: lấy ra group không có account nào Question 16: lấy ra question không có answer nào 
				