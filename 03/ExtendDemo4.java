/*
3.子父类中的构造函数

在对子类对象进行初始化时，父类的构造函数也会运行，
那是因为子类的构造函数默认第一行有一条隐式的语句 super();
super();会访问父类中空参数的构造函数。而且子类中所有的构造函数默认第一行都是super();

为什么子类一定要访问父类中的构造函数？

因为父类中的数据子类可以直接获取。所以子类对象在建立时，需要先查看父类是如何对这些数据进行初始化的。
所以子类在对象初始化时，要先访问一下父类中的构造函数。
如果要访问父类中指定的构造函数，可以通过手动定义super语句的方式来指定。

注意：super语句一定定义在子类构造函数的第一行。


子类的实例化过程：
结论：
子类的所有的构造函数，默认都会访问父类中空参数的构造函数。
因为子类每一个构造函数内的第一行都有一句隐式的super();

当父类中没有空参数的构造函数时，子类必须手动通过super()语句形式来指定要访问父类中的构造函数。

当然：子类的构造函数第一行也可以手动指定this语句来访问本类中的构造函数。
子类中至少会有一个构造函数会访问父类中的构造函数。
 */
class Fu { // extends Object

	Fu(){
		System.out.println("fu run");
	}

}
 
class Zi extends Fu {

	Zi(){
		// 子类的第一行有一条隐式的语句
		// suepr();
		System.out.println("zi run");
	}

	Zi(int x){
		System.out.println("zi run ... "+x);
	}
}

// --

class Person {

	private String name;
	Person(String name){
		this.name = name;
	}

	void show(){}
}

class Student extends Person {

	Student(String name){
		super(name);
	}

	void metod(){
		super.show();
	}
}

class ExtendDemo4 {

	public static void main(String[] args){

		System.out.println("Hello World!");

		// Zi z = new Zi();

		Zi z1 = new Zi(1);
	}
}