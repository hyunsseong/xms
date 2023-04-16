package xms;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		SubjectManager subjectManager = new SubjectManager(input); 
		
		int num = -1;
		while (num != 5) {
			System.out.println("---- Subject Management System Menu ----");
			System.out.println("1. Add Subject");
			System.out.println("2. Delete Subject");
			System.out.println("3. Edit Subject");
			System.out.println("4. View Subjects");
			System.out.println("5. Exit");
			System.out.print("Select one number between 1 - 5: ");
			num = input.nextInt();
			
			
			switch (num) {
			case 1 :
				subjectManager.addSubject();
				break;
			case 2:
				subjectManager.deleteSubject();
				break;
			case 3:
				subjectManager.editSubject();
				break;
			case 4:
				subjectManager.viewSubjects();
				break;
			case 5:
				continue;
			}
		}
	}
	
	
}

