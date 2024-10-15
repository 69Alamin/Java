package Q5;

public class Main {

    public static void main(String[] args) {
        FindMax user1=new FindMax(new int[]{3, 1, -5, 10});
        FindMax user2=new FindMax(new int[]{-2, 6, 7, 8, 0});
        FindMax user3=new FindMax(new int[]{12, -6, 4, 20, 1});
        FindMax user4=new FindMax(new int[]{10, 5, -9, 18, 7});

        user1.start();
        user2.start();
        user3.start();
        user4.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
        }
        catch (InterruptedException e)
        {

        }

        int[]max=new int[]{user1.getMax(),user1.getMax(),user3.getMax(),user4.getMax()}; //every thread ar highest valu gula
                                                                                          //akta array ar modde rakha

        int max2=user1.getMax();   //first user ar value ta max dore neaoa
        for (int n:max)
        {
            if(max2<n)
                max2=n;
        }

        System.out.println("The maximum number is :"+max2);


    }

}
