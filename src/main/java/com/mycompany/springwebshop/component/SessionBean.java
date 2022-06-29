package com.mycompany.springwebshop.component;

import java.util.HashMap;
import java.util.Map;

public class SessionBean {
	public Map<String, Object> session=new HashMap<String, Object>();

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	
	public void addAttribute(String namePara,Object object) {
		this.session.put(namePara, object);
	}
	public void removeAttribute(String namePara) {
		this.session.remove(namePara);
	}
	public void setAttribute(String namePara,Object object) {
		this.session.put(namePara, object);
	}
	public void getAttribute(String namePara) {
		this.session.get(namePara);
	}
	
}
