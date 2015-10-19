package it.bls.mybatistest.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Blog {

	private Integer blogId;
	
	private String blogTitle;
	
	private Date createdOn;
	
	private List<Post> posts = new ArrayList<Post>();

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Override
	public String toString() {
		return "BlogId : " + blogId + " blogTitle : " + blogTitle + " createdOn : " + createdOn;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
}
