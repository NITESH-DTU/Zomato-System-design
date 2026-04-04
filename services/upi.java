import Interfaces.PaymentStratergy;

public class upi implements PaymentStratergy{
    @Override
    public void pay(double amount){
        System.out.println("paid "+amount+" using upi");
    }

}
