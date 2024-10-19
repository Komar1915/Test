package main.java.pl.oko;

import java.text.DecimalFormat;

public class UnitsConverter {


    public double kilo_to_pounds(double a){
        double result = a * 2.20462;
        System.out.println(a + " kilogramów to " + result + " funtów");
        return result;
    }

    public double miles_to_kilometrs(double a){
        double result = a * 1.60934;
        System.out.println(a + " mil to " + result + " kilometrów ");
        return result;
    }

    public double liters_to_gallons(double a){
        double result = a * 0.264172;
        System.out.println(a + " litrów to " + result + " galonów ");
        return  result;
    }

    public double celsius_to_fahrenheit(double a){
        double result = (a * 9/5) + 32;
        System.out.println(a + " stopni celsiusza to " + result + " stopni farenhaita");
        return result;
    }

    public double inches_to_centimeters(double a){
        double result = a * 2.54;
        System.out.println(a + " cali to " + result + " centymetrów");
        return result;
    }
}
