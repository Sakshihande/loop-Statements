package oops;

public class Main {
    int i;
   //constructor with no parameter
     private Main() {
	 i=5;
	System.out.println("Constructor is called")	;
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		System.out.println("Value of i:"+obj.i);

	}

}
