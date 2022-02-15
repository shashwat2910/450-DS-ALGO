package Arrays;

public class negativelementsatend {
    public static void main(String[] args) {
        int arr[] = {1,-1,3,2,-7,-5,11,6};
        int n = arr.length;
        elementsatend(arr, n);
        printArray(arr, n);
    }
    static void elementsatend(int arr[], int n) {
        int temp[] = new int[n];
        int j=0;
        for(int i=0;i<n;i++) {
            if(arr[i]>=0)
                temp[j++] = arr[i];
        }
        for(int i=0;i<n;i++) {
            if(arr[i]<0)
                temp[j++] = arr[i];
        }
        for(int i=0;i<n;i++) {
            arr[i] = temp[i];
        }
    }
    static void printArray(int arr[], int n) {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
