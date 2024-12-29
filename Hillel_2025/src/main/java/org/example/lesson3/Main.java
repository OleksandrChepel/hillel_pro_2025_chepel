package org.example.lesson3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter App");
        System.out.println("Version 1.0.");
        double fah = 1;
        double cel = 32;
        double celsius= convCelToFahrenheit(fah);
        double fahrenheit = convFahToCelsius(cel);
        System.out.println("Result is " + celsius + " celsius and " + fahrenheit + " fahrenheit");
    }
    //sds
    private static double convCelToFahrenheit(double cel) {
        return (cel * 1.8) +32;
    }
    private static double convFahToCelsius(double fah) {
        return (fah  - 32) / 1.8 ;
    }
}

