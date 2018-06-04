/*
	设计模式：解决某一类问题最行之有效的方法。
	Java中有23种设计模式：
	单例设计模式：解决一个类在内存中只存在一个对象。

	想要保住对象唯一。
	1.为了避免其他程序过多建立该类对象。先禁止其他程序建立该类对象。
	2.还为了让其他程序可以访问该类对象，只好在本类中，自定义一个对象。
	3.为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。

	这三步怎么用代码体现？
	1.构造函数私有化
	2.在类中创建一个本类对象
	3.提供一个方法可以获取到该对象


	对于事物该怎么描述，还怎么描述。
	当需要将事物的对象保证在内存中唯一时，就将以上的三步加上即可。
 */

class Single {

	private Single(){}

	private static Single s = new Single();

	public static Single getInstance(){
		return s;
	}
}

class SingleDemo {  

	public static void main(String[] args){

		// Single.getInstance();

		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();

		// 比如配置文件 .. 
	}
}

class Student {

	private int age;

	private Student(){}
	private static Student s = new Student();
	public static Student getStudent(){
		return s;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
