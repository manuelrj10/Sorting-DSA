class SearchSortedArray{
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        int target=5;

        int low =0;
        int mid=0;
        int high=arr.length-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                System.out.println("position"+mid);
                return;
            }
            if(arr[low]<=arr[mid]){

                
                if(arr[low]<=target && target<arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
    }
}