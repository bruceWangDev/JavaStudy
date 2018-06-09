
/*
异常：就是程序在运行时出现的不正常情况。
异常由来：问题也是现实生活中一个具体的事物，也可以通过Java的类的形式进行描述，并封装成对象。
		其实就是Java对不正常情况进行描述后的体现。

对于问题的划分，它分为两种：一种是严重的问题，一种是非严重的问题。

对于严重的，java通过Error类进行描述。
	对于errory一般不编写针对性的代码对其进行处理。

对于非严重的，java通过Exception类进行描述。
	对于exception可以使用针对性的处理方式进行处理。

无论error或者exception都具有一些共性内容。
比如：不正常情况的信息，引发原因等。

Throwable // 所有错误和异常的超类
	Error

	Exception

 */

class Demo {
	int div(int a, int b){
		return a/b;
	}
}

class ExceptionDemo {

	public static void main(String[] args){

		// Demo d = new Demo();
		// int x = d.div(4,0);

		// System.out.println("x="+x);
		// System.out.println("over");

		// byte[] arr = new byte[1024*1024*1400];
	}
}
