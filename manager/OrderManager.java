package manager;
public class OrderManager {
    private ArrayList<Order> orders;
    private static OrderManager manager;
    private OrderManager(){

    }
    public static synchronized OrderManager getInstance(){
        if(manager==null){
            manager=new OrderManager();
        }
        return manager;
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public void ListOrders(){
        for(Order order:orders){
            System.out.println("order for " + order.getUser().getName()+" from restaurant "+order.getRestaurant().getName()+" with total price "+ order.getTotalAmount()+"at"+order.getUser().getAddress());
        }
    }



}
