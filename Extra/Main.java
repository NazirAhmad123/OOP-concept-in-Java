package inheritance.Extra;

public class Main {
	public static void main(String[] args) {

		java.util.Scanner userInput = new java.util.Scanner(System.in);

		System.out.print("Enter the tree sides of a triangle: ");
		double s1 = userInput.nextDouble();
		double s2 = userInput.nextDouble();
		double s3 = userInput.nextDouble();

		System.out.print("Enter a color: ");
		String color = userInput.next();

		System.out.println("Is the triangle filled? (true/false): ");
		boolean isFilled = userInput.nextBoolean();

		Triangle triangle = new Triangle(s1,s2,s3);
		triangle.setColor(color);
		triangle.setFilled(isFilled);

		System.out.println("Area of the triangle: " + triangle.getArea());
		System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
		System.out.println("color: " + triangle.getColor());
		System.out.println("isFilled: " + triangle.isFilled());


	}
}