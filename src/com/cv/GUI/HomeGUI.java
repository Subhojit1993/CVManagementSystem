package com.cv.GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeGUI extends JFrame implements ActionListener{
	
	JButton admin = new JButton("Admin area");
	JButton member = new JButton("Member area");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	
	public HomeGUI(){
		super("c_gui");
		
		panel.setLayout(null);
		
		admin.setBounds(500, 250, 150, 80);
		admin.addActionListener(this);
		
		member.setBounds(700, 250, 150, 80);
		member.addActionListener(this);
		
		panel.add(admin);
		panel.add(member);
		add(panel);
		//this.setLayout(null);
		//panel.setLayout(null);
		//panel.setLocation(400, 400);
		
		setSize(1366, 768);
		setBackground(Color.black);
		setTitle("CV Management System");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	} 
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==admin){
			new AdminGUI();
			setVisible(false);
		}
		if(e.getSource()==member){
			
			new AddCvGUI();
			setVisible(false);
		}
	}
	public static void main(String[] args) {
		
		new HomeGUI();
	}
	
}
