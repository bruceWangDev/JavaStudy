class Sequence {

	{
		System.out.println("构造代码块");
	}

	static {
		System.out.println("静态代码块");
	}

	Sequence(){
		System.out.println("构造函数");
	}

	public static void show(){
		System.out.println("静态方法，类名调用");
	}
}

class SequenceDemo {

	public static void main(String[] args){

		System.out.println("Hello World!");

		 // Sequence s = new Sequence();
		/*
		静态代码块
		构造代码块
		构造函数
		 */

		Sequence.show();

		/*
		静态代码块
		静态方法，类名调用
		 */

	}
}