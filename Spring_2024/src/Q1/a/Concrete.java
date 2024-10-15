package Q1.a;

public class Concrete extends Abs implements Inf1,Inf2{
    @Override
    public void m1() {
        System.out.println("m1");
    }


    @Override
    public void m4() {
        System.out.println("m4");
    }

    @Override
    public void m2() {
        System.out.println("m2");
    }

    @Override
    public void m3() {
        System.out.println("m3");
    }
}
