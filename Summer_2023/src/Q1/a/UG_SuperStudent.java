package Q1.a;


//For answer this part only


public class UG_SuperStudent extends Student implements TA,RA{
    String Professor,research;
    int salary;

    UG_SuperStudent(String Professor,String research,int salary ,int age)
    {
        this.Professor=Professor;
        this.research=research;
        this.salary=salary;
        super.age=age;
    }

    @Override
    public void conductReachearch() {
        System.out.println(research);
    }

    @Override
    void display() {
        super.display();
        System.out.println(Professor +" "+research+" "+salary);
    }

    @Override
    public void assistProfessor() {
        System.out.println(Professor);
    }
}
