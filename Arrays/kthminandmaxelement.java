package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;
public class kthminandmaxelement {
    public static void main(String[] args) {
        int arr[] = {20,10,60,30,50,40};
        int n=6, k=3;
        System.out.println("Max element: "+kthmaxelement(arr, n, k));
        System.out.println("Min element: "+kthminelement(arr, n, k));
    }
    static int kthmaxelement(int arr[], int n, int k) {
        // used min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // traverse array till k and add element in pq
        for(int i=0;i<k;i++)
            pq.add(arr[i]);
        // traverse from k till n and check whether top element is less than current arr[i]
        // if yes then pop the element and add a new one
        // then return the top element

        for(int i=k;i<n;i++) {
            if(pq.peek()<arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }

    static int kthminelement(int arr[], int n, int k) {
        // used max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // traverse array till k and add element in pq
        for(int i=0;i<k;i++)
            pq.add(arr[i]);
        // traverse from k till n and check whether top element is greater than current arr[i]
        // if yes then pop the element and add a new one
        // then return the top element
        for(int i=k;i<n;i++) {
            if(pq.peek()>arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();   
    }
}
