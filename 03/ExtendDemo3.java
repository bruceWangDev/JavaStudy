/*
子父类中的函数：

覆盖，重写

当子类出现和父类一模一样的的函数时，
当子类对象调用该函数，会运行子类函数的内容。
如同父类的函数被覆盖一样。

这种情况是函数的另一个特性：重写（覆盖）

当子类继承了父类，沿袭了父类的功能到子类中，
但是子类虽具备该功能，但是功能的内容却和父类不一致，
这时，没有必要定义新功能，而是使用覆盖特性，保留父类的功能定义，并重写功能内容。


注意事项：
1.子类覆盖父类，必须保证子类权限大于等于父类权限，才可以覆盖，否则，编译失败。

2.静态只能覆盖静态。

记住：
重载：只看同名函数的参数列表
重写：子父类方法要一模一样的。包括返回值类型。
 */

class Fu {

	void show(){
		System.out.println("fu show");
	}

	void speak(){
		System.out.println("vb");
	}
}

class Zi extends Fu {
	
	void show(){
		System.out.println("zi show");
	}

	void speak(){
		System.out.println("java");
	}
}

class Tel {
	void show(){
		System.out.println("number");
		// System.out.println("name");
	}
	// void lingsheng(){}
}

class newTel extends Tel{
	void show(){
		super.show();
		// System.out.println("number");	
		System.out.println("name");
		System.out.println("pic");
	}
}

class ExtendDemo3 {

	public static void main(String[] args){

		System.out.println("Hello World!");

		Zi z = new Zi();
		z.show();
	}
}