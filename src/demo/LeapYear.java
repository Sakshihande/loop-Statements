package demo;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2022;
		int leap=0;
		System.out.println(" 20 leap year");
		while (leap<=20) {
			if(year%4==0) {
				System.out.print(year+ " ");
				leap++;
				
			}
			year++;
		}
		

	}

}
