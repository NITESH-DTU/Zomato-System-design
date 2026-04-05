package services;
public class Dineout extends Orders{
    private String address;
    public Dineout(String address){
        this.address=address;
    }
    @Override
    public void get_type(){
        System.out.println("Dineout");
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


}
