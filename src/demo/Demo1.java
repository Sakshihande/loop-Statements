package demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		int f=0; int l = 0;
		System.out.println("Enter the number of test case");
		int T=sc.nextInt();
		while(T-->0) {
			int n=sc.nextInt();
			int[]a=new int[T];
			int[]b= new int[T];
			for(int i=0;i<=a.length;i++) {
			int n1=a[i];
			l=n1%10;
			while(n1!=0) {
				f=n1%10;
				n1=n1/10;
			}
			b[i]=f+l;
			f=0;
			l=0;
			}
			
			System.out.println("Sum of first and last digit");
					
					
					
			
				
			}
		}

	}


