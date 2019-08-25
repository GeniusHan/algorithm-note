package chapter2.sort;

public class Selection
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

    /**
     * 交换
     * @param a
     * @param i
     * @param j
     */
    private static void exch(Double[] a, int i, int j)
    {
        Double t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 比较元素大小
     * @param v
     * @param w
     * @return
     */
    private static boolean less(Double v, Double w)
    {
        return v.compareTo(w) < 0 ;
    }

    /**
     * 输出排序结果
     * @param a
     */
    public static void show(Double[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
