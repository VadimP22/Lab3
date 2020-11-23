public class Dish implements Item {

    String name;

    public Dish(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }
}
