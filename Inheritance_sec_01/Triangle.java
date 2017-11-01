package Inheritance_sec_01;

import java.util.Date;

public class Triangle extends GeometericObject {

    private double side1= 1.0;
    private double side2= 1.0;
    private double side3= 1.0;



    public Triangle(String color, boolean filled, Date dateCreated, double side1, double side2, double side3) {
        super(color, filled, dateCreated);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public double getArea(){
        return side1 + side2 + side3;
    }
    public double getPerimeter(){
        return (side1 + side2 + side3)/2;
    }
    public String toString(){
        return "A triangle created with side 1 = " + side1 +
                " side 2 = " + side2 + " side 3 = " + side3;
    }

}
