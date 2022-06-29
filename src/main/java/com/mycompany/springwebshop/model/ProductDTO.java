package com.mycompany.springwebshop.model;

import java.util.List;
import java.util.Random;

import com.mycompany.springwebshop.entity.CategoryEntity;
import com.mycompany.springwebshop.entity.CommentEntity;
import com.mycompany.springwebshop.entity.ProductEntity;
import com.mycompany.springwebshop.until.FormNumber;
import com.mycompany.springwebshop.until.FormString;



public class ProductDTO {
    private long id;
 
    private String product;
  
    private String originalPrice;
 
    private String salePrice;
    
    private String numsold;
  
    private String url;
    
	private int percentSale;
	
    private CategoryEntity category;

    private List<CommentEntity> commentsList;
    
	public ProductDTO(ProductEntity product){
		Random generator = new Random();
		this.setId(product.getId());
		this.setNumsold(FormNumber.formSold(generator.nextInt(999999+1)));
		this.setProduct(FormString.getFewChar(product.getProduct()));
		this.setOriginalPrice(FormNumber.formMoney(product.getOriginalPrice()));
		this.setSalePrice(FormNumber.formMoney(product.getSalePrice()));
		this.setCategory(product.getCategory());
		this.setUrl(product.getUrl());
		this.setCommentsList(product.getCommentsList());
		try{
			this.setPercentSale((int)Math.round((1-Long.parseLong(product.getSalePrice())*1.0/Long.parseLong(product.getOriginalPrice()))*100.0));
		} 
		catch (Exception e) {
			this.setPercentSale(0);
		}
	}
	
	public int getPercentSale() {
		return percentSale;
	}

	public void setPercentSale(int percentSale) {
		this.percentSale = percentSale;
	}

	public ProductDTO() {
		// TODO Auto-generated constructor stub
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

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public List<CommentEntity> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<CommentEntity> commentsList) {
		this.commentsList = commentsList;
	}
	
}
