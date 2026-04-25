class FirstOccurence{
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3};
        int target=2;
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int frstOcc=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                frstOcc=mid;
                high=mid-1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;     // Target is to the right
            } 
            else {
                high = mid - 1;    // Target is to the left
            }
        }
        
        if (frstOcc != -1) {
            System.out.println("First occurrence of " + target + " is at index: " + frstOcc);
        } else {
            System.out.println("Target not found.");
        }
    }
}