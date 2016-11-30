package com.cv.bean;

import java.io.Serializable;

public class EmployeeRegistration implements Serializable{
	
	private String name;
	private String f_name;
	private String sex;
	private String res_add;
	private String  c_no;
	private String email;
	private String education;
	private String skill;
	private String exp;
	private String dob;
	
	public EmployeeRegistration(){
		
	}

	public EmployeeRegistration(String name, String f_name, String sex,
			String res_add, String c_no, String email, String education,
			String skill, String exp, String dob) {
		super();
		this.name = name;
		this.f_name = f_name;
		this.sex = sex;
		this.res_add = res_add;
		this.c_no = c_no;
		this.email = email;
		this.education = education;
		this.skill = skill;
		this.exp = exp;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRes_add() {
		return res_add;
	}

	public void setRes_add(String res_add) {
		this.res_add = res_add;
	}

	public String getC_no() {
		return c_no;
	}

	public void setC_no(String c_no) {
		this.c_no = c_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee Info [Name=" + name + ", Father name=" + f_name
				+ ", Sex=" + sex + ", Address=" + res_add + ", Contact No.=" + c_no
				+ ", email=" + email + ", Education=" + education + ", Skill="
				+ skill + ", Experience=" + exp + ", Date of Birth=" + dob + "]";
	}

	/*@Override
	public String toString() {
		return name;
	}*/
	
}
		