package services;
import Interfaces.PaymentStratergy;

public class cash  implements PaymentStratergy{
    @Override
    public void pay(double amount){
        System.out.println("paid "+amount+" using cash");
    }

}