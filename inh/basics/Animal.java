package basics;

public class Animal {

	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;

	public Animal(String name, int brain, int body, int size, int weight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
	}
	public void eat(){
//		All animals eat in some shape or form.
		//		It's a very generic term. all animals eat.
		System.out.println("Animal.eat() was called.");
	}
//	public void move(){
////		All animals move in some shape or form.
////		It's a very generic term. all animals move.
//		System.out.println("Animal.move() was called.");
//	}

	public void move(int speed){
//		All animals move in some shape or form.
//		It's a very generic term. all animals move.
		System.out.println("Animal.move is being called.");
		System.out.println("Animal is moving at " + speed + " speed.");
	}


	public String getName() {
		return name;
	}

	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}
}
