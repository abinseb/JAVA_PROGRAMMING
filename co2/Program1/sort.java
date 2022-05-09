//program to sort strings
import java.util.Scanner;
class sort{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int i,j;
	String temp;
	System.out.println("Enter the number of strings you want to enter:");
	int n=sc.nextInt();
	String[] str=new String[n];
	Scanner s=new Scanner(System.in);
	System.out.println("enter the strings");
	for(i=0;i<n;i++)
	{
		str[i]=s.nextLine();
	}
	for(i=0;i<n;i++)
	{	
		for(j=i+1;j<n;j++){
			if(str[i].compareTo(str[j])>0){
				temp=str[i];
				str[i]=str[j];
				str[j]=temp;
				}
			}
	}
	System.out.println("sorted strings:");
	for(i=0;i<n;i++){
	System.out.println(str[i]);
	}
}
}
	
