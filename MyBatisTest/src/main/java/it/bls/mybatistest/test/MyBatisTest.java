package it.bls.mybatistest.test;

import it.bls.mybatistest.domain.User;
import it.bls.mybatistest.service.UserService;

import java.util.List;

import org.junit.Assert;

public class MyBatisTest {

	private static UserService userService = new UserService();	
	
	public static void main(String[] args) {
		
		User user = new User();
		
		for (int i = 0; i < 10; i++) {
			user = new User();
			user.setEmail("test_email_" + System.currentTimeMillis() + "@gmail.com");
			user.setPassword("secret");
			user.setFirstName("TestFirstName");
			user.setLastName("TestLastName");
			userService.insertUser(user);
			Assert.assertTrue(user.getUserId() != 0);
			User createdUser = userService.getUserById(user.getUserId());
			Assert.assertNotNull(createdUser);
			Assert.assertEquals(user.getEmail(), createdUser.getEmail());
			Assert.assertEquals(user.getPassword(), createdUser.getPassword());
			Assert.assertEquals(user.getFirstName(), createdUser.getFirstName());
			Assert.assertEquals(user.getLastName(), createdUser.getLastName());
		}
		
		user = userService.getUserById(1);
		Assert.assertNotNull(user);
		System.out.println(user);
		
		List<User> users = userService.getAllUsers();
		Assert.assertNotNull(users);
		for (User u : users) {
			System.out.println(u);
		}
		
		users = userService.getAllUsers();
		Assert.assertNotNull(users);
		String email = users.get(0).getEmail();
		user = userService.getUserByEmail(email);
		Assert.assertNotNull(user);
		System.out.println(user);
				
		long timestamp = System.currentTimeMillis();
		user = userService.getUserById(2);
		user.setFirstName("TestFirstName" + timestamp);
		user.setLastName("TestLastName" + timestamp);
		userService.updateUser(user);
		User updatedUser = userService.getUserById(2);
		Assert.assertEquals(user.getFirstName(), updatedUser.getFirstName());
		Assert.assertEquals(user.getLastName(), updatedUser.getLastName());		
		
		user = userService.getUserById(4);
		userService.deleteUser(user.getUserId());
		User deletedUser = userService.getUserById(4);
		Assert.assertNull(deletedUser);		
		
	}

}
