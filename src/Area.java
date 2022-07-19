package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

//import?

    public class Area {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the radius: ");
            double radius = input.nextDouble();
            input.close();
            double circle = Circle.getArea(radius);
            System.out.printf("The area of the circle is: %f", circle);
        }

}
