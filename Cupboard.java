public class Cupboard implements  FoodSource {

    protected String[] names = {"a", "b", "c"};


    private int random(int max) {
        return (int) (( (double) max) * Math.random());
    }


    private Item newItem() {
        String newName = names[random(3)];
        return new Dish(newName);
    }


    @Override
    public Item getNewDish() {
        return newItem();
    }

}
