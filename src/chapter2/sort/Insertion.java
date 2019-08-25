package chapter2.sort;

public class Insertion extends Action
{
    public static void sort(Double[] a)
    {
        //升序
        int N = a.length;
        for (int i = 1; i < N; i++)
        {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
            {
                exch(a, j, j-1);
            }
        }
    }
}
