package ConstructorsAccessModifiersemp;

import java.util.Scanner;

import ConstructorsAccessModifiers.CEO;

public class Employee extends CEO {

	public String emp_email;
	private String emp_password;
	Scanner sc=new Scanner(System.in);
	

	 public void EnterEmployeeDetails(){
		System.out.println("Enter Employee email");
		
		emp_email=sc.next();
		System.out.println("Enter Employee password");
		emp_password=sc.next();
		
	}
	
	
public void viewEmployeeDetails() {
	System.out.println("view employee details");
		
		System.out.println("Employee email="+emp_email);
		System.out.println("Employee password="+emp_password);
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_password() {
		return emp_password;
	}
	public void setEmp_password(String emp_password) {
		this.emp_password = emp_password;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}


}