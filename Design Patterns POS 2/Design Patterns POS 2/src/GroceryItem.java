public abstract class GroceryItem {
    int price;
    SizeAdapter size;

    abstract void setPrice(int price);

    public int calculateBill(int units){
        return units*price;
    }
}
