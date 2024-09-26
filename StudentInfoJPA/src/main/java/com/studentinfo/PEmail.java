package com.studentinfo;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
@Embeddable
public class PEmail {
	
	private String provider;
	private String p_email;
	private String status;
	
	
	public PEmail(String provider, String p_email, String status) {
		super();
		this.provider = provider;
		this.p_email = p_email;
		this.status = status;
	}
	
	public PEmail() {
		super();
	}
	
	
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
