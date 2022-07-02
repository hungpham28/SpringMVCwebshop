/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.service;

import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.springwebshop.entity.ItemCartEntity;
import com.mycompany.springwebshop.repository.CartRepository;
import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

/**
 *
 * @author Admin
 */
@Service
public class CartService {
	@Autowired
	private CartRepository cartRepository;
    public void deleteById(long id) {
    	cartRepository.deleteById(id);
    }
    public void update(ItemCartEntity itemCartEntity) {
    	cartRepository.save(itemCartEntity);
    }
    public void saveItemCart(ItemCartEntity item) {
    	cartRepository.save(item);
    }
    @Transactional
    public void saveItemCartList(List<ItemCartEntity> itemList) {
		for(ItemCartEntity itemCart: itemList) {
			if(itemCart.getQuantity()==0) {
				deleteById(itemCart.getId());
			}else {
				saveItemCart(itemCart);
			}
		}
    }
}
