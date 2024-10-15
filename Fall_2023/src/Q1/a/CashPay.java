package Q1.a;

public class CashPay extends Payment {
    public CashPay(double amount)
    {
        super(amount);
    }

    @Override
    public double getCharge() {
        return 0;
    }

}
