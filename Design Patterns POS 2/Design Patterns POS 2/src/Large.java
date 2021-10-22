public class Large implements SizeAdapter {
    GroceryItem item;

    public Large(GroceryItem item) {
        this.item = item;
    }

    @Override
    public void small(int price) {

    }

    @Override
    public void large(int price) {
        item.setPrice(price+10);
    }
}
