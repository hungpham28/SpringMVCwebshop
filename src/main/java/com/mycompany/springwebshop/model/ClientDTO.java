package com.mycompany.springwebshop.model;


import com.mycompany.springwebshop.until.*;

import java.util.List;

import com.mycompany.springwebshop.entity.ClientEntity;
import com.mycompany.springwebshop.entity.ItemCartEntity;


public class ClientDTO {
	
    private long id;

    private String money;

    private String fullName;

    private String birthday;

    private String address;

    private String phone;

    private String image;
    
    private List<ItemCartEntity> itemcartList;
    
    private String totalMoneyCart;
    
	public ClientDTO(ClientEntity client) {
		if(client!=null) {
			this.setId(client.getId());
			this.setMoney (FormNumber.formMoney(client.getMoney()));
			this.setFullName(client.getFullName());
			this.setBirthday(client.getBirthday());
			this.setAddress(client.getAddress());
			this.setPhone(client.getPhone());
			this.setImage(client.getImage());
//			List<ItemCartEntity> itemList=client.getItemcartList();
			this.setItemcartList(client.getItemcartList());
//			long total=0;
//			for (ItemCartEntity item: itemList) {
//				total+=item.getQuantity()*(item.getProduct().getSalePrice()
//			}
		}
	}

	public ClientDTO() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<ItemCartEntity> getItemcartList() {
		return itemcartList;
	}

	public void setItemcartList(List<ItemCartEntity> itemcartList) {
		this.itemcartList = itemcartList;
	}

	public String getTotalMoneyCart() {
		return totalMoneyCart;
	}

	public void setTotalMoneyCart(String totalMoneyCart) {
		this.totalMoneyCart = totalMoneyCart;
	}
    
    
}
