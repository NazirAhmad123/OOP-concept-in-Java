package Composition_tut_sec_01;

public class TestBedroom {
	private static void main(String args[]){

		wall wall1 = new wall("West");
		wall wall2 = new wall("East");
		wall wall3 = new wall("South");
		wall wall4 = new wall("North");

		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("Modern", 4,3,2,1);
		Lamp lamp = new Lamp("Classic",false,75);

		Bedroom bedroom = new Bedroom("Ali",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

		bedroom.makeBed();
		bedroom.getLamp().turnOn();

	}
}
