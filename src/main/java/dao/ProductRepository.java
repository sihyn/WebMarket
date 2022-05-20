package dao; 

import java.util.ArrayList;
import java.util.List;
import dto.Product;

public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	private static ProductRepository instance = new ProductRepository();
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, 8-megapixel iSight Camara");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitInStock(1000);
		phone.setCondition("New");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3inch, IPS LED display, 5th Generation Intel Core processors");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitInStock(1000);
		notebook.setCondition("Refurbished");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitInStock(1000);
		tablet.setCondition("Old");
		
		products.add(phone);
		products.add(notebook);
		products.add(tablet);
	}
	
	public List<Product> getAllProducts() {
		return products;
		
	}
	
	public Product getProductById(String ProductId) {
		return products.stream() 
				.filter((product)->product.getProductId().equals(ProductId))
				// 필요한 것 거르기 (filter가 하나씩 돌림)
				.findFirst()	// 그 중 첫 번째 것 찾기
				.get(); 		// 찾은 값 얻어오기	
	}
	
	// 상품 추가
	public void addProduct(Product product) {
		products.add(product);
	}
	
}