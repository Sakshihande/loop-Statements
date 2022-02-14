package oops;

		import java.util.Scanner;

		public class Demo {
			
			String email = "handesakshi1998@gmail.com";
			
			public String display1(String name)
			{
				String s = "Welcome "+name;
				
				return s;
				
			}
			
			public void display2(long contact)
			{
				System.out.println("My Contact number is ::"+contact);
			}

			public String display3()
			{
				String em = email+"";
				return em;
			}
			
			public void display4() {
				System.out.println("My Details::");
			}
			public void display5() {
				System.out.println("My city name");
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Demo obj = new Demo();
				obj.display4();
				String s = obj.display1("Sakshi Hande");
				System.out.println(s);
				obj.display2(880683060);
				String e = obj.display3();
				obj.display5();
				System.out.println("Amravati");
				System.out.println(e);
				
				

				
				
				

			}

		

	}

