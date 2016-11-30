 package com.cv.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import com.cv.bean.EmployeeRegistration;
import com.cv.util.EmployeeUtils;
import com.cv.util.EmployeeUtilsImpl;


public class Main {

	public static void main(String[] args) {
		/*File file = new File("D:/cv.ser");
		
		List<EmployeeRegistration> empy = null;
		EmployeeRegistration emp = new EmployeeRegistration();
		
		try{
			FileInputStream fin = new FileInputStream(file);
			ObjectInputStream in = new ObjectInputStream(fin);
			empy = (List<EmployeeRegistration>)in.readObject();
			in.close();
			fin.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		EmployeeRegistration emp1 = new EmployeeRegistration("sushmita","Surendra","Male","Sodhpur","9874","khokakkg@gmail.com","B.Tech","JAVA","10","14-08-1992" );
		
		EmployeeUtils util = new EmployeeUtilsImpl();
		if(util.addEmployee(emp1)){
			System.out.println("done");
		}else{
			System.out.println("nothing");
		}
		
	}
}*/



	
		
		EmployeeUtils test = new EmployeeUtilsImpl();
		List<EmployeeRegistration> testlist =(List<EmployeeRegistration>) test.searchEmployee("Dot NET");
		
		for(EmployeeRegistration e : testlist){
			System.out.println(e);

}
}
}

	/*EmployeeUtils util = new EmployeeUtilsImpl();
		List<EmployeeRegistration> eList = util.getEmpy();
			for(EmployeeRegistration emp: eList){
			System.out.println(emp);*/




