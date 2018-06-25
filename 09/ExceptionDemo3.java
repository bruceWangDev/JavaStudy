

/*
Exception中有一个特殊的子类异常runtimeException 运行时异常。
如果在函数内容抛出该异常，函数上可以不用声明，编译一样通过。
如果在函数上声明了该异常，调用者可以不用进行处理，编译一样通过。

之所以不用在函数上声明，是因为不需要让调用者处理。
当该异常发生，希望程序停止。因为在运行时，出现了无法继续运算的情况，希望程序停止后，
对代码进行修改。


自定义异常时：如果该异常的发生，无法在继续进行运算，
就让自定义异常继承runtimeException。

 */

class Demo {

	int div(int a, int b)  
	{
		if(b == 0){
			throw new ArithmeticException("被零除了.."); // 手动通过throw关键字抛出一个自定义异常对象。
		}
		return a / b;
	}
}

class ExceptionDemo3 {

	public static void main(String[] args){

		Demo d = new Demo();

		// try{

			int x = d.div(4,0);
			System.out.println("x="+x);

		// }catch(ArithmeticException e){

			System.out.println(e.toString());

		// }

		System.out.println("over");
	}
}