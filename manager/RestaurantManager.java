import java.util.ArrayList;
import  services.Restaurent;
public class RestaurantManager {
    private static RestaurantManager manager;
    private ArrayList<Restaurent> restaurants;
    private RestaurantManager(){

    }
    public static   synchronized RestaurantManager getInstance(){
        if(manager==null){
            manager=new RestaurantManager();
        }
        return manager;
    }
    public void addRestaurant(Restaurent restaurant){
        restaurants.add(restaurant);
    }
    public ArrayList<Restaurent> getRestaurants() {
        return restaurants;
    }
    public Restaurent getRestaurantByLocation(String Location){
        for(Restaurent restaurant:restaurants){
            if(restaurant.getLocation()==Location ){
                return restaurant;
            }
        }
        return null;
    }

    
    
}
