package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import event.SubjectAdderCancelListener;
import event.SubjectAdderListener;
import xms.SubjectManager;

public class SubjectAdder extends JPanel {
	
	WindowFrame frame;
	
	SubjectManager subjectManager;
	
	public SubjectAdder(WindowFrame frame, SubjectManager subjectManager) {
		this.frame = frame;
		this.subjectManager = subjectManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNum = new JLabel("Subject Number : ", JLabel.TRAILING);
		JTextField fieldNum = new JTextField(10);
		labelNum.setLabelFor(fieldNum);
		panel.add(labelNum);
		panel.add(fieldNum);
		
		JLabel labelName = new JLabel("Subject Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelExamDate = new JLabel("Exam Date : ", JLabel.TRAILING);
		JTextField fieldExamDate = new JTextField(10);
		labelExamDate.setLabelFor(fieldExamDate);
		panel.add(labelExamDate);
		panel.add(fieldExamDate);
		
		JLabel labelExamTime = new JLabel("Exam Time : ", JLabel.TRAILING);
		JTextField fieldExamTime = new JTextField(10);
		labelExamTime.setLabelFor(fieldExamTime);
		panel.add(labelExamTime);
		panel.add(fieldExamTime);
		
		JLabel labelStudyPlan = new JLabel("Study Plan : ", JLabel.TRAILING);
		JTextField fieldStudyPlan = new JTextField(10);
		labelStudyPlan.setLabelFor(fieldStudyPlan);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new SubjectAdderListener(fieldNum, fieldName, fieldExamDate, fieldExamTime, fieldStudyPlan, subjectManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new SubjectAdderCancelListener(frame));
		
		panel.add(labelStudyPlan);
		panel.add(fieldStudyPlan);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);
		
		this.add(panel); // 수정
		this.setVisible(true);
		
	}

}
