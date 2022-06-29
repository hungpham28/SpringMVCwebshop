//package com.mycompany.springwebshop.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="account")
//public class AccountEntity {
//	@Id@GeneratedValue
//	@Column(name="id")
//	private long id;
//	@Column(name="username")
//    private String username;
//	@Column(name="password")
//    private String password;
//	@Column(name="enabled")
//    private boolean enabled;
//	@Column(name="rolesList")
//    private String rolesList;
//	@OneToOne(mappedBy = "account")
//	private ShopEntity shop;
//	@OneToOne(mappedBy = "account")
//	private ClientEntity client;
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public boolean isEnabled() {
//		return enabled;
//	}
//	public void setEnabled(boolean enabled) {
//		this.enabled = enabled;
//	}
//	public String getRolesList() {
//		return rolesList;
//	}
//	public void setRolesList(String rolesList) {
//		this.rolesList = rolesList;
//	}
//	public ShopEntity getShop() {
//		return shop;
//	}
//	public void setShop(ShopEntity shop) {
//		this.shop = shop;
//	}
//	public ClientEntity getClient() {
//		return client;
//	}
//	public void setClient(ClientEntity client) {
//		this.client = client;
//	}
//	
//	
//}
