package Q2.a;

public class User extends Thread{
    MovieTheater m;
    int NumOfTicket;

    public User( MovieTheater m,int NumOfTicket,String name)
    {   super(name);
        this.m=m;
        this.NumOfTicket=NumOfTicket;
    }

    @Override
    public void run() {
      int booked= m.bookTickets(NumOfTicket);
        System.out.println(Thread.currentThread().getName() + " has booked " + booked + " tickets");
    }
}
