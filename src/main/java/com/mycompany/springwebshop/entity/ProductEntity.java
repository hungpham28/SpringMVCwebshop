/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.springwebshop.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "product")
    private String product;
    @Column(name = "originalPrice")
    private String originalPrice;
    @Column(name = "salePrice")
    private String salePrice;
    @Column(name = "numsold")
    private String numsold;
    @Column(name = "url")
    private String url;
    @ManyToOne
    @JoinColumn
    private ShopEntity shop;
    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY)
    private List<ItemCartEntity> itemcartList;
    @ManyToOne
    @JoinColumn
    private CategoryEntity category;
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
    private List<CommentEntity> commentList;
    public ProductEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(String originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getNumsold() {
        return numsold;
    }

    public void setNumsold(String numsold) {
        this.numsold = numsold;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShopEntity getShop() {
        return shop;
    }

    public void setShop(ShopEntity shop) {
        this.shop = shop;
    }

    public List<ItemCartEntity> getItemcartList() {
        return itemcartList;
    }

    public void setItemcartList(List<ItemCartEntity> itemcart) {
        this.itemcartList = itemcart;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<CommentEntity> getCommentsList() {
        return commentList;
    }

    public void setCommentsList(List<CommentEntity> commentsList) {
        this.commentList = commentsList;
    }
    
}
