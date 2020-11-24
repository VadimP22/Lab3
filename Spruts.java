package prog.lab3;

public class Spruts extends Human {

    private static boolean isExists = false;

    public Spruts(MessagePrinter messagePrinter) {
        super(messagePrinter);
        if (isExists) {
            throw new RuntimeException("there can be only one Spruts");
        }
        isExists = true;

    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Spruts{" +
                "messagePrinter=" + messagePrinter +
                '}';
    }

    @Override
    public void eat(FoodSource foodSource, Storage storage) {
        //breakfast
        Item dish = foodSource.getNewDish();
        messagePrinter.print("Spruts takes " + dish.getName());
        messagePrinter.print("Spruts prepares food");
        messagePrinter.print("Spruts eats food from/using " + dish.getName());
        messagePrinter.print("Spruts puts dirty dishes on the floor");
        storage.addItem(dish);
    }

    @Override
    public void cleanUp(Storage storage) {
        messagePrinter.print("I'm lazy");
    }

    @Override
    public void washTheDishes(Storage storage) {
        messagePrinter.print("I'm lazy");
    }

    @Override
    public String getName() {
        return "Spruts";
    }
}
