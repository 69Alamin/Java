package Q2.a;

public class Movie {

    public static void main(String[] args) {
        MovieTheater obj=new  MovieTheater(15);
        User mina=new User(obj,6,"Mina");
        User nabil=new User(obj,8,"Nabil");
        User farhan=new User(obj,4,"Farhan");

        mina.start();
        nabil.start();
        farhan.start();

        try {
            mina.join();
            nabil.join();
            farhan.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Rmaining available seat :"+obj.availableSeats);

    }





}


