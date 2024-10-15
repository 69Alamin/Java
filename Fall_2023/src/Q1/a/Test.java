package Q1.a;

public class Test {
    public static void main(String[] args) {

        Payment p1=new CashPay(100);
        p1.give();

        Payment p2=new CheckPay(100);
        p1.give();

        Payment p3=new CreditPay(100);
        p1.give();

    }
}
