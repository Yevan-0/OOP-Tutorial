package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has everything a Product has (id, name, price) plus extra physical details like weight and dimensions.
// A Customer would NOT pass this test, because a customer is not a thing that is sold, so "a Customer IS-A Product" makes no sense (a Customer HAS-A relationship with products via orders instead).
public class PhysicalProduct extends Product {
  private double weightKg;
  private String dimensions;

  public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
    super(id, name, price);
    this.weightKg = weightKg;
    this.dimensions = dimensions;
  }

  public double getWeightKg() {
    return weightKg;
  }

  public String getDimensions() {
    return dimensions;
  }
}
