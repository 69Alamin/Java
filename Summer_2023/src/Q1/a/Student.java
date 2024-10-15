package Q1.a;

public abstract class Student {
    String firstName,lastName,studentID;
    int age;

    void  register( String cource)
    {
        System.out.println("The student is registered to "+cource);

    }
    void display()
    {
        System.out.println(firstName+" "+lastName+" "+studentID+" "+age);

    }
}
