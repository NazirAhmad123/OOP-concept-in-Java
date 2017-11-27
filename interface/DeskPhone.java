package sec_04;

public class DeskPhone implements Telephone {

	private int myNumber;
	private boolean isRinging = false;


	public DeskPhone(int myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken. Desk phone doesn't have a power button.");
	}

	@Override
	public void dial(int phoneNumber) {
		if (myNumber == phoneNumber){
			System.out.println("Dialing " + myNumber + " on the desk phone.");
		}
	}

	@Override
	public void answer() {
		if (isRinging){
			System.out.println("Answering...");
			isRinging = false;
		}
	}

	@Override
	public boolean phoneCall(int phoneNumber) {
		if (isRinging){
			return true;
		}
		return false;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}
}
