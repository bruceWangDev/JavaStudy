/*
单例设计模式。

懒汉式

class Signle {
	
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance){
		return s;
	}
}

 */

// 懒汉式 - 延时加载
class Single {
	private static Single s = null;
	private Single(){}
	public static Single getInstance(){
		if(s == null){
			synchronized(Single.class){ // 该类所属的字节码文件
				if(s == null){
					s = new Single();
				}
			}
		}
		return s;
	}
}

class SingDemo {

	public static void main(String[] args){

		System.out.println("Hello World!");
	}
}