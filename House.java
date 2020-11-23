public abstract class House {

    protected MessagePrinter messagePrinter;
    protected Human owner;
    protected Storage storage;
    protected FoodSource foodSource;


    public House(MessagePrinter messagePrinter, Human owner, Storage storage, FoodSource foodSource) {
        this.messagePrinter = messagePrinter;
        this.owner = owner;
        this.storage = storage;
        this.foodSource = foodSource;
    }


    public abstract void passDay();
}
