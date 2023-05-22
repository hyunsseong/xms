package subject;

import java.util.Scanner;

import exception.ExamDateFormatException;

public abstract class SubjectWithExam extends Subject {

	public SubjectWithExam(SubjectKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		String skind = getKindString();
		System.out.println("Kind : " + skind + "Subject number : " + number +"\t" +"Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Exam plan : " + studyPlan);
	}
	
	public void setExamwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an exam for this subject? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
			try {	
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Exam Date : ");
					String examDate = input.nextLine();
					this.setExamDate(examDate);
					
					System.out.print("Exam Time : ");
					String examTime = input.nextLine();
					this.setExamTime(examTime);
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


}
