package org.example.lesson2;

public class Main {
    private static final double CONV_M = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App");
        System.out.println("Version 1.0.");
        double mls = 10;
        double kms = 100;
        double kilometers = convKmsToMiles(mls);
        double miles = convMlsToKms(kms);
        System.out.println("Result is " + kilometers + " kilometers and " + miles + " miles");
    }
    //sds
    private static double convKmsToMiles(double mls) {
        return mls * CONV_M;
    }
    private static double convMlsToKms(double kms) {
        return kms / CONV_M;
    }
}

