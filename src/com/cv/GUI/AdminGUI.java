package com.cv.GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminGUI extends JFrame implements ActionListener{

	//frame
	JFrame f=new JFrame("Admin");
	//button
	JButton enter=null;
	JButton back=null;
	
	//labels &fields
	JTextField un=null;
	JTextField up=null;
	JLabel u=null;
	JLabel p=null;
	
	Container c = f.getContentPane();
	
	public AdminGUI(){
		
		super("c_gui");
		enter=new JButton("Enter");
		enter.addActionListener(this);
		
		back=new JButton("Back");
		back.addActionListener(this);
		
		un=new JTextField();
		up=new JPasswordField();
		
		u=new JLabel("Username:");
		p=new JLabel("Password:");
		
	    c.setLayout(new GridLayout(6,2));
	    c.setBackground(Color.cyan);
	    c.add(u);
	   c.add(un);
	    c.add(p);
	    c.add(up);
	    c.add(enter);
	    c.add(back);
	    
	    
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		new AdminGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==enter){
			
			String username = un.getText();
			String password = up.getText();
			if(!username.equals("") && !password.equals(""))
			{
				if(username.equals("admin") && password.equals("admin"))
					{
						f.setVisible(false);
						new SearchGUI();
					 
					}
				else{
						JOptionPane.showMessageDialog(f, "PLease enter correct  username or password...!");
						un.setText(null);
						up.setText(null);
					}
			}
			else{
				JOptionPane.showMessageDialog(f, "Enter all fields");
				}
			}
	 				
	 if(e.getSource()==back){
		 f.setVisible(false);
		 new HomeGUI();
	 }
     	
	}
	
	}
	

