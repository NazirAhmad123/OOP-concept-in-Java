package sec_04;

public interface Telephone {
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean phoneCall(int phoneNumber);
	boolean isRinging();
}
