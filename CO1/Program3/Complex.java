//Add complex number 

import java.io.*;
class Complex
{
   double real,image;


Complex(double i, double j)
{
this.real=i;
this.image=j;
}

public static Complex sum(Complex c1, Complex c2)
{
Complex c=new Complex(0,0);
c.real=c1.real+c2.real;
c.image=c1.real+c2.real;
return c;
}
public static void main(String args[])
{
Complex c1=new Complex(2,3);
Complex c2=new Complex(4,5);
Complex c=sum(c1,c2);
System.out.printf("Sum is: "+ c.real+" + "+c.image +"i");
}
}
