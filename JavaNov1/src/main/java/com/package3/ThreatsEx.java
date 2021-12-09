package com.package3;


class ThreadOne extends Thread{ //First way to create a thread
	@Override
	public void run() { //code should be written inside the run method 
		// TODO Auto-generated method stub
		System.out.println("thread 1");
	}
}
class ThreadTwo implements Runnable{ //second way to create a thread

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread 2");
	}
	
}
class ThreadThree extends Thread{ //extra example 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread 3");
	}
}


public class ThreatsEx {
	
	public static void main(String[] args) { //sorting the threads
		ThreadOne tone = new ThreadOne();
		tone.start();   //how to begin the selected thread
		
		ThreadThree tthree=new ThreadThree();
		tthree.start();
		
		Thread ttwo = new Thread(new ThreadTwo()); //this is going to begin the runnable thread
		ttwo.start();
		
		//how to set the priority (1 - least priority, 10 - most priority)
		tone.setPriority(3);
		ttwo.setPriority(8);
		System.out.println("tone prior" + tone.getPriority());
		System.out.println("ttwo prior" + ttwo.getPriority());
		System.out.println("tthree prior" + tthree.getPriority());
		
		//the join method stops other methods 
		//yield gives another thread, with the same priority, a chance
		//sleep halts the thread for a set amount of time(long millis - milliseconds)
		try {
			tone.join(); //tthree, which is ready to run, will be halted and will wait until tone has done its job
			ttwo.yield();
			tthree.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < args.length; i++) {
			
		}
	}

}
