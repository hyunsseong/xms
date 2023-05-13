package xms;

import java.util.*;

import subject.MathSubject;
import subject.ProgrammingSubject;
import subject.SienceSubject;
import subject.SienceSubject;
import subject.Subject;
import subject.SubjectInput;
import subject.SubjectKind;

public class SubjectManager {
	ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
	Scanner input;

	public SubjectManager(Scanner input) {
		this.input = input;
	}

	public void addSubject() {
		int kind = 0;
		SubjectInput subjectInput;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Programming");
			System.out.println("2 for Sience");
			System.out.println("3 for Math");
			System.out.print("Select num 1,2 or 3 for Subject Kind : ");
			kind = input.nextInt();
			if (kind == 1) {
				subjectInput = new ProgrammingSubject(SubjectKind.Programming);
				subjectInput.getUserInput(input);
				subjects.add(subjectInput);
				break;
			}
			else if (kind == 2) {
				subjectInput = new SienceSubject(SubjectKind.Sience);
				subjectInput.getUserInput(input);
				subjects.add(subjectInput);
				break;
			}
			else if (kind == 3) {
				subjectInput = new MathSubject(SubjectKind.Math);
				subjectInput.getUserInput(input);
				subjects.add(subjectInput);
				break;
			}
			else {
				System.out.print("Select num 1,2 or 3 for Subject Kind : ");
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
			SubjectInput subjectInput = subjects.get(i);
			if (subjectInput.getNumber() == subjectNumber) {
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
						subjectInput.setNumber(number);
						break;
					case 2:
						System.out.print("Subject Name : ");
						String name = input.nextLine();
						subjectInput.setName(name);
						break;
					case 3:
						System.out.print("Exam Date : ");
						String examDate = input.nextLine();
						subjectInput.setExamDate(examDate);
						break;
					case 4:
						System.out.print("Exam Time : ");
						String examTime = input.nextLine();
						subjectInput.setExamTime(examTime);
						break;
					case 5:
						System.out.print("Study Plan : ");
						String studyPlan = input.nextLine();
						subjectInput.setStudyPlan(studyPlan);
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
