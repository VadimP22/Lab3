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
    public void eat(FoodSource foodSource, Storage storage) {
        Item dish = foodSource.getNewDish();
        messagePrinter.print("Spruts took " + dish.getName());
        messagePrinter.print("Spruts cooked food");
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
