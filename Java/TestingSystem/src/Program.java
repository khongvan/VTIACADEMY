import java.util.Date;

public class Program {
	public static void main(String[] args) {
		
		// create Department
		Department department1 = new Department();
		department1.ID = 1;
		department1.DepartmentName = "Sale";
		
		Department department2 = new Department();
		department2.ID = 2;
		department2.DepartmentName = "Marketting";
		
		// create Group
		Group group1 = new Group();
		group1.ID =1;
		group1.GroupName = "Java Fresher" ;
		group1.CreatorID = 1;
		group1.CreateDate= new Date ("2020/04/18");
		
		
		Group group2 = new Group();
		group2.ID =2;
		group2.GroupName = "C# Fresher" ;
		group2.CreatorID = 2;
		group2.CreateDate=new Date ("2020/04/19");
		
		
		// create Position
		Position position1 = new Position();
		position1.ID =1;
		position1.PositionName = "thuc tap sinh";
		
		Position position2 = new Position();
		position2.ID =1;
		position2.PositionName = "Ke toan";
		
		//create Account
		Account account1 = new Account ();
		account1.ID =1;
		account1.Email = "Khongvan@gmail.com";
		account1.UserName="Khongvan";
		account1.fullName = "Khong  Thi Van";
		account1.Deparment = department1;
		account1.Position = position1;
		account1.createDate= new Date ("2020/04/22");
		
		Account account2 = new Account ();
		account2.ID =2;
		account2.Email = "Tranduy@gmail.com";
		account2.UserName="Tranduy";
		account2.fullName = "Tran Van Duy";
		account2.Deparment = department1;
		account2.Position = position1;
		account2.createDate= new Date ("2020/04/22");
		
		Group [] GrroupOfAccount1 = {group1, group2};
		account1.groups = GrroupOfAccount1;
		
		//create TypeQuestion
	
		TypeQuestion type1 = new TypeQuestion();
		type1.ID =1;
		type1.typeName = "Multiple Choice";
		
		TypeQuestion type2 = new TypeQuestion();
		type2.ID =2;
		type2.typeName = "Essay";
		
		// create CategoryQuestion
		 CategoryQuestion Category1 = new CategoryQuestion();
		 Category1.ID =1;
		 Category1.CategoryName = "SQL";
		 
		 CategoryQuestion Category2 = new CategoryQuestion();
		 Category2.ID =2;
		 Category2.CategoryName = "ASP.NET";
		 
		// create Answer
		  Answer answer1 = new Answer ();
		  answer1.id =1;
		  answer1.Content = "Khai báo kích thước một trường";
		  answer1.isCorrect = ;
		  
		  Answer answer2 = new Answer ();
		  answer2.id =2;
		  answer2.Content = "Thực hiện tính toán đơn giản";
		  answer2.isCorrect = "Sai";
		 
		 //create Question
		 Question question1 = new Question ();
		 question1.id = 1;
		 question1.Content = "Chức năng mẫu câu hỏi Query";
		 question1.Creator = account1;
		 question1.Type = type1;
		 question1.Category= Category1;
		 question1.CreateDate = new Date ("2020/04/20");
		 
		 Question question2 = new Question ();
		 question2.id = 2;
		 question2.Content = "Thao tác khai báo cấu trúc bao gồm";
		 question2.Creator = account2;
		 question2.Type = type2;
		 question2.Category= Category2;
		 question2.CreateDate = new Date ("2020/04/19");
		 
		 Answer [] QuestionOfAnswer = {answer1, answer2};
		 question1.answers = QuestionOfAnswer;
		 
		 
		//create exam
		 Exam exam1 = new Exam();
		 exam1.id =1;
		 exam1.Code = 123;
		 exam1.Creator = account1;;
		 exam1.Category = Category1;
		 exam1.Duration = 15;
		 exam1.Title = "Kiểm tra môn Toán";
		 
		 
		 Exam exam2 = new Exam();
		 exam2.id =2;
		 exam2.Code = 124;
		 exam2.Creator = account2;
		 exam2.Category = Category2;
		 exam2.Duration = 30;
		 exam1.Title = "Kiểm tra môn Hóa";
		 
		 Question [] QuestionOfExam1 = {question1, question2};
		 exam1.questions = QuestionOfExam1;
		 
		  
		System.out.println ("Thông tin phòng ban 1:");
		System.out.println("Name:" + department1.DepartmentName);
		System.out.println("ID:" + department1.ID);
		System.out.println("\n");
		
		System.out.println ("Thông tin phòng ban 2:");
		System.out.println("Name:" + department2.DepartmentName);
		System.out.println("ID:" + department2.ID);
		System.out.println("\n");
		
		System.out.println ("Thông tin group 1:");
		System.out.println("Name:" + group1.GroupName);
		System.out.println("ID:" + group1.ID);
		System.out.println("\n");
		
		System.out.println ("Thông tin group 1:");
		System.out.println("Name:" + group1.GroupName);
		System.out.println("ID:" + group1.ID);
		System.out.println("\n");
		
		System.out.println ("Thông tin chức vụ 1:");
		System.out.println("ID:" + position1.ID);
		System.out.println("Name:" + position1.PositionName);
		System.out.println("\n");
		
		System.out.println ("Thông tin chức vụ 2:");
		System.out.println("ID:" + position2.ID);
		System.out.println("Name:" + position2.PositionName);
		System.out.println("\n");
		
		System.out.println ("Thông tin TypeQuestion 1:");
		System.out.println("ID:" + type1.ID);
		System.out.println("Name:" + type1.typeName);
		System.out.println("\n");
		
		System.out.println ("Thông tin TypeQuestion 2:");
		System.out.println("ID:" + type1.ID);
		System.out.println("Name:" + type1.typeName);
		System.out.println("\n");
		
		System.out.println ("Thông tin CategoryQuestion 1:");
		System.out.println("ID:" + Category1.ID);
		System.out.println("Name:" + Category1.CategoryName);
		System.out.println("\n");
		
		System.out.println ("Thông tin CategoryQuestion 2:");
		System.out.println("ID:" + Category2.ID);
		System.out.println("Name:" + Category2.CategoryName);
		System.out.println("\n");
		
		System.out.println ("Thông tin Exam 1:");
		System.out.println("ID:" + exam1.id);
		System.out.println("Code:" + exam1.Code);
		System.out.println("CreatorID:" + exam1.Creator);
		System.out.println("Category:" + exam1.Category.CategoryName);
		System.out.println("Duration:" + exam1.Duration);
		System.out.println("Title:" + Category1.ID);
		System.out.println("\n");
		
		System.out.println ("Thông tin Exam 2:");
		System.out.println("ID:" + exam2.id);
		System.out.println("Code:" + exam2.Code);
		System.out.println("CreatorID:" + exam2.Creator);
		System.out.println("Category:" + exam2.Category.CategoryName);
		System.out.println("Duration:" + exam2.Duration);
		System.out.println("Title:" + Category2.ID);
		System.out.println("\n");
		
		System.out.println ("Thông tin Answer 1:");
		System.out.println("ID:" + answer1.id);
		System.out.println("Content:" + answer1.Content);
		System.out.println("isCorrect:" + answer1.isCorrect);
		System.out.println("\n");
		
		System.out.println ("Thông tin Answer 2:");
		System.out.println("ID:" + answer2.id);
		System.out.println("Content:" + answer2.Content);
		System.out.println("isCorrect:" + answer2.isCorrect);
		System.out.println("\n");
		
		System.out.println ("Thông tin Question 1:");
		System.out.println("ID:" + question1.id);
		System.out.println("Content:" + question1.Content);
		System.out.println("Creator:" + question1.Creator.fullName);
		System.out.println("Type:" + question1.Type.typeName);
		System.out.println("Category:" + question1.Category.CategoryName);
		System.out.println("CreateDate:" + question1.CreateDate);
		System.out.println("\n");

		System.out.println ("Thông tin Question 2:");
		System.out.println("ID:" + question2.id);
		System.out.println("Content:" + question2.Content);
		System.out.println("Creator:" + question2.Creator.fullName);
		System.out.println("Type:" + question2.Type.typeName);
		System.out.println("Category:" + question2.Category.CategoryName);
		System.out.println("CreateDate:" + question2.CreateDate);
		System.out.println("\n");
	}
	
}
