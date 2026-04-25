class LastOccurence{
    public static void main(String[] args) {
        int[] arr={1,2,2,2,3};
        int target=2;
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int lstOcc=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                lstOcc=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        if(lstOcc==-1){
                System.out.println("element not found");
            }
            else{
                System.out.println("element found at"+lstOcc);
            }
    }
}