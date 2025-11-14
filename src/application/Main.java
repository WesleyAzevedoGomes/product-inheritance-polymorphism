package application;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of products: ");
    int n = sc.nextInt();
    List<Product> list = new ArrayList<>();
    for(int i = 0; i < n; i++){
      sc.nextLine();
      System.out.println("Product #" +(i+1) + " data: ");
      System.out.println("Commom, used, or imported? (c/u/i)");
      String typeProduct = sc.nextLine();
      System.out.println("Name: ");
      String nameProduct = sc.nextLine();
      System.out.println("Price: ");
      double priceProduct = sc.nextDouble();
      if(typeProduct.equalsIgnoreCase("c")){
        list.add(new Product(nameProduct, priceProduct));
      } else if (typeProduct.equalsIgnoreCase("u")){
        sc.nextLine();
        System.out.println("Manufacture date (DD/MM/YYYY): ");
        String date = sc.nextLine();
        list.add(new UsedProduct(nameProduct, priceProduct, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
      } else {
        System.out.println("Custom fee: ");
        double customFee = sc.nextDouble();
        list.add(new ImportedProduct(nameProduct, priceProduct, customFee));
      }
    }
    System.out.println("PRICE TAGS: ");
    for(Product products : list){
      System.out.println(products.priceTag());
    }
    sc.close();
  }
}