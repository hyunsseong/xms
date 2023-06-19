/**
 * 
 */
package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.SubjectViewer;
import gui.WindowFrame;
import xms.SubjectManager;

public class ButtonViewerListener implements ActionListener {
	WindowFrame frame;
	
	public ButtonViewerListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		SubjectViewer subjectViewer = frame.getSubjectviewer();
		SubjectManager subjectManager = getObject("subjectmanager.ser");
		subjectViewer.setSubjectManager(subjectManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(subjectViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static SubjectManager getObject(String filename) { 
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

}
