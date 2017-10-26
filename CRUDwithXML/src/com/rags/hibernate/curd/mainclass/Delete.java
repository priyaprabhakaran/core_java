package com.rags.hibernate.curd.mainclass;
import com.rags.hibernate.curd.dao.UserDao;

public class Delete 
{
	public static void main(String[] args) 
	{
		UserDao ud=new UserDao();
		ud.deleteUser(2l);
		System.out.println("record deleted successfully");
	}
}
