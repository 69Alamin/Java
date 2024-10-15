package Q1.a;

public class CreditPay extends Payment {
    public CreditPay(double amount)
    {
        super(amount);
    }

    @Override
    public double getCharge() {
        return amount*0.025;
    }
}
