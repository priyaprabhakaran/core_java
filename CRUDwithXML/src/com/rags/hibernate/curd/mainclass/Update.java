package com.rags.hibernate.curd.mainclass;
import com.rags.hibernate.curd.dao.*;
import com.rags.hibernate.curd.bean.*;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setId(2);
		u.setUserName("XYZ");
		u.setPassword("12345");
		UserDao ud=new UserDao();
		ud.updateUser(u);
		System.out.println("Record updated successfully");


	}

}
