package main.java.pl.oko;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMICalculator {

        public double calculateBMI(double a, double b) {
            if (b <= 0) {
                throw new IllegalArgumentException("Wzrost nie może być ponizej 0");
            }
            double bmi = a / (b * b);
            BigDecimal bd = new BigDecimal(bmi);
            bd = bd.setScale(2, RoundingMode.HALF_UP);

            return bd.doubleValue();
        }
}
