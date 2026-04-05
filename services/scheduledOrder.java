package services;
public class scheduledOrder implements Interfaces.Orderfactory{
    private String scheduled_time;
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
    public scheduledOrder(String scheduled_time){
        this.scheduled_time=scheduled_time;
    }
    public String getScheduled_time() {
        return scheduled_time;
    }

}
