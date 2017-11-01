package Inheritance_sec_01;

public class TestTriangle {
    public static void main(String args[]){

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter three sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = input.next();

        System.out.print("Is the traingle filled? (true/false)");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(color,filled,new java.util.Date(),s1,s2,s3);

//        triangle.setColor(color);
//        triangle.setFilled(filled);
        System.out.println(triangle.getDateCreated());
        System.out.println(triangle.toString());
        System.out.println("Area = " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("isFilled? :" + triangle.isFilled());

    }
}
