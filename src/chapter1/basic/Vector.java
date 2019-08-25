package chapter1.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vector {

    private final double[] coords;

    public Vector(double[] a)
    {
        coords = new double[a.length];
        for(int i=0; i<a.length; i++)
        {
            coords[i] = a[i];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(coords);
    }
}
