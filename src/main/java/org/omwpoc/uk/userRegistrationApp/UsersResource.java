package org.omwpoc.uk.userRegistrationApp;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.omwpoc.uk.userRegistrationApp.model.User;
import org.omwpoc.uk.userRegistrationApp.service.UserService;

@Path("/users")
public class UsersResource {
	
	UserService srv = new UserService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> getUsers()	
	{		
		System.out.println("aditya------------");
		return srv.getAllUsers();
	}
	
	
	@GET
	@Path("/{userName}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("userName") String userName )	
	{		
		return srv.getuser(userName);
	}
	
	@POST	
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public User createUser(User user)	
	{		
		return srv.createUser(user);
	}

}
