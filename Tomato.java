import services.*;
import java.util.ArrayList;
import Interfaces.*;
import manager.*;

public class Tomato {
    
    private User currentUser; 

    public Tomato(User user) {
        this.currentUser = user;
    }

    public Restaurent SearchRestaurent(String Location){
        RestaurantManager manager = RestaurantManager.getInstance();
        Restaurent restaurent = manager.getRestaurantByLocation(Location);
        if(restaurent != null){
            return restaurent;
        } else {
            return null;
        }
    }

    public ArrayList<Menu> getMenu(int id){
        RestaurantManager manager = RestaurantManager.getInstance();
        Restaurent restaurent = manager.getRestaurantByid(id);
        if(restaurent != null){
            return restaurent.getArr_menu();
        }
        return null;
    }
    public void Restaurent(Restaurent restaurent){
        currentUser.getOrders().setRestaurent(restaurent);
    }
    public void addToCart(Menu menu){
        if(currentUser.getOrders().getRestaurent() == null){
            currentUser.getOrders().addItem(menu);
        }
        currentUser.getOrders().addItem(menu); 
    }

    public void removeFromCart(Menu menu){
        currentUser.getOrders().removeItem(menu);
    }

    public void checkout(String paymentMethod, String orderType, String factoryType, String time){
        
        Cart userCart = currentUser.getOrders();
        
        if(userCart.getItems().size() > 0){
            Orderfactory factory;
            if(factoryType.equals("scheduled")){
                factory = new scheduledOrder(time);
            } else {
                factory = new nowOrder();
            }
            
            Orders order = factory.createOrder(orderType);
            OrderManager manager = OrderManager.getInstance();
            
            order.setRestaurant(userCart.getRestaurent());
            
            for(Menu menu : userCart.getItems()){
                order.addMenu(menu);
            }
            
            if(paymentMethod.equals("upi")){
                order.setPaymentStrategy(new upi());
            } else if(paymentMethod.equals("netbanking")){
                order.setPaymentStrategy(new netbanking());
            } else {
                order.setPaymentStrategy(new cash());
            }
            
            order.processPayment();
            manager.addOrder(order);
            
          
            currentUser.clearOrders(); 
            System.out.println("Order placed successfully for " + currentUser.getName() + " at time " + time+ " with payment method " + paymentMethod + " and bill of " + order.getTotalAmount());
            return;
        } else {
            System.out.println("Cart is empty!");
        }
    }
}