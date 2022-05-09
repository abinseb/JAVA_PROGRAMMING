//Read a matrix from the console and check whether it is Symmetric or not
import java.io.*;
import java.util.Scanner;
class Matrix{
public static void main(String[] a){
Scanner m = new Scanner(System.in);
System.out.println("enter the row = ");
int r1 = m.nextInt();
System.out.println("enter the column = ");
int c1 = m.nextInt();
int m1[][] = new int[20][20];
int m2[][] = new int[20][20];
int flag=0;

int i,j;
System.out.println("enter 1st matrix");
	for(i=0;i<r1;i++)
	{
	for(j=0;j<c1;j++)
	{
	m1[i][j]=m.nextInt();
	}
	} 
System.out.println("Matrix");

                for(i=0;i<r1;i++)
		{
		for(j=0;j<c1;j++)
		{
		System.out.print(m1[i][j]+"\t");
		}
		System.out.println("");
		}
        
	 for(i=0;i<r1;i++)
	{
	for(j=0;j<c1;j++)
	{
	m2[i][j]=m1[j][i];
	}
	
	}
System.out.println("Transpose");

                for(i=0;i<r1;i++)
		{
		for(j=0;j<c1;j++)
		{
		System.out.print(m2[i][j]+"\t");
		}
		System.out.println("");
		}
if(r1!=c1)
{
System.out.println("Not square matrix");
}
else
{
          boolean symmetric = true;
             
            for (i = 0; i < r1; i++)
            {
                for ( j = 0; j < c1; j++)
                {
                    if(m1[i][j] != m1[j][i])
                    {
                        symmetric = false;
                        break;
                    }
                }
            }
        if(symmetric)
	{
	System.out.println("Symmetric");
	}
	else
	{
	System.out.println("Not Symmetric");
	}
}      
}
}
