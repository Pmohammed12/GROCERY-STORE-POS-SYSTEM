public class Cheese extends GroceryItem implements SizeSelect{


    public Cheese() {

    }

    @Override
    void setPrice(int price) {
        this.price=price;
    }

    @Override
    public void selectSize(String size) {
        if(size.equals("Small")){
            this.size=new Small(this);
            this.size.small(30);
        }
        else if(size.equals("Large")){
            this.size=new Large(this);
            this.size.large(30);
        }
        else{
            this.size=null;
        }
    }
}
