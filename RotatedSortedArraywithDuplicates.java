class RotatedSortedArraywithDuplicates{
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1};
        int target=0;
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("found at"+mid);
                return;
            }
            else if(arr[low]==arr[mid]&& arr[mid]==arr[high]){
                low++;
                high--;
            }
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=target && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<target && target <= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
     
    }
}