package src.interfacePresentation;

public class Main {
    public static void main(String[] args) {
        Product product1 = Product.createProduct(1500, "Egér");
        Product product2 = Product.createProduct(180000, "Laptop");
        // src.InterfacePresentation.Product product3 = new src.InterfacePresentation.Product(200, "alma"); ERROR: no public constructor

        System.out.println("A beégetett ÁFA kulcs:" + product1.VAT); //static field elérhető
        System.out.print("Az aktuális áfa kulcs: ");
        VAT27.printActualVAT(); // ez static method az IF-ben, itt nem lehet elérni producton keresztül: product1.printActualVAT() ERROR;
        System.out.println("5%-os áfa esetén az alábbi értékkel kell számolni: " + product1.calculateDoubleVAT(5)); //default method
        System.out.print(product2.getName() + " bruttó ára: ");
        System.out.println(product2.calculateFullPrice(product2.getNetPrice())); // Override, nyilván elérhető producton keresztül
        System.out.println(Product.numberOfProducts + " terméket hoztunk létre.");
        System.out.println(product2.numberOfProducts + " terméket hoztunk létre.");
    }
}
