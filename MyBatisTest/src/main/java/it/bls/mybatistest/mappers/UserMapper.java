package it.bls.mybatistest.mappers;

import it.bls.mybatistest.domain.User;

import java.util.List;

public interface UserMapper {
	
	public void insertUser(User user);

	public User getUserById(Integer userId);

	public List<User> getAllUsers();

	public void updateUser(User user);

	public void deleteUser(Integer userId);
	
	public User getUserByEmail(String email);

}
