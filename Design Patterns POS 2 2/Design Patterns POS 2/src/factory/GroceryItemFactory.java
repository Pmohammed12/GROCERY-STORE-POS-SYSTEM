package factory;

/**
 * This class implements the factory design pattern
 */

public class GroceryItemFactory {
    public GroceryItem getItem(int item, String size){

        if(item==1) {
            GroceryItem g= new Milk();
            ((Milk) g).selectSize(size);
            return g;
        }
        else if(item==2){
            GroceryItem g= new Cheese();
            ((Cheese) g).selectSize(size);
            return g;
        }
        else if(item==3) {
            GroceryItem g= new Bread();
            ((Bread) g).selectSize(size);
            return g;
        }
        return null;
    }
}
