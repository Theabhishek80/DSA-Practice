package BinearySearch;

public class FindPositionElementOninfinitesortedarray {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 7, 9, 12, 15, 20, 25,30,300,2000,1000000};
        int target = 15;

        int ans = findPostion(arr,target);
        System.out.println(ans);


    }




    static int findPostion(int [] arr, int target){
        int start = 0;
        int end= 1;
        while ( target>arr[end]){
            int temp = end+1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binerysearch(arr,start,end,target);
    }

    static int binerysearch(int [] arr, int start,int end, int target){
      while (start<= end){
          int mid = start +(end -start)/ 2;
          if (target == arr[mid]){
              return mid;
          }
          else if (target<arr[mid]){
              end = mid-1;
          }else {
              start = mid +1;
          }
      }
      return -1;
    }

}
