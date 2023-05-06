package subject;

import java.util.Scanner;

public class MathSubject extends Subject{
	
	protected String SubmissionDate;
	protected String SubmissionTime;
	
	public MathSubject(SubjectKind kind) {
		super(kind);
	}
	
	public String getSubmissionDate() {
		return this.SubmissionDate;
	}

	public void setSubmissionDate(String SubmissionDate) {
		this.SubmissionDate = SubmissionDate;
	}

	public String getSubmissionTime() {
		return SubmissionTime;
	}

	public void setSubmissionTime(String SubmissionTime) {
		this.SubmissionTime = SubmissionTime;
	}
	
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
		
		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an alternative assignment for the exam? (Y/N)");
			answer = input.next().charAt(0);
			input.nextLine();
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Submission Date : ");
				String SubmissionDate = input.nextLine();
				this.setSubmissionDate(SubmissionDate);

				System.out.print("Submission Time : ");
				String SubmissionTime = input.nextLine();
				this.setSubmissionTime(SubmissionTime);
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
		System.out.println("Kind : " + skind + "\t" + "Subject number : " + number + "\t" + "Subject name : " + name + "\t" + "Exam date : " + examDate + "\t" + "Exam time : " + examTime + "\t" + "Task Submission date : " + SubmissionDate + "\t" + "Task Submission time : " + SubmissionTime + "\t" + "Study plan : " + studyPlan);	
	}
}
