/*

异常的处理：
java提供了特有的语句进行处理
try{
	
	需要被检测的代码;

}catch(异常类 变量){
	
	处理异常的代码;(处理方式)

}finally{
	
	一定会执行的语句;

}

3.对捕获到的异常对象进行常见的方法操作
	String getMessage(); 获取异常的信息

对多异常的处理。
1.声明异常时，建议声明更为具体的异常。这样处理的可以更具体。
2.对方声明几个异常，就对应有几个catch块。不要定义多余的catch块
	如果多个catcg块中的异常出现继承关系，父类异常catch块放在最下面。

建议在进行catch处理时，catch中一定要定义具体处理方式。
不要简单的定义一句 e.printStackTrace();
也不要简单就书写一条输出语句。

 */

class Demo {

	int div(int a, int b)throws ArithmeticException, ArrayIndexOutOfBoundsException // 在功能上通过throws的关键字声明了该功能有可能会出现问题。
	{
		int[] arr = new int[a];
		System.out.println(arr[4]);

		return a / b;
	}
}

class ExceptionDemo {
	public static void main(String[] args){ // throws Exception {

		Demo d = new Demo();
		// int x = d.div(4,1);
		// System.out.println("x="+x);

		try{
			int x = d.div(5,1);
			System.out.println("x="+x);
		}
		catch(ArithmeticException e){ // Exception e = new ArithmeticException();
			System.out.println("除0了");
			// System.out.println(e.getMessage()); // / be zero
			// System.out.println(e); // java.lang.ArithmeticException: / by zero
			// 异常名称，异常信息
			e.printStackTrace();
			// 异常名称，异常信息，异常位置
			// 其实jvmm默认的异常处理机制，就是调用printStackTrace()方法。
			// 打印异常的堆栈的跟踪信息。
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
			System.out.println("角标越界了");
		}

		System.out.println("over");
	}
}