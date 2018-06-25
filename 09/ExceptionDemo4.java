/*
finally代码块：定义一定执行的代码。
通常用于关闭资源。

 */

class FuShuException extends Exception {
	
	FuShuException(String msg, int value){
		super(msg);
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

class ExceptionDemo4 {
	public static void main(String[] args){

		Demo d = new Demo();

		try{

			int x = d.div(4,1);
			System.out.println("x="+x);
		}catch(FuShuException e){

			System.out.println(e.toString());
		}finally{

			System.out.println("finally");	// finally 中存放的是一定会被执行的代码
		}


		System.out.println("over");
	}
}