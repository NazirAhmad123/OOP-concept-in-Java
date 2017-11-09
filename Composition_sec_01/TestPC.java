package Composition_sec_01;

public class TestPC {
    public static void main(String args[]){

        Case theCase = new Case("B_01","Dell", new Dimension(12,34,65));
        Monitor theMonitor = new Monitor("CWS_05","Acer", 1200, new Resolution(13,24));
        Motherboard theMotherboard = new Motherboard("SD_95","Asus",4, 5);

        PC myPc = new PC(theCase,theMonitor,theMotherboard);

        myPc.powerUp();



    }
}
