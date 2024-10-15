package Q2.a;

import java.io.*;
import java.util.Locale;


public class file {

    public static void main(String[] args) {
        try {
            BufferedReader reader=new BufferedReader(new FileReader("src/input.txt"));
            String line;
            double consonant=0;
            while ((line= reader.readLine())!=null)
            {   line=line.toLowerCase(Locale.ROOT);
                //System.out.println(line);
                for(int i=0;i<line.length();i++)
                {

                    if(line.charAt(i)>='a'&&line.charAt(i)<='z')
                     {
                         if (line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u')
                        {

                         }
                         else
                            consonant++;

                }

                }
            }
            reader.close();

            BufferedWriter writer=new BufferedWriter(new FileWriter("src/output.txt"));
            writer.write(consonant+"");
            writer.close();
        }
        catch (IOException e)
        {

        }
    }


}
