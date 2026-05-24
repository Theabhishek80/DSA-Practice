package BinearySearch;

/*______________________________________________________________

FIRST LECTURE 58 MINUTES
_________________________________________________________________ */

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;

        System.out.println(searchCeilingNumber(arr, target));
        System.out.println(searchFloorElement(arr,target));


    }



//        int [] arr = {-18,-13,-9,-3,0,2,4,6,9,11,12,14,20,36,48};
//        int target  = 33;
//
//        System.out.println( searchTheTarget(arr, target));
//    }


// return the index;
// if not found return the -1;

//    static int searchTheTarget(int [] arr , int target){
//
//        int start =0;
//    int end = arr.length-1;
//
//    while (start<=end){
//        int mid = start +(end-start)/2;
//        if (target==arr[mid]){
//            return mid;
//        }
//        if (target<arr[mid]){
//            end = mid -1;
//        }
//        else {
//            start = mid +1;
//        }
//
//    }
//return -1; // not found
//
//}

/*______________________________________________________________

        lecture 2
        question 1 find the ceiling number  -
smallest element ≥ target)
_________________________________________________________________ */


    static  int  searchCeilingNumber(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
      // find the given sorted aray is in the increasing order or decresing order
     // boolean isAsc = arr[start] <arr[end];

    while (start<=end){
        if (target>arr[end]){
            return -1;
        }


          int mide = start +(end-start)/2;
          if(target == arr[mide]) {
              return  mide;

          }
          if (target < arr[mide]){
              end = mide -1;
          }else{
              start = mide +1;
          }







      }
      return start;


    }





/*______________________________________________________________

        lecture 2
        question 1 find the floar number - Floor → largest ≤ target

_________________________________________________________________ */





    static int searchFloorElement(int [] arr, int target){
        int start  = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end - start) /2;

            if (target == arr[mid]){
                return mid;

            }
            if (target<arr[mid]){
                end= mid -1;

            }
            else{
                start = mid +1;
            }
        }
        return end;

    }



}



