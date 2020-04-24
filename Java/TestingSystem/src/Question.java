import java.util.Date;
public class Question {
	int id;
	String Content;
	CategoryQuestion Category;
	TypeQuestion Type;
	Account Creator;
	Date CreateDate;
	Exam[] exams;
	Answer [] answers;
}
