import manager.*;
import services.*;
import Interfaces.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initializing system data...");
        seedData();
        System.out.println("\n--- Welcome to Zomato ---");
        User nitesh = new User("Nitesh","gautam colony,narela delhi-401107");
        Tomato app = new Tomato(nitesh); 
        Restaurent restaurent = app.SearchRestaurent("Delhi"); 
        if(restaurent != null){
            System.out.println("Restaurant found: " + restaurent.getName());
            app.Restaurent(restaurent);
            ArrayList<Menu> menu = restaurent.getArr_menu(); 
            System.out.println("Menu:");
            for(Menu item : menu){
                System.out.println(item.getmenu_name() + " - " + item.getprice());
            }
            app.addToCart(menu.get(0));
            app.addToCart(menu.get(1));
            app.checkout("upi", "delivery", "scheduled", "sunday night 8 pm");
        } else {
            System.out.println("No restaurant found in the specified location.");
            return;
        }
    }
    // A separate helper method to keep your main method clean
    private static void seedData() {
        RestaurantManager manager = RestaurantManager.getInstance();
        
        Restaurent r1 = new Restaurent("Pizza Palace", "Delhi");
        r1.addMenu(new Menu("Margherita Pizza", 250.0));
        r1.addMenu(new Menu("Garlic Bread", 100.0));
        manager.addRestaurant(r1); 
        
        // Create Restaurant 2
        Restaurent r2 = new Restaurent("Burger Hub", "Mumbai");
        r2.addMenu(new Menu("Cheese Burger", 150.0));
        r2.addMenu(new Menu("Fries", 80.0));
        manager.addRestaurant(r2);
    }
}