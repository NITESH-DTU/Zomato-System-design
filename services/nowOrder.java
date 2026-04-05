package services;
import Interfaces.Orderfactory;

public class nowOrder implements Orderfactory{
    @Override
    public Orders createOrder(String type){
        if(type.equals("dineout")){
            return new Dineout("address");
            
        }
        else if(type.equals("delivery")){
            return new Delivery("address");
            
        }
        return null;
       
    }

}
