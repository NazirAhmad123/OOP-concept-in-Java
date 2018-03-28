package inheritance.Extra;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;

	Dog(String name, int body, int brain, int size, int weight, int eyes, int legs, int tail, int teeth) {
		super(name, body, brain, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
	}

	public void chew(){
		System.out.println("Dog.chew() is called.");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() is called.");
		chew();
		super.eat();
	}

	public void walk(){
		System.out.println("Dog.walk() is called.");
	}
	public void run(){
		System.out.println("Dog.run() is called.");
	}

	public void moveLegs(){
		System.out.println("Dog.moveLegs() is called.");
	}

	@Override
	public void move(int speed){
		System.out.println("Dog.move() is called.");
		moveLegs();
		walk();
		run();
		//super.move(speed);
	}
}
