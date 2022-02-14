package demo;
import java.util.Scanner;
public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Diamond number pattern rows =");
		int rows=sc.nextInt();
		System.out.println("Printing diamond number pattern");
		for(i=1;i<=rows;i++)
			
		{
			for(j=1;j<=rows-i;j++) {

				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(i=rows-1;i>0;i--) {
			for(j=1;j<=rows-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i*2-1;k--) {
				System.out.print(k);
			}
			System.out.println();
			
			}
			
		}
		

	}


