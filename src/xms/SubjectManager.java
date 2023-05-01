package xms;

import java.util.*;

import subject.MathSubject;
import subject.Subject;

public class SubjectManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Scanner input;

	public SubjectManager(Scanner input) {
		this.input = input;
	}

	public void addSubject() {
		int kind = 0;
		Subject subject;
		while (kind != 1 && kind != 2) {
			System.out.print("1 for Programming");
			System.out.print("2 for Math");
			System.out.print("Select num for Subject Kind between 1 and 2 : ");
			kind = input.nextInt();
			if (kind == 1) {
				subject = new Subject();
				subject.getUserInput(input);
				subjects.add(subject);
				break;
			}
			else if (kind == 2) {
				subject = new MathSubject();
				subject.getUserInput(input);
				subjects.add(subject);
				break;
			}
			else {
				System.out.print("Select num for Subject Kind between 1 and 2 : ");
			}
		}
		
	}

	public void deleteSubject() {
		System.out.print("Subject Number : ") ;
		int subjectNumber = input.nextInt();
		int index = -1;
		for (int i = 0; i<subjects.size();i++) {
			if(subjects.get(i).getNumber() == subjectNumber){
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
			if (subject.getNumber() == subjectNumber) {
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
						int number = input.nextInt();
						subject.setNumber(number);
						break;
					case 2:
						System.out.print("Subject Name : ");
						String name = input.nextLine();
						subject.setName(name);
						break;
					case 3:
						System.out.print("Exam Date : ");
						String examDate = input.nextLine();
						subject.setExamDate(examDate);
						break;
					case 4:
						System.out.print("Exam Time : ");
						String examTime = input.nextLine();
						subject.setExamTime(examTime);
						break;
					case 5:
						System.out.print("Study Plan : ");
						String studyPlan = input.nextLine();
						subject.setStudyPlan(studyPlan);
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
		System.out.println("# of registered subjects: " + subjects.size());
		for (int i = 0; i<subjects.size();i++) {
			subjects.get(i).printInfo();
		}
	}
}
