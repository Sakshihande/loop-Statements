package array;
import java.util.Scanner;
public class Insert_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,pos, x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements you want in array.");
		n=sc.nextInt();
		int a[]=new int [n+1];
		
		System.out.println("Enter all the elements:");
		for(int i =0;i<n;i++) {
			a[i]=sc. nextInt();
			
		}
		System.out.println("Enter the position where you want to insert element:");
		pos=sc.nextInt();
		System.out.println("Enter the element you want to insert:");
		x=sc.nextInt();
		 for(int i = (n-1); i >= (pos-1); i--)
	        {
	            a[i+1] = a[i];
	        }
	        a[pos-1] = x;
	        System.out.print("After inserting:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	        System.out.print(a[n]);
	    }
	
			}
		




