package basics;

public class Dog extends Animal {

//	Now we can assign extra states and behaviors that are unique to the Dog class

	private int eyes;
	// remembering that not all animals have eyes. but all dogs have eyes
	private int legs;
	private int tail;
	private int teeth;



	public Dog(String name, int brain, int body, int size, int weight, int eyes,
			   int legs, int tail, int teeth){
//		super(name, brain, body, size, weight);
//		We can be smart about our code and reduce the amount of typing.
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
	}

	private void chew(){
		System.out.println("Dog.chew() is being called.");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() is being called.");
		chew();
		super.eat();
	}

//	Now, let's see how would a dog move.
	public void walk(){
//		A dog walks.
		System.out.println("Dog.walk() is being called.");
//		Let's say 10 is a unit of speed.
//		move(10);
//		if i write super.move(), it ignores the move method in the sub-class
//		and automatically goes to the move() method in the super class.
		super.move(20);
	}
	public void run(){
//		Dogs also run.
		System.out.println("Dog.run() is being called.");
		move(20);
		// We can also do it this way.
//		super.move(10);
	}
//	Let's see an example of super.move();

	public void moveLegs(){
		System.out.println("Dog.moveLegs() is being called.");
	}
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() is being called.");
		moveLegs();
		super.move(speed);
	}
}
