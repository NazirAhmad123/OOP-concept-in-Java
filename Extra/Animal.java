package inheritance.Extra;

public class Animal {

	private String name;
	private int body;
	private int brain;
	private int size;
	private int weight;


	Animal(String name, int body, int brain, int size, int weight){
		this.name = name;
		this.body = body;
		this.brain = brain;
		this.size = size;
		this.weight = weight;
	}

//	Common methods for a generic animal
	public void eat(){
//		All animals eat in some form or shape.
		System.out.println("Animal.eat() is called.");
	}

	public void move(int speed){
		System.out.println("Animal.move() is called.");
		System.out.println("Animal is moving at " + speed + " speed.");
	}


	public String getName() {
		return name;
	}

	public int getBody() {
		return body;
	}

	public int getBrain() {
		return brain;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
}
