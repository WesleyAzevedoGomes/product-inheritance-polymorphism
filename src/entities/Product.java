package entities;

public class Product {
  private String name;
  private Double price;

  public Product(){
  }
  public Product(String name, Double price){
    this.name = name;
    this.price = price;
  }

  // Getter
  public String getName(){
    return name;
  }
  public Double getPrice(){
    return price;
  }

  // Setter
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  // More Methods
  public String priceTag(){
    return getName() + " $" + getPrice();
  }
}
