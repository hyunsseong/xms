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
			System.out.print("Select one number :");
			num = input.nextInt();
		
			switch (num) {
			case 1 :
				System.out.print("Subject Number : ");
				int subjectNumber = input.nextInt();
				System.out.print("Subject Name : ");
				String subject = input.next();
				System.out.print("Exam Date : ");
				String examDate = input.next();
				System.out.print("Exam Time : ");
				String examTime = input.next();
				System.out.print("Study Plan : ");
				String studyPlan = input.next();
				break;
			case 2:
				System.out.println("Subject Number : ");
				int deleteSubject = input.nextInt();
				break;
			case 3:
				System.out.println("Subject Number : ");
				int editSubject = input.nextInt();
				break;
			case 4:
				System.out.println("Subject Number : ");
				int viewSubject = input.nextInt();
				break;
			case 5:
			case 6:
				break;
			}
		}
	}
}

