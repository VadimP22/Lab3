package prog.lab3;

public class App {

	public static void main(String[] args) {
		MessagePrinter printerToConsole = new PrinterToConsole();
        Human spruts = new Spruts(printerToConsole);
        FoodSource cupboard = new Cupboard();
        Storage floor = new Floor();
        House sprutsHouse = new SprutsHouse(printerToConsole, spruts, floor, cupboard);

        sprutsHouse.passDay();

	}
	
}
