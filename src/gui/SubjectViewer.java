package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import subject.SubjectInput;
import xms.SubjectManager;

public class SubjectViewer extends JPanel {
	
	WindowFrame frame;
	
	SubjectManager subjectManager;
	
	public SubjectManager getSubjectManager() {
		return subjectManager;
	}

	public void setSubjectManager(SubjectManager subjectManager) {
		this.subjectManager = subjectManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject Number");
		model.addColumn("Subject Name");
		model.addColumn("Exam Date");
		model.addColumn("Exam Time");
		model.addColumn("Study Plan");
		
		for(int i = 0; i<subjectManager.size(); i++) {
			Vector row = new Vector();
			SubjectInput si = subjectManager.get(i);
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getExamDate());
			row.add(si.getExamTime());
			row.add(si.getStudyPlan());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public SubjectViewer(WindowFrame frame, SubjectManager subjectManager) {
		this.frame = frame;
		this.subjectManager = subjectManager;
		
		System.out.println("***" + subjectManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Subject Number");
		model.addColumn("Subject Name");
		model.addColumn("Exam Date");
		model.addColumn("Exam Time");
		model.addColumn("Study Plan");
		
		for(int i = 0; i<subjectManager.size(); i++) {
			Vector row = new Vector();
			SubjectInput si = subjectManager.get(i);
			row.add(si.getNumber());
			row.add(si.getName());
			row.add(si.getExamDate());
			row.add(si.getExamTime());
			row.add(si.getStudyPlan());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
