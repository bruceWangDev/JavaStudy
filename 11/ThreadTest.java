

/*
 练习：
 创建两个线程，和主线程交替运行。


原来线程都有自己默认的名称
Thread-编号 该编号从0开始

currentThread() 获取当前线程对象
getName 获得线程名称
setName 设置线程名称或者构造函数
 */

class Test extends Thread {

	// private String name;
	Test(String name){
		super(name);
	}

	public void run(){
		for(int i = 0; i < 60; i++){
			System.out.println(Thread.currentThread().getName()+" ... test run ... "+i);
			// 标准调用方式
		}
	}
}

class ThreadTest {

	public static void main(String[] args){

		// System.out.println("Hello World!");
		Test t1 = new Test("1 -- ");
		Test t2 = new Test("2 ++ ");
		t1.start();
		t2.start();



		for(int i = 0; i < 60; i++){
			System.out.println("main ... "+i);
		}

	}
}