package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import event.ButtonAdderListener;
import event.ButtonViewerListener;

public class MenuSelection extends JPanel { // 수정
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame = frame;
		
		this.setLayout(new BorderLayout()); // 수정
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		
		JButton button1 = new JButton("Add Subject");
		JButton button2 = new JButton("View Subject");
		JButton button3 = new JButton("Edit Subject");
		JButton button4 = new JButton("Delete Subject");
		JButton button5 = new JButton("Exit Program");
		
		button1.addActionListener(new ButtonAdderListener(frame)); // 수정
		button2.addActionListener(new ButtonViewerListener(frame)); // 수정
		
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.CENTER);
		
	}
}
