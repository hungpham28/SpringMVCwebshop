package com.mycompany.springwebshop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.mycompany.springwebshop.repository.ClientRepository;
import com.mycompany.springwebshop.repository.ShopRepository;
@Service
public class ManageAccountService {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ShopRepository shopRepository;
    public List<UserDetails> getAllAccount(){
    	List<UserDetails> accountList=new ArrayList<UserDetails>();
    	clientRepository.findAllAccount().forEach(objects -> accountList.add(
    		User.withDefaultPasswordEncoder()
                .username(objects[0].toString())
                .password(objects[1].toString())
                .roles("CLIENT")
                .build()));
        shopRepository.findAllAccount().forEach(objects -> accountList.add(
       		User.withDefaultPasswordEncoder()
                .username(objects[0].toString())
                .password(objects[1].toString())
                .roles("SHOP")
                .build()));
    	return accountList;
    }
}
