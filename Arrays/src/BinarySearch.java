public class BinarySearch {
    public static int binarySearch_logic(int arr[], int key){
        int start =0, end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) /2 ;
            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] > key) { // mid-value of arr is greater than key so
                end = mid - 1; // we will update end value and search in first half of arr

            }
            else{ // mid-value is less than the key value
                start = mid + 1; // we search key value in 2nd half by updating start
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 6;
        int index = binarySearch_logic(arr,key);
        System.out.println("index of key is "+index);
    }
}
