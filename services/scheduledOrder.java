public class scheduledOrder implements Interfaces.Orderfactory{
    private String scheduled_time;
    @Override
    public void createOrder(){
        System.out.println("order created using scheduled order");
    }
    public scheduledOrder(String scheduled_time){
        this.scheduled_time=scheduled_time;
    }
    public String getScheduled_time() {
        return scheduled_time;
    }

}
