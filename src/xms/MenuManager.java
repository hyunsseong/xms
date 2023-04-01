package xms;

import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add subject");
			System.out.println("2. Delete subject");
			System.out.println("3. Edit subject");
			System.out.println("4. View subject");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.print("Select one number between 1 - 6: ");
			num = input.nextInt();
			
			
			switch (num) {
			case 1 :
				addSubject();
				break;
			case 2:
				deleteSubject();
				break;
			case 3:
				editSubject();
				break;
			case 4:
				viewSubject();
				break;
			case 5:
			case 6:
				continue;
			}
		}
	}
	
	public static void addSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject Number : ");
		int subjectNumber = input.nextInt();
		input.nextLine();
		System.out.print("Subject Name : ");
		String subject = input.nextLine();
		System.out.print("Exam Date : ");
		String examDate = input.nextLine();
		System.out.print("Exam Time : ");
		String examTime = input.nextLine();
		System.out.print("Study Plan : ");
		String studyPlan = input.nextLine();
	}
	
	public static void deleteSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject Number : ") ;
		int subjectNumber = input.nextInt();
	}
	
	public static void editSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject Number : ");
		int subjectNumber = input.nextInt();
	}
	
	public static void viewSubject() {
		Scanner input = new Scanner(System.in);
		System.out.print("Subject Number : ");
		int subjectNumber = input.nextInt();
	}
}

