package goit.GoJavaOnline.Labs.Lab4;

import java.util.Scanner;

public class DistanceCalc {

    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static void main(String[] args) {

        double x2, x1, y2, y1;
        double distance;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the X coordinate for point 1: ");
        x1 = scan.nextDouble();

        System.out.println("Enter the Y coordinate for point 1: ");
        y1 = scan.nextDouble();

        System.out.println("Enter the X coordinate for point 2: ");
        x2 = scan.nextDouble();

        System.out.println("Enter the Y coordinate for point 2: ");
        y2 = scan.nextDouble();

        distance = distance(x1, y1, x2, y2);

        System.out.println("The distance between the two points is " + distance + " .");
    }
}