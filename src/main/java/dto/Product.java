package dto;

import java.io.Serializable;

// 모델 클래스
// JSP : 자바빈즈 (getter/setter, 기본 생성자, Serializable)
public class Product implements Serializable {
	//내부에 serialVersionUID로 이 객체가 어떤 객체인지 판별할 때 씀
	private static final long serialVersionUID = -4416824317283777132L;
	
	private String productId;
	private String name;
	private int unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitInStock;
	private String condition;
	
	//빈 생성자 생성
	public Product() {};
	//생성자
	public Product(String productId, String name, int unitPrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(long unitInStock) {
		this.unitInStock = unitInStock;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	//String 형으로 변환하려고 사용
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", description="
				+ description + ", manufacturer=" + manufacturer + ", category=" + category + ", unitInStock="
				+ unitInStock + ", condition=" + condition + "]";
	}
	
	
}