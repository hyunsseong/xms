package subject;

import java.util.Scanner;

public abstract class Subject {
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

	public abstract void printInfo();
	
	
}
