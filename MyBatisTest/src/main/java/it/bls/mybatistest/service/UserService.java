package it.bls.mybatistest.service;

import it.bls.mybatistest.domain.User;
import it.bls.mybatistest.mappers.UserMapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class UserService {

	public void insertUser(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.insertUser(user);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	public User getUserById(Integer userId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			return userMapper.getUserById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
		return null;
	}

	public List<User> getAllUsers() {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			return userMapper.getAllUsers();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();			
		}
		return null;
	}

	public void updateUser(User user) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.updateUser(user);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();

		}
	}

	public void deleteUser(Integer userId) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			userMapper.deleteUser(userId);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	public User getUserByEmail(String email) {
		SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory()
				.openSession();
		try {
			UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
			return userMapper.getUserByEmail(email);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();			
		}
		return null;
	}

}
