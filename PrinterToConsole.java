
public class PrinterToConsole implements MessageManager {

	@Override
	public void print(String str) {
		System.out.println(str);
		
	}
	
	public void print(int i) {
		System.out.println(i);
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
