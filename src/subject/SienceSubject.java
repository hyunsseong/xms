package subject;

import java.util.Scanner;

public class SienceSubject extends SubjectWithExam {
	
	public SienceSubject(SubjectKind kind) {
		super(kind);
	}	
	
	public void getUserInput(Scanner input) {
		setSubjectNum(input);
		setSubjectName(input);
		setExamwithYN(input);
		setStudyPlan(input);
	}
	
}
