package dev.shoppingcart.web.rest;

import java.io.Serializable;


public class AuthRequest implements Serializable {

	private static final long serialVersionUID = -6986746375915710855L;
	private String email;
    private String password;
    
    public AuthRequest() {}

	public AuthRequest(String email, String password) {
    	super();
    	this.email = email;
    	this.password = password;
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

}
