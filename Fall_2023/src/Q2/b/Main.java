package Q2.b;

import java.lang.*;
public class Main{
    public static void main (String[] args) throws java.lang.Exception{
        int arr[]= new int[4];
        int x = 10, y = 1;
        try{
            try{
                arr[4] = x / (y - 1);       //first arithmathic exception  happen
                                              //cause : first do operation then store,while doing operation it creats exception
                System.out.println("a");
            }
            catch(ArithmeticException e){
                System.out.println("b");        //after print b
                arr[4] = x / (y - 1);          //again arithmathic exception happens but not cath  .though IndexoUtofBound happend it wont cath
            }                                  // cause for 1 try block only one catch block will execute .
            catch(IndexOutOfBoundsException e){
                System.out.println("c");
                arr[4] = x / (y - 1);
            }
            finally{                           //if a program execute try block  it always run finally block without any condition
                                               //you can not writh a finally block without try block
                System.out.println("d");
            }
        }
        catch(Exception e){
            System.out.println("e");
        }
        finally{
            System.out.println("f");
        }
    }
}