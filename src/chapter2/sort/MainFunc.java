package chapter2.sort;

import java.util.Random;

public class MainFunc
{
    public static void main(String[] args)
    {
        int N = 20;
        Random random = new Random();
        Double[] a = new Double[N];
        for(int i = 0; i < N; i++)
        {
            a[i] = random.nextDouble()*10;
        }
        Action.show(a);
        Merge.sort(a);
        Action.show(a);
    }
}
