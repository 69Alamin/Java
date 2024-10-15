package Q1.a;

public abstract class Payment implements Transaction{
    double amount;
    String currency ="BDT";

    public Payment(double amount)
    {
        this.amount=amount;

    }

    @Override
    public void give(){
         //Write code here
         double totalamount=getCharge()+getTax()+amount;
        System.out.println(currency+" "+ totalamount+" is paid");
    }
    @Override
    public void receive() {
        System.out.println("[Nothing to receive]");
    }


    public abstract double getCharge();


    public double getTax(){
    //Write code here
          return amount*0.156;

    }
}