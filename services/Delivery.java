package services;
public class Delivery extends Orders {
    private String address;
    public Delivery(String address){
        this.address=address;
    }
    @Override
    public void get_type(){
        System.out.println("Delivery");
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
