package exceptionhandling;
import java.util.Scanner;
import java.util.Random;

public class Game {
	int value;

	public Game() {
		// TODO Auto-generated method stub
		Random random=new Random();
		value=random.nextInt(50);
		//System.out.println("Value");
		void guess(int number) throws  CustomException {
			if(number<value) {
				System.out.println("You Entered Greater Number");
			}
			else if(number>value) {
				//throws new CustomException("GreaterNumberException");
				System.out.println("You Entered Smaller Number");
			}
			else {
				System.out.println("Congratulation..!You Won");
				System.exit(0);
			}
				
			}
		public static void main (String[]args)throws CustomException {
			Scanner sc=new Scanner(System.in);
			Game obj =new Game();
			do {
				System.out.println(" Please Enter Your Guess:: ");
			}
		}
			
		
	
			
		
		
		
		

	

