package Arrays;

class ReverseAnArray {
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1,2,3,4,5};
        reverse(arr, n);
        print(arr, n);
    }
    // function to reverse an Array
    
    static void reverse(int arr[], int n) {
        int i=0,j=n-1;
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    // function to print the array

    static void print(int arr[], int n) {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
