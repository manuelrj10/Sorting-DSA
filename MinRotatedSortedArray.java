
class MinRotatedSortedArray {

    public static void main(String args[]) {
        int arr[] = {2, 2, 2, 0, 1};
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                high--;
            }
        }
        System.out.println("found " + arr[low]);
    }

}
