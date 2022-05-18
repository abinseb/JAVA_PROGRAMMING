/* Create classes Student and Sports. Create another class Result inherited from Student and Sports. Display the academic and sports score of a student*/
import java .io.*;
import java.util.Scanner;
interface Student{
	public void Details(Scanner read);
	public void AcademicScore(Scanner read);
	}
interface Sports{
	public void Score(Scanner read);
}
class Result implements Student,Sports{
	String Sname;
	int Rollno,Max,Mark,Score;
	Result(Scanner read){
		Details(read);
		AcademicScore(read);
		Score(read);
	}
	public void Details(Scanner read){
		System.out.println("Enter Student Name :");
		Sname=read.nextLine();
		System.out.println("Roll number of the Student :");
		Rollno=Integer.parseInt(read.nextLine());
	}
	public void AcademicScore(Scanner read){
		System.out.println("Enter the Maximum mark  :");
		Max=read.nextInt();
		System.out.println("Enter the mark optained  :");
		Mark=read.nextInt();
		}
	public void Score(Scanner read){
		System.out.println("Enter the Sports score  :");
		Score=read.nextInt();
		}
	void Display(){
		System.out.println("Student Information ");
		System.out.println("Name of tha Student"+Sname);
		System.out.println("Roll number of the Student :"+Rollno);
		System.out.println("Mark optained("+Max+") :"+Mark);
		System.out.println("Mark optained Sports (100):"+Score);
		}
	}
public class Multilevelinheritence{
	public static void main(String[] args){
		Scanner read=new Scanner(System.in);
		Result r= new Result(read);
		r.Display();
		}
	}
		









	
	

