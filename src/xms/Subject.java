package xms;

public class Subject {
	int number;
	String name;
	String examDate;
	String examTime;
	String studyPlan;
	
	public Subject() {};
	
	public Subject(int number, String name, String examDate, String examTime, String studyPlan) {
		this.number = number;
		this.name = name;
		this.examDate = examDate;
		this.examTime = examTime;
		this.studyPlan = studyPlan;
	}
	
	public void printInfo() {
		System.out.println("Subject number : " + number +"\t" +"Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Exam plan : " + studyPlan);
		
	}
}
