USE	TestingSystem;

-- Question 2: lấy ra tất cả các phòng ban 
SELECT 	*
FROM 	Department

-- Question 3: lấy ra id của phòng ban `sale`
SELECT departmentID
FROM 	Department	
WHERE	Department.departmentName='Sale'

-- Question 4: lấy ra thông tin account có full name dài nhất và sắp xếp chúng theo thứ tự giảm dần 
SELECT 	full_name
FROM 	`Account`
WHERE	LENGTH(full_name)=(SELECT MAX(LENGTH(full_name))FROM `Account`)
ORDER BY full_name DESC

-- Question 5: Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id = 3 
SELECT 	*,LENGTH(full_name)
FROM 	`Account`
WHERE 	`Account`.departmentID='3' AND LENGTH(full_name)=(SELECT MAX(LENGTH(full_name))
												FROM `Account`)
-- Question 6: lấy ra tên group đã tham gia trước ngày 20/12/2019 
SELECT	groupName,createDate
FROM 	`Group`
WHERE 	createDate < '2019-12-20'

-- Question 7: Lấy ra ID của question có >= 4 câu trả lời 
SELECT	 questionID
FROM	 Answer
WHERE	 iscorrect >=4

-- Question 8: Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019 
SELECT	codes,duration,createDate
FROM	EXAM
WHERE 	duration >= 60 AND createDate < '2019-12-20'

-- Question 9: Lấy ra 5 group được tạo gần đây nhất 
SELECT	*
FROM	`Group`
ORDER BY createDate DESC
LIMIT 	5

-- Question 10: Đếm số nhân viên thuộc department có id = 2 
SELECT	COUNT(*) AS So_nhan_vien
FROM 	`Account`
WHERE 	departmeNtID='2'

-- Question 11: Lấy ra nhân viên có tên bắt đầu bằng chữ "V" và kết thúc bằng chữ "n" 
SELECT *
FROM	`Account`
WHERE  full_name LIKE 'V%n'

-- Question 12: xóa tất cả các exam được tạo trước ngày 20/12/2019  
DELETE FROM	EXAM
WHERE	createDate < '2019-12-20';

-- Question 13: xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi" 
DELETE 
FROM	Question
WHERE	content LIKE '%câu hỏi %'
 
-- Question 14: update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn 
UPDATE	`Account`
SET		full_name ='Nguyễn Bá Lộc',
		email ='loc.nguyenba@vti.com.vn'
WHERE accountID = 5;

-- Question 15: update account có id = 5 sẽ thuộc group có id = 4 
UPDATE	GroupAccount
SET		groupID=4
WHERE	accountID=5;

-- In ra thông tin group có số nhân viên > 3
SELECT	groupID, COUNT(*)
FROM	`group`
GROUP BY groupID
HAVING	COUNT(*) > 3;