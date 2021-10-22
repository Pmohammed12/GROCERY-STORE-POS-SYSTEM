public class Bread extends GroceryItem implements SizeSelect{

    public Bread() {

    }

    @Override
    void setPrice(int price) {
        this.price=price;
    }

    @Override
    public void selectSize(String size) {
        if(size.equals("Small")){
            this.size=new Small(this);
            this.size.small(25);
        }
        else if(size.equals("Large")){
            this.size=new Large(this);
            this.size.large(25);
        }
        else{
            this.size=null;
        }
    }
}
