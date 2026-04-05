package services;
public class User {
    private int id;
    private String name;
    private String address;
    private Cart orders;
    private static int id_counter=0;
    public User(String name,String address){
        this.id=++id_counter;
        this.name=name;
        this.address=address;
        this.orders=new Cart();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public void setName(String name) {
        this.name = name;
    }   
    public void setAddress(String address) {
        this.address = address;
    }
    public Cart getOrders() {
        return orders;
    }
    public void clearOrders() {
        this.orders = new Cart(); // Resets the cart to an empty state
    }
}
