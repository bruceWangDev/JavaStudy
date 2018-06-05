/*
子父类出现后，类中成员的特点：

类中成员包含三个部分：
1.变量
2.函数
3.构造函数

1.变量
如果子父类中出现了非私有的同名成员变量时，
子类要访问本类中的变量，用this
子类要访问父类中的同名变量，用super

super的使用和this的使用几乎一致。
this	代表的是本类对象的引用。
super  	代表的是父类对象的引用。

2.子父类中的函数

 */

class Fu {

	int num = 4;
}

class Zi extends Fu{

	// int num = 5;
	void show(){
		System.out.println(super.num);
		// System.out.println(this.num);
	}
}

class ExtendDemo2 {

	public static void main(String[] args){

		System.out.println("Hello World!");

		Zi z = new Zi();
		// System.out.println(z.num+"..."+z.num);
		z.show();
	}
}