package goit.GoJavaOnline.Labs.Lab4;

public class AreaCalc {
    public static void main(String[] args) {
        int a = 35, b = 55;
        double pi, radius, area1;

        radius = 5;
        pi = 3.14159;
        area1 = pi * radius * radius;

        System.out.println("The area of a right Triangle with legs "
                + a + " and " + b + " = " + (a * b) / 2);
        System.out.println("The area of a Rectangle with sides "
                + a + " and " + b + " = " + (a * b));
        System.out.println("The area of a Circle with "
                + radius + " = " + area1);
    }
}