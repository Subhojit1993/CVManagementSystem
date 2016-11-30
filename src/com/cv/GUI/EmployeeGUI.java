package com.cv.GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.cv.bean.EmployeeRegistration;
import com.cv.util.EmployeeUtils;
import com.cv.util.EmployeeUtilsImpl;

public class EmployeeGUI extends JFrame implements ActionListener {

	// Frame
	JFrame f = new JFrame("CV Registration");

	// Button
	JButton Add = null;
	JButton Clear = null;

	// Label
	JLabel Name = null;
	JLabel F_name = null;
	JLabel Sex = null;
	JLabel Dob = null;
	JLabel Address = null;
	JLabel C_no = null;
	JLabel Mail = null;
	JLabel Qualification = null;
	JLabel Skill = null;
	JLabel Exp = null;

	// TextFiled
	JTextField name = null;
	JTextField f_name = null;
	JTextField dob = null;
	JTextField address = null;
	JTextField c_no = null;
	JTextField mail = null;

	

	// CheckBox
	//JCheckBox M = null;
	//JCheckBox F = null;

	// ComboBox
	JComboBox<String> G=null;
	JComboBox<String> Q = null;
	JComboBox<String> S = null;
	JComboBox<String> E = null;

	Container c = f.getContentPane();

	public EmployeeGUI() {
		super("My_Window");
		Add = new JButton("Add");
		Add.addActionListener(this);
		Clear = new JButton("Clear");
		Clear.addActionListener(this);
		
		String[] gen={"Select","Male","Female"};
		String[] skills = { "Select", "Java", "PHP", "CPP", "SQL", "HTML",
				"CSS", "Dot NET" };
		String[] exp = { "Select", "Fresher", "1 year", "2 year", "3 year" };
		String[] qua = { "Select", "MTech", "BCA", "MBA", "BTech", "MCA" };

		// LABELS
		Name = new JLabel("Name");
		F_name = new JLabel("Father's Name");
		Sex = new JLabel("Sex");
		Dob = new JLabel("Date Of Birth (DDMMYYYY)");
		Address = new JLabel("Address");
		C_no = new JLabel("Contact Number (+91)");
		Mail = new JLabel("EMail Id");
		Qualification = new JLabel("Qualification");
		Skill = new JLabel("Skill");
		Exp = new JLabel("Experience");

		// TEXT FIELDS
		name = new JTextField();
		f_name = new JTextField();
		dob = new JTextField();
		address = new JTextField();
		c_no = new JTextField();
		mail = new JTextField();

		

		// COMBO BOX
		G = new JComboBox<String>(gen);
		Q = new JComboBox<String>(qua);
		S = new JComboBox<String>(skills);
		E = new JComboBox<String>(exp);

		c.setLayout(new GridLayout(11, 2));
		c.setBackground(Color.CYAN);
		c.add(Name);
		c.add(name);
		c.add(F_name);
		c.add(f_name);
		c.add(Sex);
		c.add(G);
		c.add(Dob);
		c.add(dob);
		c.add(Address);
		c.add(address);
		c.add(C_no);
		c.add(c_no);
		c.add(Mail);
		c.add(mail);
		c.add(Qualification);
		c.add(Q);
		c.add(Skill);
		c.add(S);
		c.add(Exp);
		c.add(E);
		c.add(Add);
		c.add(Clear);

		f.setSize(600, 600);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public void setNull() {
		name.setText(null);
		f_name.setText(null);
		dob.setText(null);
		address.setText(null);
		c_no.setText(null);
		mail.setText(null);
		G.setSelectedItem("Select");
		Q.setSelectedItem("Select");
		S.setSelectedItem("Select");
		E.setSelectedItem("Select");
	}

	public static void main(String[] args) {
		new EmployeeGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == Add) {
			String n = name.getText();
			String fn = f_name.getText();
			String db = dob.getText();
			String radd = address.getText();
			String cn = c_no.getText();
			String em = mail.getText();
			String gen1=(String) G.getSelectedItem();
			String qual = (String) Q.getSelectedItem();
			String skl = (String) S.getSelectedItem();
			String ex = (String) E.getSelectedItem();
			
			
			EmployeeUtils test = new EmployeeUtilsImpl();
			ArrayList testlist = new ArrayList();

			String ccc = c_no.getText();

			int s = ccc.length();

			double cont = 0;
			double n1 = 0;

			if (n == null || fn == null || db == null || radd == null
					|| cn == null || em == null || qual == "Select"
					|| skl == "Select" || ex == "Select" || gen1 == "Select") {

				JOptionPane.showMessageDialog(f, "Enter all fields");

			}

			else {
				//NumberFormatException foundEx = null;
				
				
				try {
					n1 = Double.parseDouble(dob.getText());
				} catch (NumberFormatException ea) {
					JOptionPane.showMessageDialog(f, "Date must be Integer..!");
				}

				/*try {
					cont = Double.parseDouble(c_no.getText());
				} catch (NumberFormatException ee) {
					foundEx = ee;
					JOptionPane.showMessageDialog(f,
							"Contact No. must be integers only..!");
					
				}*/
				NumberFormatException foundEx = null;
				//if(foundEx == null){
					
					try {
						cont = Double.parseDouble(c_no.getText());
					} catch (NumberFormatException ee) {
						foundEx = ee;
						JOptionPane.showMessageDialog(f,
								"Contact No. must be integers only..!");
						
					}
					if(foundEx == null){
				/*try {
					n1 = Double.parseDouble(dob.getText());
				} catch (NumberFormatException ea) {
					JOptionPane.showMessageDialog(f, "Date must be Integer..!");
				}*/
				if (s <= 9 || s >= 11) {
					JOptionPane.showMessageDialog(f, "Contuct must be 10 Digit");
				}

				
				/*if(!testlist.equals(test.checkEmail(em))){
					JOptionPane.showMessageDialog(f, "CV already exists");
				}*/
				
				
				
				else {
					
					if(!testlist.equals(test.checkEmail(em))){
						JOptionPane.showMessageDialog(f, "email already exists");
					}
					
					else{
					
					EmployeeRegistration employee = new EmployeeRegistration(n,
							fn, gen1, radd, cn, em, qual, skl, ex, db);

					EmployeeUtils eu = new EmployeeUtilsImpl();
					if (eu.addEmployee(employee)) {
						JOptionPane.showMessageDialog(f, "Done...!");
						setNull();

					} else {
						JOptionPane.showMessageDialog(f, "Problem...!");
					}}
				}

			}/*else{
				//JOptionPane.showMessageDialog(f, "Try Again...!");
			}*/
		}
		

	}
		if (e.getSource() == Clear) {

			setNull();

		}

}
}