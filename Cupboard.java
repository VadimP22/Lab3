package prog.lab3;
import java.util.Arrays;


public class Cupboard implements  FoodSource {

    protected String[] names = {"pan", "spoon", "fork", "skillet", "pancake pan", "colander", "knife",
                                "blender", "multicooker", "plate"};


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cupboard cupboard = (Cupboard) o;
        return Arrays.equals(names, cupboard.names);
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "names=" + Arrays.toString(names) +
                '}';
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(names);
    }

    private int random(int max) {
        return (int) (( (double) max) * Math.random());
    }


    private Item newItem() {
        String newName = names[random(10)];
        return new Dish(newName);
    }


    @Override
    public Item getNewDish() {
        return newItem();
    }

}
