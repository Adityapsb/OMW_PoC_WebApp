package org.omwpoc.uk.userRegistrationApp.service;

import java.util.ArrayList;
import java.util.List;

import org.omwpoc.uk.userRegistrationApp.model.User;

public class UserService {
	
	public List<User> getAllUsers()
	
	{
		
		User user1 = new User("user-1","Aditya","Singh","14-12-82","07429813047","b929pn","26 walsgrave drive");
		User user2 = new User("user-2","Pratap","Singh","14-12-84","07429813047","b929pn","26 walsgrave drive");
		List<User> list = new ArrayList<>();		
		list.add(user1);
		list.add(user2);
		return list;
	}

	
public User getuser(String userName)
	
	{		
		User user1 = new User(userName,"Aditya","Singh","14-12-82","07429813047","b929pn","26 walsgrave drive");				
		return user1;
	}

public User createUser(User user)

{
	//create user and return the user created
	return user;
	
}

}


