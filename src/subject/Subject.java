package subject;

import java.io.Serializable;
import java.util.Scanner;

import exception.ExamDateFormatException;

public abstract class Subject implements SubjectInput, Serializable { // 수정
	/**
	 * 
	 */
	private static final long serialVersionUID = 5325980166361069848L; // 추가
	protected SubjectKind kind = SubjectKind.Programming;
	protected int number;
	protected String name;
	protected String examDate;
	protected String examTime;
	protected String studyPlan;

	public Subject() {}

	public Subject(SubjectKind kind) {
		this.kind = kind;
	}

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

	public Subject(SubjectKind kind, int number, String name, String examDate, String examTime, String studyPlan) {
		this.kind = kind; 
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

	public void setExamDate(String examDate) throws ExamDateFormatException{
		if(!examDate.contains(".") && !examDate.equals("")) {
			throw new ExamDateFormatException();
		}

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

	public abstract void printInfo();


	public void setSubjectNum(Scanner input) {
		System.out.print("Subject Number : ");
		int number = input.nextInt();
		input.nextLine();
		this.setNumber(number);
	}

	public void setSubjectName(Scanner input) {
		System.out.print("Subject Name : ");
		String name = input.nextLine();
		this.setName(name);
	}

	public void setExamDate(Scanner input) {
		String examDate = "";
		while(!examDate.contains(".")) {
			System.out.print("Exam Date : ");
			examDate = input.nextLine();
			try {
				this.setExamDate(examDate);
			} catch (ExamDateFormatException e) {
				System.out.println("Incorrect Exam Date Format. put the Exam Date that cotains '.'");
			}
		}
	}

	public void setExamTime(Scanner input) {
		System.out.print("Exam Time : ");
		String examTime = input.nextLine();
		this.setExamTime(examTime);
	}

	public void setStudyPlan(Scanner input) {
		System.out.print("Study Plan : ");
		String studyPlan = input.nextLine();
		this.setStudyPlan(studyPlan);
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Programming:
			skind = "Programming";
			break;
		case Math:
			skind = "Math";
			break;
		case Sience:
			skind = "Sience";
			break;
		case Refinement:
			skind = "Refinement";
			break;
		default :
		}
		return skind;
	}

}
