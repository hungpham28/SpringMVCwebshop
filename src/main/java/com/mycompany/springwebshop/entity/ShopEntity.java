/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "shop")
public class ShopEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "user")
    private String user;
    @Column(name = "pass")
    private String pass;
    @Column(name = "nameShop")
    private String nameShop;
    @Column(name = "numFollower")
    private long numFollower;
    @Column(name = "urlAvatar")
    private String urlAvatar;
    @OneToMany(mappedBy = "shop", fetch = FetchType.EAGER)
    private List<ProductEntity> productList;

    public ShopEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNameShop() {
        return nameShop;
    }

    public void setNameShop(String nameShop) {
        this.nameShop = nameShop;
    }

    public long getNumFollower() {
		return numFollower;
	}

	public void setNumFollower(long numFollower) {
		this.numFollower = numFollower;
	}

	public String getUrlAvatar() {
        return urlAvatar;
    }

    public void setUrlAvatar(String urlAvatar) {
        this.urlAvatar = urlAvatar;
    }

    public List<ProductEntity> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductEntity> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ShopEntity{" + "id=" + id + ", user=" + user + ", pass=" + pass + ", nameShop=" + nameShop + ", numFollower=" + numFollower + ", urlAvatar=" + urlAvatar + ", productList="  + '}';
    }
    
}
