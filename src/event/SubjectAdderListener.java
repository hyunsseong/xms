package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.ExamDateFormatException;
import subject.ProgrammingSubject;
import subject.SubjectInput;
import subject.SubjectKind;
import xms.SubjectManager;

public class SubjectAdderListener implements ActionListener {
	JTextField fieldNum;
	JTextField fieldName;
	JTextField fieldExamDate;
	JTextField fieldExamTime;
	JTextField fieldStudyPlan;
	
	SubjectManager subjectManager;
	
	public SubjectAdderListener(
			JTextField fieldNum,
			JTextField fieldName,
			JTextField fieldExamDate,
			JTextField fieldExamTime,
			JTextField fieldStudyPlan, 
			SubjectManager subjectManager) {
		this.fieldNum = fieldNum;
		this.fieldName = fieldName;
		this.fieldExamDate = fieldExamDate;
		this.fieldExamTime = fieldExamTime;
		this.fieldStudyPlan = fieldStudyPlan;
		this.subjectManager = subjectManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		SubjectInput subject = new ProgrammingSubject(SubjectKind.Programming);
		
		try {
			subject.setNumber(Integer.parseInt(fieldNum.getText()));
			subject.setName(fieldName.getText());
			subject.setExamDate(fieldExamDate.getText());
			subject.setExamTime(fieldExamTime.getText());
			subject.setStudyPlan(fieldStudyPlan.getText());
			subjectManager.addSubject(subject);
			putObject(subjectManager, "subjectmanager.ser"); 
			subject.printInfo();
		} catch (ExamDateFormatException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void putObject(SubjectManager subjectManager, String filename) { 	
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
