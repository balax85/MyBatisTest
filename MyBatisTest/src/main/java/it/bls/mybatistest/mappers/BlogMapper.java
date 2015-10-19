package it.bls.mybatistest.mappers;

import it.bls.mybatistest.domain.Blog;

import java.util.List;

public interface BlogMapper {

 	 public void insertBlog(Blog blog);
	 
 	 public Blog getBlogById(Integer blogId);
	 
	public List<Blog> getAllBlogs();
	
	public void updateBlog(Blog blog);
	
	public void deleteBlog(Integer blogId);
	
}
