/**
 * This class implements the factory design pattern
 */

public class GroceryItemFactory {
    public GroceryItem getItem(String item, String size){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Milk")) {
            GroceryItem g= new Milk();
            ((Milk) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Cheese")){
            GroceryItem g= new Cheese();
            ((Cheese) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Bread")) {
            GroceryItem g= new Bread();
            ((Bread) g).selectSize(size);
            return g;
        }
        return null;
    }
}
