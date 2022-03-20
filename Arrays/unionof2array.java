package Arrays;

import java.util.HashSet;


public class unionof2array {
    public static int doUnion(int a[], int n, int b[], int m) {
        // Your code here
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < n; i++)
            hset.add(a[i]);
        for (int j = 0; j < m; j++)
            hset.add(b[j]);
        return hset.size();
    }
}