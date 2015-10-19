package it.bls.mybatistest.domain;

public class User {
	
	public Integer userId;
	
	public String email;
	
	public String password;
	
	public String firstName;
	
	public String lastName;
	
	private Blog blog;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		
		return "USERID : " + this.userId + " EMAIL : " + this.email + "PASSWORD : " + this.password + " FIRSTNAME : " + this.firstName + " LASTNAME : " + this.lastName;
		
	}

	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

}
