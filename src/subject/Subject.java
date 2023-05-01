package subject;

import java.util.Scanner;

public class Subject {
	protected SubjectKind kind = SubjectKind.Programming;
	protected int number;
	protected String name;
	protected String examDate;
	protected String examTime;
	protected String studyPlan;
	
	public Subject() {};
	
	public Subject(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public Subject(int number, String name, String examDate, String examTime, String studyPlan) {
		this.number = number;
		this.name = name;
		this.examDate = examDate;
		this.examTime = examTime;
		this.studyPlan = studyPlan;
	}
	
	public SubjectKind getKind() {
		return kind;
	}

	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public String getStudyPlan() {
		return studyPlan;
	}

	public void setStudyPlan(String studyPlan) {
		this.studyPlan = studyPlan;
	}

	
	public void printInfo() {
		System.out.println("Subject number : " + number +"\t" +"Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Exam plan : " + studyPlan);
		
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Subject Number : ");
		int number = input.nextInt();
		this.setNumber(number);
		input.nextLine();
		System.out.print("Subject Name : ");
		String name = input.nextLine();
		this.setName(name);
		System.out.print("Exam Date : ");
		String examDate = input.nextLine();
		this.setExamDate(examDate);
		System.out.print("Exam Time : ");
		String examTime = input.nextLine();
		this.setExamTime(examTime);
		System.out.print("Study Plan : ");
		String studyPlan = input.nextLine();
		this.setStudyPlan(studyPlan);
	}
}
