package exceptionhandling;

public class TryCatchExample {
	int var =100;
	TryCatchExample obj;
public	TryCatchExample(String msg) {
	try {
		System.out.println(obj.var);
	}catch(NullPointerException e) {
		System.out.println(e);
		
	}
}


public static void main(String[]args) {
	TryCatchExample object = new TryCatchExample("abc"); 
	int a=10;
	try {
		int x=a/0;
	
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e);
		
	}
	System.out.println("End of program");
}
}
