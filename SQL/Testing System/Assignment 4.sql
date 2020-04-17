USE TestingSystem;
-- Question 1: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ
SELECT *
FROM	`Account` a  
INNER JOIN Department d ON d.deparmentID = a.departmentID;

-- Question 2: Viết lệnh để lấy ra thông tin các account được tạo sau ngày 20/12/2010 
SELECT	*
FROM 	`account`
WHERE	createDate	> '2019-12-20';

-- Question 3: Viết lệnh để lấy ra tất cả các developer 
SELECT *
FROM	`Account` a 
INNER JOIN position p ON a.positionID= p.positionID
WHERE	p.positionName ='Dev';

-- Question 4: Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên 
SELECT	d.departmentName, COUNT (a.full_name) AS SoluongNV
FROM	Department d 
INNER JOIN `Account` a ON d.departmentID= a.deparmentID
GROUP BY departmentName
HAVING	COUNT(full_name) > 1;

-- Question 5: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất  
SELECT		 q.content ,COUNT(eq.questionID) AS SL
FROM		ExamQuestion eq
INNER JOIN 	Question q  ON eq.questionID= q.questionID
GROUP BY	eq.questionID
HAVING	SL=(SELECT MAX(b) 
			FROM	(SELECT COUNT( eq.questionID ) AS b
					FROM	ExamQuestion
                    GROUP BY   eq.questionID) AS c);

-- Question 6: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT		c.categoryName,COUNT(q.categoryID) SLsudung
FROM 		CategoryQuestion c
INNER JOIN	Question q ON c.categoryID= q.categoryID
GROUP BY	c.categoryID ;

-- Question 7: Thông kê mỗi Question được sử dụng trong bao nhiêu Exam 
SELECT	eq.questionID,COUNT(eq.examID) AS SL
FROM 	ExamQuestion eq
INNER JOIN	Exam e ON eq.examID= e.examID
GROUP BY eq.questionID;

-- Question 8: Lấy ra Question có nhiều câu trả lời nhất 
SELECT		q.content, COUNT(a.answerID) AS SLcautraloi
FROM 		Question q 
INNER JOIN 	Answer a ON q.questionID = a.questionID
GROUP BY	q.content
HAVING		SLcautraloi =  (SELECT	MAX(SL)
							FROM	(SELECT	COUNT(a.questionID) AS SL
									FROM		Answer a
									GROUP BY	a.questionID) Q);

-- Question 9: Thống kê số lượng account trong mỗi group  
SELECT 		groupID, count(accountID) AS Soluong
FROM		Groupaccount
GROUP BY	groupID;

-- Question 10: Tìm chức vụ có ít người nhất  
SELECT	  	a.positionID ,COUNT(a.accountID) AS SL
FROM		`Account` a 
INNER JOIN 	Position p ON a.positionID= p.positionID
GROUP BY	 a.positionID
HAVING	SL=(SELECT MIN(b) 
			FROM	(SELECT COUNT(  a.positionID) AS b
					FROM	`Account` a
                    GROUP BY   a.positionID) AS c);
                    
-- Question 11: thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM  
SELECT 			d.departmentName,p.positionName, GROUP_CONCAT(a.Full_name), COUNT(p.positionID)
FROM			Department d 
JOIN			`Account` a  ON	 d.departmentID = a.departmentID
JOIN			`Position`p  ON  a.positionID = p.ositionID
GROUP BY  		d.departmentID, p.positionName ;

-- Question 12: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, … 
SELECT		q.questionID, q.Content, t.TypeName, an.content, a.accountID, a.full_name 
FROM		Question q
JOIN 		TypeQuestion t	ON	q.typeID = t.typeID
JOIN		Answer an    	ON an.questionID = q.questionID
JOIN		 `Account` a		ON	a.accountID = 	q.creatorID;	
-- Question 13: lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm 
SELECT 			typeName, COUNT(questionID)  
FROM			TypeQuestion tq
JOIN			Question q ON	tq.typeID =q.typeID
WHERE			tq.typeName = 'Essay' OR typeName = 'Multiple-Choice'  
GROUP BY 		tq.typeName ;

-- Question 14: lấy ra group không có account nào
SELECT 			g.groupName, accountID
FROM			`Group` g
LEFT JOIN		GroupAccount ga ON  g.groupID= ga.groupID
WHERE       	a.accountID  IS NULL
GROUP BY    	g.groupName;
-- Question 15: lấy ra group không có account nào
-- Question 16: lấy ra question không có answer nào 
SELECT		   q.questionID, q.content, a.answerID
FROM			Question q
LEFT JOIN		Answer a    ON  q.questionID = a.questionID
WHERE			a.answerID IS NULL
GROUP BY        q.content ;

-- Question 17:  a) Lấy các account thuộc nhóm thứ 1 b) Lấy các account thuộc nhóm thứ 2 c) Ghép 2 kết quả từ câu a) và câu b) sao cho không có record nào trùng nhau  
SELECT			ga.groupID, a.full_name, a.email, a.accountID	 
FROM			 `Account` a 
JOIN			GroupAccount  ga  ON  a.accountID= ga.accountID
WHERE           ga.groupID = 1
GROUP BY 		a.full_name
UNION  
SELECT			ga.groupID , a.Fullname, a.Email, a.Account_id	 
FROM			 `Account` a 
JOIN			GroupAccount  ga  ON  a.accountID = ga.accountID
WHERE           ga.groupID  = 2
GROUP BY 		a.full_name ;
-- Question 18:  a) Lấy các group có lớn hơn 5 thành viên b) Lấy các group có nhỏ hơn 7 thành viên c) Ghép 2 kết quả từ câu a) và câu b) 
SELECT     	g.groupID, g.groupName, COUNT(ga.accountID)
FROM		`Group` g 
JOIN		 GroupAccount ga   ON  g.groupID = ga.groupID
GROUP BY  	 g.groupID 
HAVING        COUNT(ga.accountID) > 5
UNION 
SELECT     	g.groupID, g.groupName, COUNT(ga.accountID)
FROM		`Group` g 
JOIN		 GroupAccount ga   ON  g.groupID = ga.groupID
GROUP BY  	 g.groupID 
HAVING        COUNT(ga.accountID) < 7;


