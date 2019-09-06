package chapter2.sort;

/***
 * 归并排序
 */
public class Merge extends Action
{
    private static Double[] aux; // 归并所需要的辅助数组

    public static void sort(Double[] a)
    {
        aux = new Double[a.length]; // 一次性分配空间
        sort(a, 0, a.length-1);
    }

    private static void sort(Double[] a, int lo, int hi)
    {
        //将数组a[lo, hi]排序
        if(hi <= lo) return;
        int mid = lo + (hi-lo)/2;
        sort(a, lo, mid); //将左半部分排序
        sort(a, mid+1, hi); // 将右半部分排序
        merge(a,lo,mid,hi);
    }

    public static void merge(Double[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid+1;

        for(int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi ; k++)
        {
            if(i>mid)
                a[k] = aux[j++];
            else if(j>hi)
                a[k] = aux[i++];
            else if(less(aux[j], aux[i]))
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }
}
