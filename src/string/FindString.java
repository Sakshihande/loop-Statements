package string;
import java.util.Scanner;
public class FindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="There is nothing impossible to they who will try.";
		Scanner sc=new Scanner(System.in);
		System.out.print("Which string are are you find:");
		String find=sc.next();
		String[]str2=str.split(" ");
		int cnt=0;
		
		for(int i=0;i<str2.length;i++) {
			if(str2[i].equals(find)) {
				cnt++;
				break;
				
			}
		}
			
		if(cnt>0)
			System.out.println(find+"Your string is Found");
		else
			System.out.println("Sorry your String is not find");
	}


		

	}


