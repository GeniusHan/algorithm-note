package chapter2.sort;

public class Shell extends Action {

    public static void sort(Double[] a)
    {
        // 将a[]按升序排列
        int N = a.length;
        int h = 1;
        while (h < N/3) h = h*3 + 1;
        while (h >=1)
        {
            //将数组变为h有序
            for (int i = h; i < N; i++)
            {
                // 将a[i]插入到a[i-h],a[i-2*h],a[i-3*h]...之中
                for (int j = i; j >= h && less(a[j],a[j-h]) ; j -= h)
                {
                    exch(a, j, j-h);
                }
            }
            h = h/3;
        }
    }
}
