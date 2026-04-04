import Interfaces.Orderfactory;

public class nowOrder implements Orderfactory{
    @Override
    public void createOrder(){
        System.out.println("order created using now order");
    }

}
