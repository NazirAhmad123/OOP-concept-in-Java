package inheritance.Extra;

public class TestAnimal {
	public static void main(String[] args) {


		Animal animal = new Animal("Animal",1,1,20,30);
		//animal.eat();

		Dog dog = new Dog("Dog",1,1,10,15,2,4,1,22);
		//dog.chew();
		//dog.eat();
		//dog.walk();
		//dog.run();
		//dog.move(20);

		Fish fish = new Fish("fish",1,1,1,2,2,2,1);
		fish.rest();
		fish.moveMuscle();
		fish.moveBackFins();
		fish.move(10);
	}
}
