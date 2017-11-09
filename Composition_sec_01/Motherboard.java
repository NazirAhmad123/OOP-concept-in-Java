package Composition_sec_01;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int numSlots;
    private int numCards;

    public Motherboard(String model, String manufacturer, int numSlots, int numCards) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.numSlots = numSlots;
        this.numCards = numCards;
    }
    public void loadProgram(String programName){
        System.out.println(programName + " is now loading ...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumSlots() {
        return numSlots;
    }

    public int getNumCards() {
        return numCards;
    }
}
