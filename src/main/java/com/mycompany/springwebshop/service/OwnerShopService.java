/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.service;


import com.mycompany.springwebshop.entity.ShopEntity;
import com.mycompany.springwebshop.model.ShopDTO;
import com.mycompany.springwebshop.repository.ShopRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class OwnerShopService {
    @Autowired
    private ShopRepository shopRepository;
    
    public List<ShopDTO> getShops(){
    	List<ShopDTO> shopList=new ArrayList<ShopDTO>();
    	List<ShopEntity> shopEntityList=(List<ShopEntity>) shopRepository.findAll();
    	for (ShopEntity shop: shopEntityList)
    		shopList.add(new ShopDTO(shop));
        return shopList;
    } 
    public List<UserDetails> getAllAccountOfShop(){
    	List<UserDetails> accountList=new ArrayList<UserDetails>();
    	shopRepository.findAllAccount().forEach(objects -> accountList.add(
    		User.withDefaultPasswordEncoder()
                .username(objects[0].toString())
                .password(objects[1].toString())
                .roles("SHOP")
                .build()));
    	return accountList;
    }
}
