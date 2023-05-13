package subject;

import java.util.Scanner;

public class ProgrammingSubject extends Subject implements SubjectInput {
	
	public ProgrammingSubject(SubjectKind kind) {
		super(kind);
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
	
	public void printInfo() {
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
		System.out.println("Kind : " + skind + "Subject number : " + number +"\t" +"Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Exam plan : " + studyPlan);	
	}
	
}
