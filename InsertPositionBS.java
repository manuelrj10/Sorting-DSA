class InsertPositionBS{
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int num=5;
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(low<=high){
             mid=low+(high-low)/2;
             if(arr[mid]==num){
                System.out.println("target found at"+mid);
                break;
             }
             else if(arr[mid]<num){
                low=mid+1;
             }
             else{
                high=mid-1;
             }


        }
        System.out.println("position the number to be inserted is"+low);
    }
}