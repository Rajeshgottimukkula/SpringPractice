package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
  public void checkout(String str) {
	  System.out.println("Checkout from Shopping cart called");
  }
  
  public void addItem() {
	  System.out.println("add Item from Shopping cart is called");
  }
  public void removeItem() {
	  System.out.println("Remove item is called");
  }
}
