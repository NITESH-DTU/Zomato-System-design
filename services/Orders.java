package services;
import java.lang.reflect.Array;
import java.util.ArrayList;

import Interfaces.PaymentStratergy;
public class Orders {
    private User user;
    private int id;
    private Restaurent restaurant;;
    private ArrayList<Menu> orered_menu;
    private static int id_counter=0;
    private PaymentStratergy paymentStrategy;
    private double totalAmount;
    public Orders() {
        this.user = null;
        this.id = ++id_counter;
        this.restaurant = null;
        this.orered_menu = new ArrayList<>();
        this.paymentStrategy = null;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void setRestaurant(Restaurent restaurant) {
        this.restaurant = restaurant;
    }
    public void addMenu(Menu menu){
        orered_menu.add(menu);
    }
    public int getId() {
        return id;
    }
    public Restaurent getRestaurant() {
        return restaurant;
    }
    public ArrayList<Menu> getOrered_menu() {
        return orered_menu;
    }
    public void setPaymentStrategy(PaymentStratergy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(){
        double amount=0;
        for(Menu menu:orered_menu){
            amount+=menu.getprice();
        }
        paymentStrategy.pay(amount);
    }
    public double getTotalAmount() {
        double amount=0;
        for(Menu menu:orered_menu){
            amount+=menu.getprice();
        }
        totalAmount=amount;
        return totalAmount;
    }
    public void get_type(){
        System.out.println("order created using normal order");
    }

   



}
