class shape{
double x;
shape(double a){
	x=a;
	}
}
class rectangle extends shape{
	double y;
rectangle(double a,double b){
	super(a);
	y=b;
}
void area(double x,double y){
System.out.println("Area of rectangle"+(x*y));
}
}
class square extends shape{
square(double a){
super(a);
}
void area(double a){
System.out.println("Area of square is:"+(x*x));
}
}
class circle extends shape{
circle(double a){
	super(a);
	}
void area(double a){
	System.out.println("Area of circle is:"+(2*3.14*x));
	}
}
class Area{
public static void main(String[] args){
	rectangle r=new rectangle(8,4);
	square s=new square(5);
	circle c=new circle(4);
	shape ref;
	r.area(4,5);
	ref=r;
	s.area(5);
	ref=s;
	c.area(6);
	ref=c;
}
}


