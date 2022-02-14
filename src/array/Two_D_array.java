package array;
import java.util.Scanner;
public class Two_D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new  Scanner(System.in);
		int a[] [] = new int[3][3];
		
		for(int row =0;row<a.length;row++)
		{
			for(int col=0;col<a[row].length;col++)
		{
				a[row][col]=sn.nextInt();
				
			}
		}
		
		for (int row=0;row<a.length;row++) 
		{
			for (int col=0;col<a[row].length;col++)
			{
				System.out.print(a[row][col]+"\t");
			}
			System.out.println();
			}
		}

	}


