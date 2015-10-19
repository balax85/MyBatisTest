package it.bls.mybatistest.domain;

import java.util.Date;

public class Post {

	private Integer postId;
	
	private String postTitle;
	
	private String content;
	
	private Date createdOn;

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Override
	public String toString() {
		return "PostId : " + postId + " postTitle : " + postTitle + " content : " + content + " createdOn : " + createdOn;  
	}	
	
}
