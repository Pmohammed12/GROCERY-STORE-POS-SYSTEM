package factory;
import adapter.SizeAdapter;

public  class GroceryItem {
    public int price;
    public SizeAdapter size;

    public void setPrice(int price) {
        this.price=price;
    }

    public int calculateBill(int units){
        return units*price;
    }
}
