package Day9;

public class SortedRotated {
    public static int index(int nums[],int target){
        int first=0;
        int last=nums.length-1;
        while(first<=last){
        int mid=(first+last)/2;
        if(target==nums[mid]){
            return mid;
        }
        if(nums[first]<=nums[mid]){
            if(target>=nums[first] && target<=nums[mid]){
              last=mid;
            }

            else{
                first=mid+1;
            }

        }
        else{
            if(target>=nums[mid+1] && target<=nums[last]){
                first=mid+1;
            }
            else{
                last=mid;
            }
        }
        }
    return -1; 
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,0,1,2,3};
        int target=3;
        System.out.println((index(nums,target)));
    }
    
}
