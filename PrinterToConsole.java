public class PrinterToConsole implements MessagePrinter {

    PrintMode printMode;

    public PrinterToConsole() {
        printMode = PrintMode.PRINTLN;
    }

    public PrinterToConsole(PrintMode printMode) {
        this.printMode = printMode;
    }

    @Override
    public void print(String message) {

        if (printMode == PrintMode.PRINT) {
            System.out.print(message);
        }   else {
            System.out.println(message);
        }

    }

    @Override
    public void print(int number) {

        if (printMode == PrintMode.PRINT) {
            System.out.print(number);
        }   else {
            System.out.println(number);
        }

    }

    public void setMode(PrintMode printMode) {
        this.printMode = printMode;
    }

}
