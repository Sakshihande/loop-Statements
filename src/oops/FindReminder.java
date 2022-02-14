package oops;
import java.util.Scanner;
public class FindReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
int T=sc.nextInt();
for(int tc=0;tc<T;tc++) {
	int A=sc.nextInt();
	int B = sc.nextInt();
	System.out.print(solve(A,B));
}
sc.close();
	}
	static int solve(int A, int B) {
		return A % B;
}







	}


