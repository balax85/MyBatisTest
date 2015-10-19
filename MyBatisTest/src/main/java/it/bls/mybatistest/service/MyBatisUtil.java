package it.bls.mybatistest.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory factory = null;

	public MyBatisUtil() {
//		InputStream inputStream = null;
//		try {
//			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//		} catch (IOException e) {
//			throw new RuntimeException(e.getMessage());
//		}
//		this.factory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	static {
		InputStream inputStream = null;
		try {
			//reader = Resources.getResourceAsReader("mybatis-config.xml");
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			throw new RuntimeException(e.getMessage());
		}
		factory =  new SqlSessionFactoryBuilder().build(inputStream);
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return factory;
	
	}	
	
}
