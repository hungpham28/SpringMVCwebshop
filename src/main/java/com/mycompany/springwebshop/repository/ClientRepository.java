/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.repository;

import com.mycompany.springwebshop.entity.ClientEntity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long>{
	  @Query(value="SELECT user,password FROM client ",nativeQuery = true)
	  List<Object[]> findAllAccount();
	  ClientEntity findByUser(String user);
}
