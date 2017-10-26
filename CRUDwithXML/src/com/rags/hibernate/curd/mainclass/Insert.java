package com.rags.hibernate.curd.mainclass;
import com.rags.hibernate.curd.dao.*;
import com.rags.hibernate.curd.bean.*;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setUserName("Ragavan");
		u.setPassword("123456789");
		UserDao ud=new UserDao();
		ud.insert(u);
		System.out.println("Record inserted successfully");

	}

}
