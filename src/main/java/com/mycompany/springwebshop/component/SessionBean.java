package com.mycompany.springwebshop.component;

import java.util.HashMap;
import java.util.Map;

import com.mycompany.springwebshop.model.ClientDTO;

public class SessionBean {
	public Map<String, Object> session=new HashMap<String, Object>();
	public ClientDTO clientDetails;
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
	public Object getAttribute(String namePara) {
		return this.session.get(namePara);
	}

	public ClientDTO getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDTO clientDetails) {
		this.clientDetails = clientDetails;
	}
	
}
