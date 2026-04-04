import java.util.ArrayList;
public class Cart {
    private Restaurent restaurent;
    private ArrayList<Menu> items;
    public Cart() {
        this.restaurent=null;
        this.items = new ArrayList<Menu>();
    }
    public void addItem(Menu menu){
        if(restaurent!=null){
            items.add(menu);
            return;
        }else{
            System.out.println("Cart is empty. Please select a restaurant first.");
        }
    }
    public void removeItem(Menu menu){
        items.remove(menu);
    }
    public double getTotalPrice(){
        double total=0;
        for(Menu menu:items){
            total+=menu.getprice();
        }
        return total;
    }
    public ArrayList<Menu> getItems() {
        return items;
    }
    public Restaurent getRestaurent() {
        return restaurent;
    }
    public void setRestaurent(Restaurent restaurent) {
        this.restaurent = restaurent;
    }
}
