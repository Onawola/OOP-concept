package oop;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Shape circle = new Circle(2);
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(2, 3);


        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = rectangle;

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }

        double totalArea = 0;
        for (Shape shape : shapes)
            totalArea += shape.area();

        System.out.println("Total Perimeter: "+ totalPerimeter);
        System.out.println("Total Area: " + totalArea);

        BigDecimal no = null;
        BigDecimal number = no.add(BigDecimal.ONE);
        System.out.println(number);
    }
}
