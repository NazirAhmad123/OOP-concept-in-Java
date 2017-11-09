package Composition_sec_01;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        theMonitor.drawPixelAt(25,45, "blue");
        drawLogo();
    }
    public void drawLogo(){
        theMotherboard.loadProgram("Windows 8.1");
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
