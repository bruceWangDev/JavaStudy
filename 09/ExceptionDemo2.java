/*
因为项目中会出现特有的问题
而这些问题并未被java所描述并封装对象
所以对于这些特有的问题可以按照java的堆问题封装的思想。
将特有的问题，进行自定义的异常封装。

自定义异常。

需求：在本程序中，对于除数是负数，也视为是错误的，是无法进行运算的。
那么就需要对这个问题进行自定义的描述。

当在函数内部出现throw抛出异常对象，那么就必须给出对应的处理动作。
要么在内部try catch处理。
要么在函数上声明让调用者处理。

一般情况下，函数内出现异常，函数上需要声明。

发现打印的结果中只有异常的名称，却没有异常的信息。
因为自定义的异常并未定义信息。

如何定义异常信息呢？
因为父类中已经把异常信息的操作都完成了。
所以子类只要在构造时，将异常信息通过super语句传递给父类
那么就可以直接通过getMessage方法获取自定义的异常信息。


注意：自定义异常：
必须是自定义类继承Exception。

继承Exception原因：
异常体系有一个特点：因为异常类和异常对象都需要被抛出。
他们都具备可抛性，这个可抛性是Throwable这个体系中的独有特点。

只有这个体系中类和对象才可以被throw和throws操作。

throws和throw的区别：
throws使用在函数上。
throw使用在函数内。

throws 后面跟的异常类，可以跟多个，用逗号隔开。
throw 后面跟的是异常对象。

 */

// 自定义异常类，建立它的目的为了建立对象
class FuShuException extends Exception {

	private int value;

	// private String msg;
	FuShuException(String msg, int value){
		// this.msg = msg;
		super(msg);
		this.value = value;
	}
	// public String getMessage(){
	// 	return msg;
	// }

	public int getValue(){
		return value;
	}
}

class Demo {

	int div(int a, int b) throws FuShuException
	{
		if(b < 0){
			throw new FuShuException("出现了除数是负数的情况~~~", b); // 手动通过throw关键字抛出一个自定义异常对象。
		}
		return a / b;
	}
}

class ExceptionDemo2 {
	public static void main(String[] args){

		Demo d = new Demo();

		try{
			int x = d.div(4,-9);
			System.out.println("x="+x);


		}catch(FuShuException e){
			System.out.println(e.toString());
			// System.out.println("除数出现负数了 ... ");
			System.out.println(e.getValue());
		}

		System.out.println("over");
	}
}