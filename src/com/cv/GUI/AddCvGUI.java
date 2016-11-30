package com.cv.GUI;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AddCvGUI extends JFrame implements ActionListener{
	JButton addcv = null;
	JButton back = null;
	JFrame frame1 = null;
	
	public AddCvGUI(){
		super("c_gui");
		frame1 = new JFrame("Register Here");
		
		addcv = new JButton("Add Your CV");
		addcv.addActionListener(this);
		
		back = new JButton("Back");
		back.addActionListener(this);
		
		
		Container c = frame1.getContentPane();
		
		c.setLayout(new GridLayout(1, 2));
		
		c.add(addcv);
		c.add(back);
		
		
		frame1.setSize(400, 100);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(HIDE_ON_CLOSE);
	} 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==addcv){
			frame1.setVisible(false);
			new EmployeeGUI();
			
			
		}
		
		if(e.getSource()==back){
			frame1.setVisible(false);
			new HomeGUI();
		}
		
	}
	public static void main(String[] args) {
		new AddCvGUI();
	}
	
}
