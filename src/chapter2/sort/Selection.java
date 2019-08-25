package chapter2.sort;

public class Selection extends Action
{
    public static void sort(Double[] a)
    {
        // 将a[]按升序排列
        int N = a.length;
        for (int i = 0; i < N; i++)
        {
            //将a[i]和a[i+1...N中最小的元素交换
            int min = i;
            for(int j = i+1; j < N; j++)
            {
                if(less(a[j], a[min])) min = j;
            }
            //交换
            exch(a,i,min);
        }
    }
}
