package com.cv.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.cv.bean.EmployeeRegistration;




public class EmployeeUtilsImpl implements EmployeeUtils {

	@Override
	public boolean addEmployee(EmployeeRegistration emp) {
		
		boolean reg = false;
		
		File file = new File("D:/cv.ser");
		try{
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			
			@SuppressWarnings("unchecked")
			List<EmployeeRegistration> empy = (List<EmployeeRegistration>)in.readObject();
			empy.add(emp);
			
			in.close();
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(empy);
			
			out.close();
			fout.close();
			System.out.println("CV added...!");
			reg = true;
			
		}catch(FileNotFoundException e){
			try{
			FileOutputStream fout = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			List<EmployeeRegistration> empy = new ArrayList<EmployeeRegistration>();
			empy.add(emp);
			out.writeObject(empy);
			
			out.close();
			fout.close();
			System.out.println("New File created...!");
			reg = true;
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		return reg;
	}

	@Override
	public List<EmployeeRegistration> searchEmployee(String skill) {
		List<EmployeeRegistration> emps = new ArrayList<EmployeeRegistration>();
		
		File file = new File("D:/cv.ser");
		try{
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			
			@SuppressWarnings("unchecked")
			List<EmployeeRegistration> emplist = (List<EmployeeRegistration>)in.readObject();
			
			in.close();fin.close();
			
			for(EmployeeRegistration emp : emplist){
				if(emp.getSkill().equals(skill)){
					emps.add(emp);
				}
			}
				
	}catch(Exception e){
		System.out.println(e);
	}
		return emps;
	}
	
	
	@Override
	public List<EmployeeRegistration> getEmpy() {
		File file = new File("D:/cv.ser");
		List<EmployeeRegistration> eList = null;
		try{
			FileInputStream fin  = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			eList = (List<EmployeeRegistration>)in.readObject();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return eList;
	
	

}

	@Override
	public List<EmployeeRegistration> checkEmail(String email) {
List<EmployeeRegistration> check = new ArrayList<EmployeeRegistration>();
		
		File file = new File("D:/cv.ser");
		try{
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			
			@SuppressWarnings("unchecked")
			List<EmployeeRegistration> emailList = (List<EmployeeRegistration>)in.readObject();
			
			in.close();fin.close();
			
			for(EmployeeRegistration emp : emailList){
				if(emp.getEmail().equals(email)){
					//System.out.println("CV Exists");
					check.add(emp);
				}
			}
				
	}catch(Exception e){
		System.out.println(e);
	}
		//return null;
		return check;
		
	}
}

