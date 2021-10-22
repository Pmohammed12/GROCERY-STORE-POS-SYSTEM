import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Testing {

    @Test
    public void groceryItemFactoryTest(){
        GroceryItemFactory groceryItemFactory= new GroceryItemFactory();
        GroceryItem item=groceryItemFactory.getItem("Milk","Large");

        assertNotEquals(item,null);
    }


    @Test
    public void cartSingletonTest(){
        Cart c=Cart.getInstance();

        assertNotEquals(c,null);
    }

    @Test
    public void adapterTest(){
        GroceryItem g= new Milk();
        ((Milk) g).selectSize("Large");

        assertEquals(g.price,30);
    }
}

