package com.cv.GUI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.cv.bean.EmployeeRegistration;
import com.cv.util.EmployeeUtils;
import com.cv.util.EmployeeUtilsImpl;

public class DisplayGUI extends JFrame implements ActionListener {

	JFrame f1 = null;
	String[] headings = { "Name", "Contact No.", "Email Id" };
	String data[][];

	EmployeeRegistration emp1 = null;
	List<EmployeeRegistration> testlist = null;

	JLabel l = null;
	JTable table = null;
	JButton ok = null;

	// String skill = "";
	public DisplayGUI(String skill) {
		super("Display");

		ok = new JButton("OK");
		ok.addActionListener(this);
		f1 = new JFrame("User Display Window");
		EmployeeUtils test = new EmployeeUtilsImpl();
		if (!skill.equals("Select")) {
			testlist = test.searchEmployee(skill);
			int s = testlist.size();
			data = new String[s][3];
			for (int i = 0; i < s; i++) {
				emp1 = testlist.get(i);
				data[i][0] = emp1.getName();
				data[i][1] = emp1.getC_no();
				data[i][2] = emp1.getEmail();

			}

			l = new JLabel("User Table");

			// JTable Object construction
			table = new JTable(data, headings);

			// adding Scrollbar to a table object
			JScrollPane sc = new JScrollPane(table);

			Container c = f1.getContentPane();
			c.setLayout(new GridLayout(3, 1));
			c.add(l);
			c.add(sc);
			c.add(ok);

			f1.setBounds(350, 200, 400, 400);
			f1.setVisible(true);

		} else {
			JOptionPane.showMessageDialog(f1, "Select Skills properly..!");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			f1.setVisible(false);
		}

	}

}
