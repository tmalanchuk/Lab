package goit.GoJavaOnline.Labs.Lab4;

public class TemperatureCalc {
    public static void main(String[] args) {
        double f;
        double d;
        int temperature = 0;

        while (temperature++ < 5) {
            f = ((temperature - 32) * (5 / 9.0));

            System.out.println(temperature + " degrees Celsius = " + f + " degrees Fahrenheit");
        }

        do {
            d = ((temperature * 9 / 5.0) + 32);
            System.out.println(temperature + " degrees Fahrenheit = " + d + " degrees Celsius");
        }
        while (temperature++ < 10);
        {
        }
    }
}