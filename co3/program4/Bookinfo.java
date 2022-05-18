/* Write a program has class Publisher, Book, Literature and Fiction. Read the information and print the details of books from either the category, using inheritance.  */

class Publisher{
	String pname;
	Publisher(String P){
		pname=P;
	}
	void display(){
		System.out.println("Publisher name:"+pname);
	}
}
class Book extends Publisher{
	String bookname;
	Book(String P,String B){
		super(P);
		bookname=B;
		}
	void display(){
		super.display();
	System.out.println("Book name:"+bookname);
	}
}
class Literature extends Book{
	String lname;
	Literature(String P,String B,String L){
		super(P,B);
		lname=L;
		}
	void display(){
		super.display();
		System.out.println("Literaure name:"+lname);
		}
}
class Fiction extends Book{
	String fname;
	Fiction(String P,String B,String F){
		super(P,B);
		fname=F;
	}
	void display(){
		super.display();
		System.out.println("Fiction name:"+fname);
	}
}
class Bookinfo{
	public static void main(String[] args){
		Literature obl=new Literature("PrakashBooks","Freedom at Midnight","A speech of javaharlal nehru");
		Fiction obf=new Fiction("NCR","A Indian women","Shwetha pathma");
		System.out.println("Literature");
		System.out.println("________________________");
		obl.display();
		System.out.println();
		System.out.println("Fiction");
		System.out.println("____________________________");
		obf.display();
		}
}
		











		
	
	

