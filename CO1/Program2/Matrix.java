//Read two matrices from the console and perform matrix addition
import java.io.*;
import java.util.Scanner;
class Matrix
{
public static void main(String[] a){
Scanner m = new Scanner(System.in);
System.out.println("enter the row = ");
int r1 = m.nextInt();
System.out.println("enter the column = ");
int c1 = m.nextInt();
System.out.println("enter the row = ");
int r2 = m.nextInt();
System.out.println("enter the column = ");
int c2 = m.nextInt();
int m1[][] = new int[20][20];
int m2[][] = new int[20][20];
int am[][] = new int[20][20];
int i,j;
if(r1==r2 && c1==c2){
System.out.println("enter 1st matrix");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
m1[i][j]=m.nextInt();
}
} 
System.out.println("enter second matrix");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
m2[i][j]=m.nextInt();
}
}
System.out.println("sum of matrix");

for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
am[i][j]=m1[i][j]+m2[i][j];
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.print(am[i][j]+"\t");
}
System.out.println("");
}


}
else
{
System.out.print("cannot add this matrix");
}



}
}
