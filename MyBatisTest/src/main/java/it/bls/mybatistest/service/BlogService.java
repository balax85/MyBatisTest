package it.bls.mybatistest.service;

import it.bls.mybatistest.domain.Blog;
import it.bls.mybatistest.mappers.BlogMapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class BlogService {
	
	private SqlSession sqlSession = null;
	
	private BlogMapper blogMapper = null;
	
	private SqlSession getSqlSession() {
		if (sqlSession == null) {
			sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
		}
		return sqlSession;
	}
	
	private BlogMapper getBlogMapper() {
		if (blogMapper == null) {
			blogMapper = getSqlSession().getMapper(BlogMapper.class);
		}
		return blogMapper;
	}
	
	public void insertBlog(Blog blog) {
		try {
			getBlogMapper().insertBlog(blog);
			getSqlSession().commit();
		} finally {
			sqlSession.close();
		}
	}	
	
	public Blog getBlogById(Integer blogId) {
		try {
			return getBlogMapper().getBlogById(blogId);
		} finally {
			sqlSession.close();
		}
	}	
	
	public List<Blog> getAllBlogs() {
		try {
			return getBlogMapper().getAllBlogs();
		} finally {
			sqlSession.close();
		}
	}
	
	public void updateBlog(Blog blog) {
		try {
			getBlogMapper().updateBlog(blog);
			getSqlSession().commit();
		} finally {
			sqlSession.close();
		}
	}

	public void deleteBlog(Integer blogId) {
		try {
			getBlogMapper().deleteBlog(blogId);
			getSqlSession().commit();
		} finally {
			sqlSession.close();
		}
	}

}
