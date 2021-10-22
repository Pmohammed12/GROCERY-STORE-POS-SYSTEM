public class Milk extends GroceryItem implements SizeSelect{

    public Milk() {

    }

    @Override
    void setPrice(int price) {
        this.price=price;
    }

    @Override
    public void selectSize(String size) {
        if(size.equals("Small")){
            this.size=new Small(this);
            this.size.small(20);
        }
        else if(size.equals("Large")){
            this.size=new Large(this);
            this.size.large(20);
        }
        else{
            this.size=null;
        }
    }
}
