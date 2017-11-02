package Section_04_tuts;
public class Rectangle {
    private double width = 1.0;
    private double height = 1.0;
    Rectangle(){}
    Rectangle(double newWidth, double newHeigh){
        width = newWidth;
        height = newHeigh;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public static void main(String args[]){
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

        System.out.println("The first rectangle with width of " + rectangle1.width
         + " and height of " + rectangle1.height + " is " + rectangle1.getArea());
        System.out.println("The perimeter for rectangle 1 is " + rectangle1.getPerimeter());
        System.out.println("The second rectangle with width of " + rectangle2.width
                + " and height of " + rectangle2.height + " is " + rectangle2.getArea());
        System.out.println("The perimeter for rectangle 2 is " + rectangle2.getPerimeter());

    }
}
