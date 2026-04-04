public class Menu {
    private int menu_id;
    private String menu_name;
    private double price;
    private static int id = 0;
    public Menu( String menu_name, double price) {
        this.menu_id = ++id;
        this.menu_name = menu_name;
        this.price = price;
    }
    public int getMenu_id(){
        return menu_id;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void setmenu_name(String menu_name){
        this.menu_name=menu_name;
    }
    public String getmenu_name(){
        return menu_name;
    }
    public double getprice(){
        return price;
    }
}