package threads;

public class Fibonacci implements Runnable
		{
			int[] fib;
		 
			public static void main(String[] args)
			{
				int[] answer = new Fibonacci(10).getFib();
				System.out.println(answer[9]);
			}
		 
			public Fibonacci(int num)
			{
				this.fib = new int[num];
				new Thread(this).start();
				try
				{
					Thread.sleep(1);
				}
				catch (InterruptedException exception)
				{}
			}
		 
			public void run()
			{
				synchronized (this.fib)
				{
					this.fib[0] = 1;
					this.fib[1] = 1;
					for (int i = 2; i < this.fib.length; i++)
					{
						this.fib[i] = this.fib[i - 1] + this.fib[i - 2];
					}
				}
			}
		 
			public int[] getFib()
			{
				return this.fib;
			}
		
	}


