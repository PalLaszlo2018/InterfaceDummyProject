import java.io.Serializable;

public class Product implements VAT27, Serializable {

    static {
        int counter;
        counter = 0;
        System.out.println(counter + " db termékkel indulunk.");
        // System.out.println(numberOfProducts);   ERROR: numberOfProducts is unknown here
    }

    static int numberOfProducts;

    private int netPrice;
    private String name;

    private Product(int netPrice, String name) {
        this.netPrice = netPrice;
        this.name = name;
    }

    public static Product createProduct (int netPrice, String name) {
      if ((0 < netPrice) && (netPrice < 9_000_000) && (name.length() > 0)) {
          Product product = new Product(netPrice, name);
          numberOfProducts++;
          // counter++ ERROR, counter is unknown
          return product;
      }
      return null;
    };



    @Override // default-ot lehet, de nem kötelező
    public double calculateDoubleVAT(int vatRate) {
        return 0;
    }


    @Override //abstractot kötelező
    public double calculateFullPrice(int netPrice) {
        return (1 + calculateDoubleVAT(VAT)) * netPrice;
    }

    //staticot meg nem is lehet Override-olni

    //==============GETTERS====================

    public int getNetPrice() {
        return netPrice;
    }

    public String getName() {
        return name;
    }
}
