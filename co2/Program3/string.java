import java.util.Scanner;
class string{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println("string"+str);
		System.out.println("length of string"+str.length());
		System.out.println("To upper case:"+str.toUpperCase());
		System.out.println("To lower case:" +str.toLowerCase());
		System.out.println();
		String str1="welcome to java";
		System.out.println("new string:"+str1);
		System.out.println("string concatination:"+str.concat(str1));
		System.out.println("index of word java:"+str1.indexOf("java"));
		System.out.println("index replace to java to python"+str1.replace("java","python"));
		}
}
