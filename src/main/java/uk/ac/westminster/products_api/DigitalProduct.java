package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

  private String downloadURL;
  private double fileSizeMB;

  private double discountedPrice;


  public DigitalProduct(Long id, String name, double price, String downloadURL, double fileSizeMB) {
    super(id, name, price);
    this.downloadURL = downloadURL;
    this.fileSizeMB = fileSizeMB;
  }

  public String getDownloadURL() {
    return downloadURL;
  }

  public double getFileSizeMB() {
    return fileSizeMB;
  }

  @Override
  public String getSummary() {
    return "Name: " + getName()
      + " | Download: " + downloadURL;
  }

  @Override
  public void applyDiscount(double rate) {
    discountedPrice = getPrice() * (1 - rate);
  }

  @Override
  public double getDiscountedPrice() {
    return discountedPrice;
  }
}
