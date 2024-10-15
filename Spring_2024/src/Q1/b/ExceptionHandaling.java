package Q1.b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandaling {
    public static int [] myaray;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter array size :");
        int n=scanner.nextInt();
        myaray=new int[n];
        System.out.print("Enter Index position :");
        int index=scanner.nextInt();
        System.out.print(" Enter a value :");

        try {
            int value =scanner.nextInt();  ///Input mismatch occured when try to assign the value in the varriable
            myaray[index]=value;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("IndexOutOfBoundsException is Occured");
        }
        catch (InputMismatchException e)
        {
            System.out.println("InputMismatchException  is Occured");
        }
        catch (Exception e)
        {
            System.out.println("Some other exception is occered");
        }

        finally {
            System.out.println("Exception Handaling is amazing");
        }


    }
}
