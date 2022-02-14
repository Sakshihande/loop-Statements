package patern01;
import java.util.Scanner;
public class TriangleDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first angle:");
		int A =sc.nextInt();
		System.out.print("Enter second angle:");
			int B =sc.nextInt();
			System.out.print("Enter third angle:");
			int C=sc.nextInt();
			int angleSum=A+B+C;
			/*
			 * if sum of angle is 180 and
			 * angleA,angleB,angleC is not 0 then
			 * triangle is valid
			 */
			if(angleSum==180 && A>0 && B>0 && C>0) {
				
				System.out.println("Triangle is valid:" );
			}
			else {
				System.out.println("Triangle is not valid");
		
			
			 }
		sc.close();
		}
		
}


