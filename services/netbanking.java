package services;
import Interfaces.PaymentStratergy;

public class netbanking  implements PaymentStratergy{
    @Override
    public void pay(double amount){
        System.out.println("paid "+amount+" using netbanking");
    }

}
