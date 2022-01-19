package conditionalLoops;

public class Left_Triangle_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row = 6;       
		//Outer loop work for rows  
		for (i=0; i<row; i++)   
		{  
		
		for (j=2*(row-i); j>=0; j--)         
		{        
		System.out.print(" ");   
		}   
		 
		for (j=0; j<=i; j++ )   
		{   
		     
		System.out.print("* ");   
		}   
		
		System.out.println();   
		}   
		}   
	}


