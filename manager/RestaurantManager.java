package manager;
import java.util.ArrayList;
import  services.*;
public class RestaurantManager {
    private static RestaurantManager manager;
    private static ArrayList<Restaurent> restaurants;
    private RestaurantManager(){

    }
    public static   synchronized RestaurantManager getInstance(){
        if(manager==null){
            restaurants=new ArrayList<Restaurent>();
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
    public Restaurent getRestaurantByid(int id){
        for(Restaurent restaurant:restaurants){
            if(restaurant.getId()==id){
                return restaurant;
            }
        }
        return null;
    }
      public Restaurent getRestaurantByLocation(String location){
        
        for(Restaurent restaurant:restaurants){
            if(restaurant.getLocation()==location){
                return restaurant;
            }
        }
        return null;
    }

    
    
}
