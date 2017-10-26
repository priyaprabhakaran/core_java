package com.rags.hibernate.curd.mainclass;
import com.rags.hibernate.curd.dao.UserDao;
import com.rags.hibernate.curd.bean.*;
import java.util.List;

public class AllUser {

	public static void main(String[] args) {

		UserDao ud = new UserDao();
		List<User> userList = ud.getUserList();
		for (User user : userList) {
			System.out.print(user.getUserName());
			System.out.print("     ");
			System.out.print(user.getPassword());
			System.out.println();
		}

	}

}
