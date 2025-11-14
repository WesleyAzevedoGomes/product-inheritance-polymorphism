package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
  private LocalDate manufactureDate;
  private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  public UsedProduct(String name, Double price, LocalDate manufactureDate){
    super(name, price);
    this.manufactureDate = manufactureDate;
  }
  // Getter
  public String getManufactureDate(){
    return manufactureDate.format(fmt);
  }

  // Setter
  public void setManufactureDate(LocalDate manufactureDate) {
    this.manufactureDate = manufactureDate;
  }

  // More Methods
  @Override
  public String priceTag(){
    return getName() + " (used)" + " $" + getPrice() + " (Manufacture date: "+ getManufactureDate() + ")";
  }
}
