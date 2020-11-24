package prog.lab3;
import java.util.Objects;

public class PrinterToConsole implements MessagePrinter {

    PrintMode printMode;

    public PrinterToConsole() {
        printMode = PrintMode.PRINTLN;
    }

    public PrinterToConsole(PrintMode printMode) {
        this.printMode = printMode;
    }

    @Override
    public String toString() {
        return "PrinterToConsole{" +
                "printMode=" + printMode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrinterToConsole that = (PrinterToConsole) o;
        return printMode == that.printMode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(printMode);
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
