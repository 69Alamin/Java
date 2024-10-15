package Q1.a;

public class CheckPay extends Payment{
    public CheckPay(double amount)
    {
        super(amount);

    }

    @Override
    public double getCharge() {
        return 10;
    }
}
