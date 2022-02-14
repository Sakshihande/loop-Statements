package demo;

public class MultipleOf5and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10,sum=0;
		while(n<=100) {
			if(n%3==0 && n%5==0) {
				sum=sum+n;
				System.out.println(n+" ");
				
			}
			n++;
			
		}
		System.out.println("\nSum:" +sum);

	}

}
