package greetings;

import printing.BWCartridge;
import printing.ICartridge;
import printing.IMachine;
import printing.Printer;
import printing.colorCartridge;

public class HelloWorld {

	public static void main(String[] args) {

		Printer<colorCartridge> printer= new Printer<colorCartridge>(true, "My Printer",new colorCartridge());
		Printer<BWCartridge> printer2 = new Printer<BWCartridge>(true, "MY PRINTER1", new BWCartridge());
		
		printOne(printer);
	
		
	}

	private static void printOne(Printer<? extends ICartridge> printer) {
		
		String fillPercentage = printer.getCartidge().getFillPercentage();
		System.out.println(fillPercentage);
		
	}

}
