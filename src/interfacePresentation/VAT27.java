package src.interfacePresentation;

public interface VAT27 {

    int VAT = 27; // public static -ként működik implicit módon

    static void printActualVAT() { // body nem kötelező, de lehet
        System.out.println(VAT);
    }

    default double calculateDoubleVAT(int vatRate) { // body nem kötelező, de lehet
        double doubleRate = 0;
        doubleRate = (double) vatRate / 100;
        return doubleRate;
    }


    double calculateFullPrice(int net); // ez public abstract implicit módon, nincs body
}
