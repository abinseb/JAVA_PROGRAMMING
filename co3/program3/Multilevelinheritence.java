/*Create a class ‘Person’ with data members Name, Gender, Address, Age  and a constructor to initialize the data members and another class ‘Employee’ that inherits the properties of class  Person  and  also  contains  its  own  data  members  like  Empid,  Company_name, Qualification, Salary and its own constructor. Create another class‘Teacher’ that inherits the  properties  of  class  Employee  and  contains  its  own  data  members  like  Subject, Department, Teacherid  and  also  contain  constructors  and  methods  to  display  the  data members. Use array of objects to display details of N teachers.*/

import java.util.Scanner;
class Person{
	String Name;
	String Gender;
	String Address;
	int Age;
	Person(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Name:");
	Name=sc.next();
	System.out.println("Enter the Gender:");
	Gender=sc.next();
	System.out.println("Enter the Address:");
	Address=sc.next();
	System.out.println("Enter the Age:");
	Age=sc.nextInt();
	}
}
class Employee extends Person{
	int Empid;
	String Cname;
	String Qualification;
	int Salary;
	Employee(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmpId:");
		Empid=sc.nextInt();
		System.out.println("Enter the Company name:");
		Cname=sc.next();
		System.out.println("Enter the Qualification:");
		Qualification=sc.next();
		System.out.println("Enter the Salary:");
		Salary=sc.nextInt();
	}
}
class Teacher extends Employee{
	String Subject;
	String Department;
	String Teacherid;
	Teacher(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subject:");
		Subject=sc.next();
		System.out.println("Enter the Department:");
		Department=sc.next();
		System.out.println("Enter the Teacherid:");
		Teacherid=sc.next();
		System.out.println();
		}
	void display(){
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee gender:"+Gender);
		System.out.println("Employee address:"+Address);
		System.out.println("Age:"+Age);
		System.out.println("Employee id:"+Empid);
		System.out.println("company name:"+Cname);
		System.out.println("Qualifications:"+Qualification);
		System.out.println("Salary:"+Salary);
		System.out.println("Subject:"+Subject);
		System.out.println("Department:"+Department);
		System.out.println("Teacher id"+Teacherid);
		System.out.println();
		}
}
class Multilevelinheritence{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of teachers");
	int n=sc.nextInt();
	Teacher[] teacher=new Teacher[n];
	for(int i=0;i<n;i++){
		teacher[i]=new Teacher();
	}
	for(int i=0;i<n;i++){
		System.out.println("Details of teachers:");
		teacher[i].display();
		}
	}
}
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
