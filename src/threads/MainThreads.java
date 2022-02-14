package threads;

public class MainThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
             Fibonacci1 fib = new Fibonacci1();
             fib.start();
             fib.sleep(5000);
             Reverse rev = new Reverse();
             rev.start();
        }
        catch (Exception ex)
        {
             ex.printStackTrace();
        }
   }


	}


