/* Program to create a class for Employee having attribute number ,ename,esalary.Read 'n' employee information and search for an employee given enumber.Using the concept of array of objects.*/

import java.util.Scanner;
class Employee{
	int eno;
	String ename;
	int esalary;
	void Getdata(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the emoloyee id");
		eno=Integer.parseInt(s.nextLine());
		System.out.println("Enter the emp name");
		ename=s.nextLine();
		System.out.println("enter emp salary");
		esalary=s.nextInt();
		System.out.println();
		}
	void display(){
		System.out.println(eno+"\t"+ename+"\t"+esalary+"\n");
		}
	public static void main(String[] args){
		System.out.println("How many emp you want to store");
		Scanner s=new Scanner(System.in);
		int n=Integer.parseInt(s.nextLine());
		Employee emp[]=new Employee[n];
		int i;
		for(i=0;i<n;i++){
		emp[i]=new Employee();
		}
		for(i=0;i<n;i++){
		System.out.println("enter the details of"+(i+1)+"employee");
		emp[i].Getdata();
		}
		System.out.println("Enter emp id");
		int search=Integer.parseInt(s.nextLine());
		for(i=0;i<n;i++){
		if(emp[i].eno==search){
		emp[i].display();
		break;
		}
		}
	}
}
		
		
