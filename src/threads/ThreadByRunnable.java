package threads;

public class ThreadByRunnable implements Runnable{
	int time;
	Thread thread;
	public ThreadByRunnable(int time,String name) {
		this.time=time;
		thread=new Thread(this,name);
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread ());
			System.out.println(thread.getState());
			try {
				Thread.sleep(time);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			thread.setName("Hello");
			thread.getName();
		}
			System.out.println("Thread State"+thread.getState());
			System.out.println("Thread is live"+thread.isAlive());
			System.out.println("Class of thread"+thread.getClass());
			System.out.println("Active counts"+thread.activeCount());
		}
		
	}


