package xms;

import java.util.*;

public class SubjectManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Scanner input;

	public SubjectManager(Scanner input) {
		this.input = input;
	}

	public void addSubject() {
		Subject subject = new Subject();
		System.out.print("Subject Number : ");
		subject.number = input.nextInt();
		input.nextLine();
		System.out.print("Subject Name : ");
		subject.name = input.nextLine();
		System.out.print("Exam Date : ");
		subject.examDate = input.nextLine();
		System.out.print("Exam Time : ");
		subject.examTime = input.nextLine();
		System.out.print("Study Plan : ");
		subject.studyPlan = input.nextLine();
		subjects.add(subject);
	}

	public void deleteSubject() {
		System.out.print("Subject Number : ") ;
		int subjectNumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<subjects.size();i++) {
			if(subjects.get(i).number == subjectNumber){
				index = i;
				break;
			}	
		}
		if (index >=0) {
			subjects.remove(index);
			System.out.println("The subject " + subjectNumber + " is deleted");	
		}
		else {
			System.out.println("The subject has not been registered");
			return;
		}

	}

	public void editSubject() { 
		System.out.print("Subject Number : ");
		int subjectNumber = input.nextInt();

		for (int i = 0; i<subjects.size();i++) {
			Subject subject = subjects.get(i);
			if (subject.number == subjectNumber) {
				int num = -1;
				while (num != 6) {
					System.out.println("---- Subject Info Edit Menu ----");
					System.out.println("1. Edit Subject Number");
					System.out.println("2. Edit Subject Name");
					System.out.println("3. Edit Exam Date");
					System.out.println("4. Edit Exam Time");
					System.out.println("5. Edit Study Plan");
					System.out.println("6. Exit");
					System.out.print("Select one number between 1 - 6: ");
					num = input.nextInt();
					input.nextLine();
					
					switch (num) {
					case 1 :
						System.out.print("Subject Number : ");
						subject.number = input.nextInt();
						break;
					case 2:
						System.out.print("Subject Name : ");
						subject.name = input.nextLine();
						break;
					case 3:
						System.out.print("Exam Date : ");
						subject.examDate = input.nextLine();
						break;
					case 4:
						System.out.print("Exam Time : ");
						subject.examTime = input.nextLine();
						break;
					case 5:
						System.out.print("Study Plan : ");
						subject.studyPlan = input.nextLine();
						break;
					case 6:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}

	public void viewSubjects() {
		//		System.out.print("Subject Number : ");
		//		int subjectNumber = input.nextInt();
		for (int i = 0; i<subjects.size();i++) {
			subjects.get(i).printInfo();
		}
	}
}
