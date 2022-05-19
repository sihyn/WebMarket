package dao;

import java.util.ArrayList;
import java.util.List;
import dto.Product;

//product에 대한 기능을 정의
public class ProductRepository {
	private List<Product> products = new ArrayList<>();
	// List는 인터페이스 ArrayList는 클래스
	// 다형성을 위해서 List로 하여 뒤에 어떤 리스트 종류가 와도 다 가능하게 함(여기서는 ArrayList)

	// 기본 생성자
	public ProductRepository() {
		// 원래는 DB에서 가져올 데이터 이지만
		// 지금 DB 사용하지 않고 그냥 3개 만듦
		Product phone = new Product("P1234", "iphone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Retina HD display, more");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitInStock(1000);
		phone.setCondition("New");

		Product notebook = new Product("P1235", "LG Gram", 1500000);
		notebook.setDescription("4.7-inch, 1334X750 Retina HD display, more");
		notebook.setCategory("Smart notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitInStock(1000);
		notebook.setCondition("Refublished");

		Product tablet = new Product("P1236", "Galaxy Tab S", 1000000);
		tablet.setDescription("4.7-inch, 1334X750 Retina HD display, more");
		tablet.setCategory("Smart Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitInStock(1000);
		tablet.setCondition("Old");

		// List에 넣음
		products.add(phone);
		products.add(notebook);
		products.add(tablet);
	}

	// 모든 상품 정보 가져옴
	public List<Product> getAllProducts() {
		return products;
	}
}
