/*
	需求：数据库的操作。

	数据是用户信息。

	1.连接数据库 JDBC Hibernate
	2.操作数据库
	c create r read u update d delete
	3.关闭数据库连接。

 */

class User {

}

// Data access object DAO
interface UserInfoDao {

	public void add(User user);
	public void delete(User user);
}

class UserInfoByJBDC implements UserInfoDao {

	public void add(User user){

		// 1.连接数据库
		// 2.使用sql添加语句添加数据
		// 3.关闭连接
		System.out.println("JDBC add");
	}

	public void delete(User user){

		// 1.连接数据库
		// 2.使用sql删除语句删除数据
		// 3.关闭连接
		System.out.println("JDBC delete");
	}
}

class UserInfoByHibernate implements UserInfoDao {

	public void add(User user){

		// 1.连接数据库
		// 2.使用sql添加语句添加数据
		// 3.关闭连接
		System.out.println("Hibernate add");
	}

	public void delete(User user){

		// 1.连接数据库
		// 2.使用sql删除语句删除数据
		// 3.关闭连接
		System.out.println("Hibernate delete");
	}
}

class DBOperate {

	public static void main(String[] args){

		// System.out.println("Hello World!");

		// UserInfoByJBDC ui = new UserInfoByJBDC();

		UserInfoDao ui = new UserInfoByHibernate();

		User u = new User();

		ui.add(u);
		ui.delete(u);
	}
}
