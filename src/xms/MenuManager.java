package xms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt"); // 추가
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		SubjectManager subjectManager = getObject("subjectmanager.ser"); // 수정~
		if (subjectManager == null) {
			subjectManager = new SubjectManager(input);
		}// 여기까지 수정
		
		selectMenu(input, subjectManager);
		putObject(subjectManager, "subjectmanager.ser"); // 추가
		
	}
	
	public static void selectMenu(Scanner input, SubjectManager subjectManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch (num) {
				case 1 :
					subjectManager.addSubject();
					logger.log("add a subject"); // 추가
					break;
				case 2:
					subjectManager.deleteSubject();
					logger.log("delete a subject"); // 추가
					break;
				case 3:
					subjectManager.editSubject();
					logger.log("edit a subject"); // 추가
					break;
				case 4:
					subjectManager.viewSubjects();
					logger.log("edit a list of subject"); // 추가
					break;
				default:
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("---- Subject Management System Menu ----");
		System.out.println("1. Add Subject");
		System.out.println("2. Delete Subject");
		System.out.println("3. Edit Subject");
		System.out.println("4. View Subjects");
		System.out.println("5. Exit");
		System.out.print("Select one number between 1 - 5: ");
	}
	
	public static SubjectManager getObject(String filename) { // 새로운 함수 추가
		SubjectManager subjectManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			subjectManager = (SubjectManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return subjectManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return subjectManager;
		
	}
	
	public static void putObject(SubjectManager subjectManager, String filename) { // 새로운 함수 추가
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(subjectManager);
			
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

