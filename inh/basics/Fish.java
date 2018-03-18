package basics;

public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;


	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	public void rest(){
		System.out.println("Fish is resting.");

	}
	public void moveMuscle(){
		System.out.println("Fish is moving its muscles.");

	}
	public void moveBackFin(){
		System.out.println("Fish is moving its backFins.");

	}
	public void swim(int speed){
		System.out.println("Fish.swim() is being called.");
		moveMuscle();
		moveBackFin();
		super.move(speed);
	}
}
