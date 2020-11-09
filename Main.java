
public class Main {
	public static void main(String args[]) {
	
		MessageManager messageManager = new PrinterToConsole();
		Area corners = new SprutsHouseFloorCorners();
		Human spruts = new Spruts(messageManager);
		
		SprutsHouse house = new SprutsHouse(spruts, corners, messageManager); 
		house.passDay();
	
		
		

	}
}
