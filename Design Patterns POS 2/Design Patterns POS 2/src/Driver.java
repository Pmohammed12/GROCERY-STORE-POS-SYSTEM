import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[]args){

        GroceryItemFactory factory=new GroceryItemFactory();
        Cart cart=Cart.getInstance();

        System.out.println("WELCOME TO OUR SHOP!\nChoose an option:");
        int option=0;
        Scanner sc=new Scanner(System.in);
        String input="";
        while(option!=3){
            //1
            cart.setPrice(0);
            System.out.println("\n1- Buy Item\n2- Remove Item from Cart\n3- Checkout");
            input=sc.nextLine();
            option=Integer.parseInt(input);
            if(option==1){
                System.out.println("\nMilk\nBread\nCheese");
                String name=sc.nextLine();
                System.out.println("\nLarge or Small? ");
                String size=sc.nextLine();
                cart.addItem(factory.getItem(name,size));

            }
            else if(option==2){
                int i=1;
                for(GroceryItem item: cart.items){
                    if(item instanceof Milk)
                    {
                        System.out.println(i+"- Milk");
                    }

                    else if(item instanceof Cheese)
                        System.out.println(i+"- Cheese");
                    else
                        System.out.println(i+"- Bread");
                    i++;
                }
                input=sc.nextLine();
                i= Integer.parseInt(input);

                cart.removeItem(i-1);
            }
            else{
                System.out.println("Pay bill on counter");
            }
        }
        System.out.println("Thank you for choosing us!");

    }
}
