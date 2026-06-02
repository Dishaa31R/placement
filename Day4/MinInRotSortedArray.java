package Day4;

public class MinInRotSortedArray {
    public static void main(String args[]){
       int[] arr={3,4,1,5,2};
       // int[] arr={11,12,13,14};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[right])
                left=mid+1;
            else right=mid;
        }
        System.out.println((arr[left]));
    }
}
