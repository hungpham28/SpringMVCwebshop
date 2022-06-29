package com.mycompany.springwebshop.model;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.springwebshop.entity.ProductEntity;
import com.mycompany.springwebshop.entity.ShopEntity;
import com.mycompany.springwebshop.until.FormNumber;



public class ShopDTO {
    private long id;

    private String nameShop;

    private long numFollower;

    private String urlAvatar;
    
	private List<ProductDTO> productListDTO;
	
	private String numFollowerDTO;
	
	public ShopDTO(ShopEntity shop) {
		this.setId(shop.getId());
		this.setNameShop(shop.getNameShop());
		this.setNumFollowerDTO(FormNumber.formSold(shop.getNumFollower()));
		this.setUrlAvatar(shop.getUrlAvatar());
		this.productListDTO=new ArrayList<ProductDTO>();
		try {
			List<ProductEntity> productList=shop.getProductList();

			for (ProductEntity product: productList) {
				this.productListDTO.add(new ProductDTO(product));
			}
		} catch (Exception e) {
			System.out.println("Not found productList in package com.mycompany.springwebshop.model.ShopDTO!"+e);
		}
	}
	
	public List<ProductDTO> getProductListDTO() {
		return productListDTO;
	}

	public void setProductListDTO(List<ProductDTO> productListDTO) {
		this.productListDTO = productListDTO;
	}

	public ShopDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNumFollowerDTO() {
		return this.numFollowerDTO;
	}
	
	public void setNumFollowerDTO(String numFollower) {
		this.numFollowerDTO = numFollower;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	
}
