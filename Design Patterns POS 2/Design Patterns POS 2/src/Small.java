public class Small implements SizeAdapter {
    GroceryItem item;

    public Small(GroceryItem item) {
        this.item = item;
    }

    @Override
    public void small(int price) {
        item.setPrice(price);
    }

    @Override
    public void large(int price) {

    }

}
