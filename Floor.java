public class Floor implements  Storage {

    Item items[];
    int itemsCount;

    public Floor() {
        itemsCount = 0;
    }


    @Override
    public void addItem(Item item) {

        if (itemsCount == 0)
        {
            items = new Item[1];
            items[0] = item;

            itemsCount = itemsCount + 1;
        }

        else
        {
            Item[] itemsNew = new Item[itemsCount + 1];

            for (int i = 0; i < itemsCount; i++) {
                itemsNew[i] = items[i];
            }
            itemsNew[itemsCount] = item;

            items = itemsNew;

            itemsCount = itemsCount + 1;
        }


    }


    @Override
    public String getStatus() {
        String string = "there are a lot of garbage:" + "\nhello";
        return string;
    }


    @Override
    public Item[] getItems() {
        return items;
    }

}
