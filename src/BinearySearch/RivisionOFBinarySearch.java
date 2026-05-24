package BinearySearch;

public class RivisionOFBinarySearch {

    public static void main(String[] args) {
        // intilize the array and target and than right the statement to store the index values

        int[] arr = {3, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7};
        int target = 6;
        int[] result = SearchInRange(arr, target);
        System.out.println(result[0]);
        System.out.println(result[1]);



    }
    static int[] SearchInRange(int[] arr, int target){
        int [] ans = {-1,-1};

          ans[0] = find( arr,  target, true) ;
         ans [1] = find(arr,target,false);

        return ans;

    }

    static int find(int [] arr,int target,boolean FindstartIndex){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target < arr[mid]) {
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;

            }else {
                ans = mid;
                if (FindstartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}



