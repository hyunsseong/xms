package xms;

import java.io.Serializable;
import java.util.*;

import subject.MathSubject;
import subject.ProgrammingSubject;
import subject.SienceSubject;
import subject.SubjectInput;
import subject.SubjectKind;

public class SubjectManager implements Serializable{ // 추가
	/**
	 * 
	 */
	private static final long serialVersionUID = 4457152117783979670L; // 추가
	ArrayList<SubjectInput> subjects = new ArrayList<SubjectInput>();
	transient Scanner input; // 수정

	public SubjectManager(Scanner input) {
		this.input = input;
	}

	public void addSubject() {
		int kind = 0;
		SubjectInput subjectInput;
		while (kind < 1 || kind > 3) {
			try {
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
			catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}

	}

	public void deleteSubject() {
		System.out.print("Subject Number : ") ;
		int subjectNumber = input.nextInt();
		int index = findIndex(subjectNumber);
		removefromSubjects(index, subjectNumber);
	}

	public int findIndex(int subjectNumber) {
		int index = -1;
		for (int i = 0; i<subjects.size();i++) {
			if(subjects.get(i).getNumber() == subjectNumber){
				index = i;
				break;
			}	
		}
		return index;
	}

	public int removefromSubjects(int index, int subjectNumber) {
		if (index >=0) {
			subjects.remove(index);
			System.out.println("The subject " + subjectNumber + " is deleted");	
			return 1;
		}
		else {
			System.out.println("The subject has not been registered");
			return -1;
		}
	}

	public void editSubject() { 
		System.out.print("Subject Number : ");
		int subjectNumber = input.nextInt();

		for (int i = 0; i<subjects.size();i++) {
			SubjectInput subject = subjects.get(i);
			if (subject.getNumber() == subjectNumber) {
				int num = -1;
				while (num != 6) {
					showEditMenu();
					num = input.nextInt();
					input.nextLine();

					switch (num) {
					case 1 :
						subject.setSubjectNum(input);
						break;
					case 2:
						subject.setSubjectName(input);
						break;
					case 3:
						subject.setExamDate(input);
						break;
					case 4:
						subject.setExamTime(input);
						break;
					case 5:
						subject.setStudyPlan(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}

	public void viewSubjects() {
		System.out.println("# of registered subjects: " + subjects.size());
		for (int i = 0; i<subjects.size();i++) {
			subjects.get(i).printInfo();
		}
	}



	public void showEditMenu() {
		System.out.println("---- Subject Info Edit Menu ----");
		System.out.println("1. Edit Subject Number");
		System.out.println("2. Edit Subject Name");
		System.out.println("3. Edit Exam Date");
		System.out.println("4. Edit Exam Time");
		System.out.println("5. Edit Study Plan");
		System.out.println("6. Exit");
		System.out.print("Select one number between 1 - 6: ");
	}
}
