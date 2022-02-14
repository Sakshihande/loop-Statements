package exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.RemoteException;

public class Throws_Example {
	 public void m( )throws IOException,RemoteException,Exception
	 {
		 InputStreamReader r =  new InputStreamReader(System.in);
		 BufferedReader brr=new BufferedReader(r);
		 
		 System.out.println("Enter Input");
		  String name=brr.readLine();
		  System.out.println("Method1");
		 
	 }
	 public void n() {
		 try {
			 m();
			
		} catch ( Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		 
	 }
	 public static void main (String[]args) {
		 Throws_Example obj=new Throws_Example();
		 obj.n();
	 }

		 
	 
		 
	 }


