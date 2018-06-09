
abstract class Animal {

	public abstract void eat();
}

class Cat extends Animal {

	public void eat(){
		System.out.println("吃鱼");
	}

	public void catchMouse(){
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal {

	public void eat(){
		System.out.println("吃骨头");
	}

	public void seeHome(){
		System.out.println("看家");
	}
}

class Pig extends Animal {

	public void eat(){
		System.out.println("吃饲料");
	}

	public void gongDi(){
		System.out.println("拱地");
	}
}

class DuoTaiDemo2 {

	public static void main(String[] args){

		Animal a = new Cat(); // 类型提升。向上转型。
		a.eat();

		// 如果想要调用猫的特有方法时，如何操作？
		// 强制将父类的引用转成子类的类型。向下转型。
		Cat c = (Cat)a;
		c.catchMouse();

		// 千万不要出现这样的操作，就是将父类对象转成子类类型。
		// 我们能转换的是父类引用指向了自己的子类对象时，该引用可以被提升，也可以被强制转换。
		// 多态自始至终都是子类对象在做着变化。

		function(new Dog());
		function(new Cat());

	}

	public static void function(Animal a){ // Animal c = new Cat(); 
		a.eat();

		if(a instanceof Cat){
			Cat c = (Cat)a;
			c.catchMouse();
		}else if(a instanceof Dog){
			Dog d = (Dog)a;
			d.seeHome();
		}else{
			System.out.println("123");
		}
	}
}

