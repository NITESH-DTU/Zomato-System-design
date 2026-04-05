package manager;
import services.*;
import java.util.ArrayList;
public class OrderManager {
    private static ArrayList<Orders> orders;
    private static OrderManager manager;
    private OrderManager(){

    }
    public static synchronized OrderManager getInstance(){
        if(manager==null){
            orders=new ArrayList<Orders>();
            manager=new OrderManager();
        }
        return manager;
    }
    public void addOrder(Orders order){
        orders.add(order);
    }
    public void ListOrders(){
        for(Orders  order:orders){
            System.out.println("order for " + order.getUser().getName()+" from restaurant "+order.getRestaurant().getName()+" with total price "+ order.getTotalAmount()+"at"+order.getUser().getAddress());
        }
    }



}
