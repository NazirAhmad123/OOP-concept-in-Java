package enc_challange;

public class Printer {

	/*
	* Create a class called Printer and demonstrate proper encapsulation techniques.
	* It will simulate a real computer printer.
	* It should have fields for the inkLevel, number of pages printed and also
	* whether it is a duplex printer. (capable of printing on both sides of the paper).
	* add methods to fill up the ink level, (up to a maximum of 100 percent).
	* add another method to simulate printing of a page. (which should increase the number
	* pages printed.)
	* Decide on the scope whether to user constructor, and anything else you think is needed.
	*
	* */

	private int inkLevel;
	private int pagesPrinted;
	private boolean isDuplex;


	public Printer(int inkLevel, boolean isDuplex) {

		if (inkLevel >-1 && inkLevel <= 100){
			this.inkLevel = inkLevel;
		}else {
			this.inkLevel = -1;
		}
		this.isDuplex = isDuplex;
		this.pagesPrinted = 0;
	}

	public int addInk(int inkAmount){
		if (inkAmount >0 && inkAmount <= 100){
			if (this.inkLevel + inkAmount > 100){
				return -1;
			}
			this.inkLevel = inkAmount;
			return this.inkLevel;
		}else {
			return -1;
		}
	}
	public int printPages(int pages){
		int pagesToPrint = pages;

		if (this.isDuplex){
			pagesToPrint/=2;
			System.out.println("Printing in duplex mode.");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
}
