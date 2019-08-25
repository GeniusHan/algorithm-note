package chapter2.sort;

public class Action
{
    /**
     * 交换
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Double[] a, int i, int j)
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
    public static boolean less(Double v, Double w)
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
