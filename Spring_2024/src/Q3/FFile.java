package Q3;

import java.io.*;
import java.util.InputMismatchException;

public class FFile {

    public static void main(String[] args)  {
        double min=99999;
        try {
            BufferedReader reader=new BufferedReader(new FileReader("src/input.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("src/output.txt"));

            String line;
            while ((line=reader.readLine())!=null)
            {
                try {
                    double num=Double.parseDouble(line);
                    if(num<min)
                        min=num;
                }
                catch (NumberFormatException e)
                {

                }


            }
            reader.close();

            writer.write(min+"");
            writer.close();


        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }



    }

}
