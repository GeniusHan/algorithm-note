package chapter2.sort;

import java.util.Random;

public class MainFunc
{
    public static void main(String[] args) {
        Random random = new Random();
        Double[] a = new Double[10];
        for(int i = 0; i < 10; i++)
        {
            a[i] = random.nextDouble()*10;
        }
        Selection.show(a);
        Selection.sort(a);
        Selection.show(a);
    }
}
