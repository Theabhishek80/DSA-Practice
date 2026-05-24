package BinearySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

      //  int [] arr = {90,75,18,12,6,4,3,1};   decsending order
        int [] arr = {-18,-13,-9,-3,0,2,4,6,9,11,12,14,20,36,48,75,102,145};// aseding order
        int target  = 75;

        System.out.println( searchTheTarget(arr, target));
    }


// return the index;
// if not found return the -1;

    static int searchTheTarget(int [] arr , int target) {
// start and end not the value of the index it is index itself
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending order or descending

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }


        }
        return -1; // not found

    }
}



