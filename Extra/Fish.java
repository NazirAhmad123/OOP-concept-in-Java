package inheritance.Extra;

public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;

	Fish(String name, int body, int brain, int size, int weight, int gills, int eyes, int fins) {
		super(name, body, brain, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	public void rest(){
		System.out.println("Fish.rest() is called.");
	}

	public void moveMuscle(){
		System.out.println("Fish.moveMuscle() is called.");
	}

	public void moveBackFins(){
		System.out.println("Fish.moveBackFins() is called.");
	}



	@Override
	public void move(int speed){
		System.out.println("Fish.move() is called.");
//		The process of a fish moving is as follow
		moveMuscle();
		moveBackFins();
		super.move(speed);
	}



}
