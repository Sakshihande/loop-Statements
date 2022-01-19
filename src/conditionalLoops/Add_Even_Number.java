package conditionalLoops;
import java.util.Scanner;
public class Add_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i, num, sum=0;
        Scanner sn=new Scanner(System.in);
        System.out.println("enter number");
        num=sn.nextInt();
        for(i=2;i<=num;i=i+2) {
        	sum=sum+i;
        }
        System.out.println(sum);
        }
	}


