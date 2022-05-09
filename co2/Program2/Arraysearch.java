//search an element in an array
import java.util.Scanner;
public class Arraysearch{
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int i,flag=0;
	System.out.println("Enter the size of array");
	int size=s.nextInt();
	int[] array=new int[size];
	System.out.println("Enter the Elements");
	for(i=0;i<size;i++){
		array[i]=s.nextInt();
	}
	
	
	
	System.out.print("Enter the element want to search");
	int search=s.nextInt();
	for(i=0;i<size;i++){
		if(array[i]==search){
		flag=1;
		break;
		}
	}
	if(flag==1){
	System.out.println("Element found at position"+(i+1));
	}
	else{
	System.out.println("Element not found");
	}
}
}


