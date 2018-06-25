
/*
	
	为了简化类名的书写，使用一个关键字，import 

	import 导入的是包中的类。
	建议：不要写通配符*，需要用到包中哪个类，就导入哪个类
 */
import packa.DemoA;
import packb.*; // 通配符


/*
package 包不在当前目录下
需要设置classpath，告诉jvm去哪里去找指定的包

总结：包和包之间进行访问，被访问的包中的类以及类中的成员，需要public修饰。

不同包中的子类可以直接访问父类中被protected权限修饰的成员。

包于包之间可以使用的权限只有两种，public protected。


			public 		protected 		default		 private 
同一个类中	 ok 			ok			  ok			ok	
同一个包中	 ok				ok			  ok
子类			 ok				ok 			  
不同包中    	 ok 
 */

package pack;

class PackageDemo { 

	public static void main(String[] args){

		System.out.println("111");

		// packa.DemoA a = new packa.DemoA();
		// a.show();

		packb.DemoB = new packb.DemoB();
		d.method();
	}
}