package threads;

public class ThreadByThread  extends Thread{
	int time;
	public ThreadByThread(int time) {
		this.time=time;
		start();
	}
	
	public void run() {
		//ToDo Auto-generated method stub
		super.run();
		for( int i=0; i<5;i++) {
			System.out.println(Thread.currentThread());
			try {
				sleep(time);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
