package entities;

public class ImportedProduct extends Product {
  private Double customsFee;

  public ImportedProduct(String name, Double price, Double customsFee){
    super(name, price);
    this.customsFee = customsFee;
  }
  // Getter

  public Double getCustomsFee() {
    return customsFee;
  }

  // Setter
  public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
  }


  public Double totalPrice(){
    return getPrice() + customsFee;
  }

  @Override
  public String priceTag(){
    return getName() + " $" + totalPrice() + " (Customs fee: $"+ getCustomsFee() + ")";
  }

}
