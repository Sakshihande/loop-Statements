package exceptionhandling;

public class CustomExceptionDemo {
	public static void validForVote(int age)throws Exception
	{
		if(age<18)
		{
			throw new Exception("NotValidForVote");
		}
		
		
			
	}
	public static void main(String[]args)  throws Exception{
		
		validForVote(10);
	}


}
