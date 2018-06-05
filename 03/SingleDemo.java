// 饿汉式
class Single1 {

	// 将构造函数私有化
	private Single1(){}

	// 在类中创建一个本类对象
	private static Single1 s = new Single1();

	// 提供一个方法可以获取到该对象
	public static Single1 getInstance(){
		return s;
	}
}

// 懒汉式
class Single2 {

	private Single2(){}

	private static Single2 s = null;

	public static Single2 getInstance(){
		if(s == null){
			synchronized(Single2.class){ // 上锁
				if(s == null){
					s = new Single2();
				}
			}
		}
		return s;
	}
}

class SingleDemo {

	public static void main(String[] args){

		System.out.println("Hello World!");

		Single1 s1 = Single1.getInstance();

		Single2 s2 = Single2.getInstance();
	}
}