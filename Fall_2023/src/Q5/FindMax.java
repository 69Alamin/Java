package Q5;

public class FindMax extends Thread {
    public int[]arr;
    public FindMax(int[] arr)
    {
        this.arr=arr;
    }
   public int max;

    public void run() {
        for (int n:arr)
        {
            if(max<n)
                max=n;
        }

    }

    public int getMax() {
        return max;
    }


}
