
/*
同步函数用的是哪一个锁呢？
函数需要被对象调用，那么函数都有一个所属对象的引用，就是this。
所以同步函数使用的锁是this。

通过该程序进行验证。

使用两个线程来卖票。
一个线程在同步代码块中，
一个线程在同步函数中。
都在执行卖票动作。
 */

class Ticket implements Runnable { // extends Thread {

	private int tick = 100;
	// Object obj = new Object();
	boolean flag = true;
	public void run() {
		if(flag){
			while(true){
				synchronized(this){
					if(tick > 0){
						try{Thread.sleep(10);}catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+" sale : " + tick--);
					}
				}		
			}
		}else{
			while(true){
				show();
			}
		}
	}

	public synchronized void show(){
		if(tick > 0){
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+" shoooooow : " + tick--);
		}
	}
}

class ThisLockDemo {

	public static void main(String[] args){

		Ticket t = new Ticket(); 

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		// Thread t3 = new Thread(t);
		// Thread t4 = new Thread(t);

		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();
		// t3.start();
		// t4.start();
	}
}