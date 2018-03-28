package inheritance.Extra;

public class GeometericObject {

	String color;
	boolean isFilled;

	GeometericObject(){

	}
	GeometericObject(String color, boolean isFilled){
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean filled) {
		isFilled = filled;
	}
	public String toString(){
		return "color: " + color + "\nisFilled: " + isFilled;
	}
}
