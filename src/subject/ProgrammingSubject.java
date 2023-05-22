package subject;

import java.util.Scanner;

public class ProgrammingSubject extends Subject {
	
	public ProgrammingSubject(SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSubjectNum(input);
		setSubjectName(input);
		setExamDate(input);
		setExamTime(input);
		setStudyPlan(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind : " + skind + "Subject number : " + number +"\t" +"Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Exam plan : " + studyPlan);	
	}
	
}
