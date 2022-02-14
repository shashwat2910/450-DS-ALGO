package Arrays;

public class maxandminelement {
    public static void main(String[] args) {
        int n=6;
        int arr[] = {3,2,1,56,10000,167};
        System.out.println("Max element: "+maxelement(arr, n));
        System.out.println("Min element: "+minelement(arr, n));
    }
    // function to find max element
    static int maxelement(int arr[], int n) {
        int max = 0;
        for(int i=0;i<n;i++)
            max = Math.max(max, arr[i]);
        return max;
    }
    // function to find min element
    static int minelement(int arr[], int n) {
        int min = arr[0];
        for(int i=1;i<n;i++)
            min = Math.min(min, arr[i]);
        return min;
    }
}
