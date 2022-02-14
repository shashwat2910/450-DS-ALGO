package Arrays;
// sort an array of 0,1&2 without sorting algo
public class sortwithoutsortingalgo {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0};
        int n=5;
        sortArray(arr, n);
        printArray(arr, n);
    }
    static void printArray(int arr[], int n) {
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    static void sortArray(int arr[], int n) {
        // to count number of zeroes, ones and twos in array
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i=0;i<n;i++) {
            if(arr[i]==0)
                ++cnt0;
            else if(arr[i]==1)
                ++cnt1;
            else
                ++cnt2;
        }
        int i=0;
        while(cnt0>0) {
            arr[i++] = 0;
            cnt0--;
        }
        while(cnt1>0) {
            arr[i++] = 1;
            cnt1--;
        }
        while(cnt2>0) {
            arr[i++] = 2;
            cnt2--;
        }
    }
}
