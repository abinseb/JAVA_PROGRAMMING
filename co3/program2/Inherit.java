import java.util.Scanner;

class Employee{
	int Empid;
	String name;
	double salary;
	String address;
	Employee(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee id");
		Empid=s.nextInt();
		System.out.println("Enter employee name:");
		name=s.next();
		System.out.println("Enter employee salary");
		salary=s.nextInt();
		System.out.println("Enter employee address:");
		address=s.next();
		}
}
class Teacher extends Employee{
	String department;
	String subject;
	Teacher(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter department name:");
		department=s.next();
		System.out.println("Enter subject:");
		subject=s.next();
		System.out.println();
		}
	void display(){
		System.out.println("Emp id:"+Empid);
		System.out.println("Emp Name:"+name);
		System.out.println("Emp Salary:"+salary);
		System.out.println("Emp address"+address);
		System.out.println("Department:"+department);
		System.out.println("Subject:"+subject);
		}
}
class Inherit{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of teachers");
		int n=s.nextInt();
		Teacher[] teacher=new Teacher[n];
		for(int i=0;i<n;i++){
			teacher[i]=new Teacher();
			}
			System.out.println("Details of teacher:");
			for(int i=0;i<n;i++){
				System.out.println();
				teacher[i].display();
			}
		}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
