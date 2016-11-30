package com.cv.util;

import java.util.List;

import com.cv.bean.EmployeeRegistration;

public interface EmployeeUtils {
	
	public boolean addEmployee(EmployeeRegistration emp);
	
	public List<EmployeeRegistration> getEmpy();
	List<EmployeeRegistration> searchEmployee(String skill);
	List<EmployeeRegistration> checkEmail(String email);

}
