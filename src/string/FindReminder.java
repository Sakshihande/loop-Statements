package string;
import java.util.*;


public class FindReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int tc=0 ; tc<t ; tc++) 
		{
			System.out.println("Enter 2 no.");
			int A=sc.nextInt();
			System.out.println("Enter 3 no.");
			int B=sc.nextInt();
			int res=A%B;
			
			System.out.println( "The result is t:"+A%B);
			
}

	}

}
