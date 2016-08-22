package greetings;

import printing.IMachine;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) {

		IMachine machine = new Printer(true, "My Printer");

		machine.turnOn();

		// myPrinter.loadPaper(3);
		// myPrinter.print(2);

	}

}
