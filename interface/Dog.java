package sec_04;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is now eating.");
	}

	@Override
	public void breath() {
		System.out.println(getName() + " is now breathing.");
	}
}
