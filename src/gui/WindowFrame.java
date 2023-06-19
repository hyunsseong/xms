package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import xms.SubjectManager;

public class WindowFrame extends JFrame {
	
	SubjectManager subjectManager;
	
	MenuSelection menuselection;
	SubjectAdder subjectadder;
	SubjectViewer subjectviewer;
	
	
	public WindowFrame(SubjectManager subjectManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.subjectManager = subjectManager;
		menuselection = new MenuSelection(this);
		subjectadder = new SubjectAdder(this, this.subjectManager);
		subjectviewer = new SubjectViewer(this, this.subjectManager);
		
		
		
		this.setupPanel(menuselection);
		
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public SubjectAdder getSubjectadder() {
		return subjectadder;
	}

	public void setSubjectadder(SubjectAdder subjectadder) {
		this.subjectadder = subjectadder;
	}

	public SubjectViewer getSubjectviewer() {
		return subjectviewer;
	}

	public void setSubjectviewer(SubjectViewer subjectviewer) {
		this.subjectviewer = subjectviewer;
	}
	
}
