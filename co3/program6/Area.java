/*Create an interface having prototype of function area() and perimeter().Create two classes Circle and Rectangle which implements the above interfce.Create a menu driven program to find area and perimeter of objects.*/

import java.util.Scanner;

interface Shape{
	public void area();
	public void perimeter(int r);
	}
class Circle implements Shape{
	
	public void area(){
	Scanner ll = new Scanner(System.in);
	System.out.println("enter the radius");
	int r= ll.nextInt();
		System.out.println("Area of the circle:"+(3.14*(r*r)));
		perimeter(r);
		}
	public void perimeter(int r){
		System.out.println("Perimeter of Circle:"+(2*(3.14)*r));
		}
	
}
class Rectangle implements Shape{
	int l,b;
	public void area(){
	Scanner ll = new Scanner(System.in);
	System.out.println("enter length and breadth");
		l = ll.nextInt();
		b= ll.nextInt();
		int d =l*b;
		System.out.println("Area of Rectangle"+d);
		perimeter(d);
		
	}
	public void perimeter(int b){
		System.out.println("Perimeter of Rectangle is:"+(2*b));
	}
}
class Area{
	public static void main(String[] args){
		
		Shape s=new Circle();
		s.area();
		Shape k = new Rectangle();
		k.area();
		}
		}
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
