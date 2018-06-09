
/*
基础班的学生：
	学习，睡觉。

高级班的学生：
	学习，睡觉。


可以将这两类事物进行抽取
 */

abstract class Student {

	abstract void study();

	public void sleep(){
		System.out.println("躺着睡");
	}
}

class DoStudent {

	public static void doSome(Student stu){
		stu.study();
		stu.sleep();
	}
}

class BaseStudent extends Student{

	public void study(){
		System.out.println("base study");
	}

	public void sleep(){
		System.out.println("站着睡");
	}
}

class AdvStudent extends Student {

	public void study(){
		System.out.println("adv study");
	}
}

class DuoTaiDemo3 {

	public static void main(String[] args){

		System.out.println("Hello World!");

		BaseStudent bs = new BaseStudent();
		// bs.study();
		// bs.sleep();
		// doSome(bs);

		DoStudent ds = new DoStudent();
		ds.doSome(bs);

		DoStudent.doSome(bs);

		AdvStudent as = new AdvStudent();
		// as.study();
		// bs.sleep();
		// doSome(as);

	}

	public static void doSome(Student stu){

		stu.study();
		stu.sleep();

		// if(stu instanceof BaseStudent){

		// }else if(stu instanceof AdvStudent){

		// }
	}
}

