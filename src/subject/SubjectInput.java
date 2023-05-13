package subject;

import java.util.Scanner;

public interface SubjectInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public void setName(String name);
	
	public void setExamDate(String examDate);
	
	public void setExamTime(String examTime);
	
	public void setStudyPlan(String studyPlan);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	

}
