package com.cv.GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import com.cv.bean.EmployeeRegistration;
import com.cv.util.EmployeeUtils;
import com.cv.util.EmployeeUtilsImpl;

public class SearchGUI extends JFrame implements ActionListener {
	JButton sr = null;
	JLabel sk = null;
	JComboBox<String> sk1 = null;
	JFrame s = null;
	public SearchGUI() {
		super("My Window");
		JFrame s = new JFrame("Search Employee");
		JLabel sk = new JLabel("Skill");
		String[] skill = { "Select", "Java", "PHP", "CPP", "SQL", "HTML",
				"CSS", "Dot NET" };
		sk1 = new JComboBox<String>(skill);
		sr = new JButton("Search");
		sr.addActionListener(this);
		Container c = s.getContentPane();
		c.setLayout(new GridLayout(3, 10));
		c.add(sk);
		c.add(sk1);
		c.add(sr);

		s.setSize(400, 200);
		s.setVisible(true);
		s.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new SearchGUI();
	}

	@Override
	public void actionPerformed(ActionEvent s) {
		if (s.getSource() == sr) {

			String ski = (String) sk1.getSelectedItem();
			//System.out.println("Skill : "+ski);
			new DisplayGUI(ski);
		

		}

	}
}
