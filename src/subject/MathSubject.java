package subject;

import java.util.Scanner;

public class MathSubject extends Subject {
	
	public void getUserInput(Scanner input) {
		System.out.print("Subject Number : ");
		int number = input.nextInt();
		this.setNumber(number);
		
		input.nextLine();
		
		System.out.print("Subject Name : ");
		String name = input.nextLine();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an exam for this subject? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
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
		}
		
		System.out.print("Study Plan : ");
		String studyPlan = input.nextLine();
		this.setStudyPlan(studyPlan);
	}
}
