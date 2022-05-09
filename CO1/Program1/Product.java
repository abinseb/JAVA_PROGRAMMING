//Define a class 'Product' with data members pcode,pname and price.create three objects of the class and find the product having the lowest price.

import java.io.*;
class Product{
	public static void main(String[] a)
	{
		Create k = new Create();
		Create k1 = new Create();
		Create k2 = new Create();
		k.pcode = 123;
		k.pname = "bat";
		k.price = 234;
		k1.pcode = 566;
		k1.pname = "ball";
		k1.price = 76;
		k2.pcode = 111;
		k2.pname = "stump";
		k2.price = 989;
		System.out.println("Lowest Price");
		if(k.price<k1.price && k.price<k2.price)
		{
			
			System.out.println("Product code = "+k.pcode);
			System.out.println("Product name = "+k.pname);
			System.out.println("Product price = "+k.price);
		}
		else if(k1.price<k2.price)
		{
			System.out.println("Product code = "+k1.pcode);
			System.out.println("Product name = "+k1.pname);
			System.out.println("Product price = "+k1.price);
		}
		else
		{
			System.out.println("Product code = "+k2.pcode);
			System.out.println("Product name = "+k2.pname);
			System.out.println("Product price = "+k2.price);
		}

	}	
}
class Create{
int pcode;
String pname;
double price;
}
