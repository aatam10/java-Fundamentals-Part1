package printing;

public class Printer implements IMachine {

	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;

	public Printer(boolean isOn, String modelNumber) {
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
	}

	public void turnOn() {
		System.out.println("Warming up printer");
		machine.turnOn();
	}

	public void print(int copies) {
		String onStatus = "";
		if (machine.isOn())
			onStatus = " is ON!";
		else
			onStatus = " is OFF!";
		String textToPrint = modelNumber + onStatus;

		while (copies > 0 && paperTray.isEmpty()) {
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}

		if (!paperTray.isEmpty()) {
			System.out.println("Load More Paper!");
		}
	}

	public void print(String text) {
		System.out.println(text);
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void loadPaper(int count) {
		paperTray.addPaper(count);
	}

	public void turnOff() {
		machine.turnOff();

	}

	public boolean isOn() {
		// TODO Auto-generated method stub
		return machine.isOn();
	}

}
