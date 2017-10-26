package com.rags.hibernate.curd.mainclass;
import com.rags.hibernate.curd.dao.*;
import com.rags.hibernate.curd.bean.*;

public class GetUser {
	public static void main(String[] args) {
		
		UserDao ud=new UserDao();
		User user=ud.getUser(1l);
		
		System.out.println("User detail");
		
		System.out.println(user.getUserName());
		System.out.println(user.getPassword());

	}

}
