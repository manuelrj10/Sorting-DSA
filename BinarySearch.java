
import java.util.Arrays;

class BinarySearch{
    int search(int arr[],int target){
       
       Arrays.sort(arr);
       int n=arr.length;
       if(n==0){
        return 0;
       }
       if(n==1){
        return 1;
       }

        //binary search
        int low=0;
        int high=arr.length-1;
        int mid=0;
        if(arr[low]==target){
            return low;
        }
        if(arr[high]==target){
            return high;
        }
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        BinarySearch bs=new BinarySearch();
        int[] arr={1, 3, 5, 7, 9, 11, 13,1};
        int target=9;
        int position=bs.search(arr, target);
        if(position==0){
            System.out.println("element not found");
        }
        else{
        System.out.println("position of target is"+position);
        }

    }
}