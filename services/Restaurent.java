package services;
import java.util.ArrayList;

public class Restaurent {
    private int id;
    private String name;
    private String location;
    private ArrayList<Menu> arr_menu;
    private static int id_counter=0;
    public Restaurent( String name, String location) {
        this.id = ++id_counter;
        this.name = name;
        this.location = location;
        this.arr_menu = new ArrayList<Menu>();
    }
    public int getId() {
        return id;
    }
   
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setArr_menu(Menu menu) {
        arr_menu.add(menu);
        
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public ArrayList<Menu> getArr_menu() {
        return arr_menu;
    }
    public void addMenu(Menu menu){
        arr_menu.add(menu);
    }
}
