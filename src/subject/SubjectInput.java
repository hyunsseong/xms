package subject;

import java.util.Scanner;

import exception.ExamDateFormatException;

public interface SubjectInput {
	
	public int getNumber();
	
	public void setNumber(int number);
	
	public String getName(); // 추가
	
	public void setName(String name);
	
	public String getExamDate(); // 추가
	
	public void setExamDate(String examDate) throws ExamDateFormatException;
	
	public String getExamTime(); // 추가
	
	public void setExamTime(String examTime);
	
	public String getStudyPlan(); // 추가
	
	public void setStudyPlan(String studyPlan);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setSubjectNum(Scanner input);
	
	public void setSubjectName(Scanner input);
	
	public void setExamDate(Scanner input);
	
	public void setExamTime(Scanner input);
	
	public void setStudyPlan(Scanner input);
}
