
public class PrinterToConsole implements MessageManager {
	
	private PrintMode printMode;
	
	public PrinterToConsole(PrintMode printMode) {
		this.printMode = printMode;
	}
	
	public PrinterToConsole() {
		this.printMode = PrintMode.PRINTLN;
	}
	
	@Override
	public void print(String str) {
		if (printMode == PrintMode.PRINTLN) {
			System.out.println(str);
		} else {
			System.out.print(str);
		}
		
	}
	
	public void print(int i) {
		if (printMode == PrintMode.PRINTLN) {
			System.out.println(i);
		} else {
			System.out.print(i);
		}
	}

	@Override
	public String toString() {
		return "PrinterToConsole []";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj.getClass().equals(getClass())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override 
	public int hashCode() {
		return 1;
	}
	
	

}
