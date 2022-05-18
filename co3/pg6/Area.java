import java.util.*;
interface Shape{
public void area(int r);
public void perimeter(int r);
}
class Circle implements Shape
{
int r;
float a1,p1;
public void area(int r)
{
	
	int ar = 2*(r*r);
	double fi = 3.14 * ar;
	System.out.println("Area = "+fi);
		
}
public void perimeter(int r)
{
	double p = 2*3.14*r;
	System.out.println(" Perimeter = "+p);
	
}
}
class Area
{
public static void main(String abu[])
{
Scanner c =new Scanner(System.in);
	System.out.println("enter the radius");
	int r = c.nextInt();
Shape ll = new Circle();
ll.area(r);
ll.perimeter(r);
}
}
