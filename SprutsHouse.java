public class SprutsHouse extends House {

    private static boolean isExist = false;

    public SprutsHouse(MessagePrinter messagePrinter, Human owner, Storage storage, FoodSource foodSource) {
        super(messagePrinter, owner, storage, foodSource);

        if(isExist) {
            throw new RuntimeException("there can be only one Spruts house");
        }
        isExist = true;

    }


    @Override
    public void passDay() {

    }
}
