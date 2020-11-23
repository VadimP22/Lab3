public abstract class Human {

    protected MessagePrinter messagePrinter;

    public Human(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }


    public abstract void eat(FoodSource foodSource,Storage storage);

    public abstract void cleanUp(Storage storage);

    public abstract void washTheDishes(Storage storage);

    public abstract String getName();
}
