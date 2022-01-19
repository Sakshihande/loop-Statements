package Demo_Loop;
import java.io.*;
public class Pscale_Triangle {

	public static void  print Pascal(int n) {
		// TODO Auto-generated method stub
		 for (int line = 1; line <= n; line++) {
	            for (int j = 0; j <= n - line; j++) {
	                System.out.print(" ");
	            }
	
	            int C = 1;
	            for (int i = 1; i <= line; i++) {
	                System.out.print(C + " ");
	                C = C * (line - i) / i;
	            }
	            System.out.println();
	            public static void main(String[] args)
	            {
	                int n = 4;
	                printPascal(n);
	            }
	        
	        
	    }
	 
	    
	