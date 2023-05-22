package subject;

import java.util.Scanner;

import exception.ExamDateFormatException;

public class MathSubject extends SubjectWithExam{
	
	public MathSubject(SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSubjectNum(input);
		setSubjectName(input);
		setExamwithYN(input);
		setSubmissionwithYN(input);
		setStudyPlan(input);
	}
	
	public void setSubmissionwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an alternative assignment for the exam? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
			try {
				if (answer == 'y' || answer == 'Y') {
					setExamDate(input);
					setExamTime(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setExamDate("");
					this.setExamTime("");
					break;
				}
				else {
	
				}
			} catch (ExamDateFormatException e) {
				System.out.println("Incorrect Exam Date Format. put the Exam Date that cotains '.'");
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("Kind : " + skind + "\t" + "Subject number : " + number + "\t" + "Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Task Submission date : " + examDate + "\t" + "Task Submission time : " + examTime + "\t" + "Study plan : " + studyPlan);	
	}
	
}
