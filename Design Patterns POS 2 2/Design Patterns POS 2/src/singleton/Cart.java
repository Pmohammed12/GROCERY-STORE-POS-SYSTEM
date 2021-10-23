package singleton;

import factory.GroceryItem;

import java.util.ArrayList;

/**
 * This class implements the composite design pattern and Singleton Design Pattern
 */
public class Cart extends GroceryItem {
    private static Cart cart=new Cart();
    public ArrayList<GroceryItem> items=new ArrayList<>();


    private Cart(){

    }

    public static Cart getInstance(){

        return cart;
    }

    public void addItem(GroceryItem item)
    {
        items.add(item);
    }

    public void removeItem(int item)
    {
        items.remove(item);
        setPrice(0);
    }

    @Override
    public void setPrice(int price) {
        this.price=0;
        for(int i=0;i<items.size();i++){
            this.price+=items.get(i).price;
        }
    }
}
