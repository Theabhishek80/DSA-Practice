package LiniearSearch;

public class searching_InArray {
    public static void main(String[] args) {
        // liniear search
//        int [] arr ={3,4,2,6,77,5,54};
//        System.out.println(searchElement(arr,3 ));
//    }
//
//
//    static int searchElement(int [] arr , int target){
//
//        if(arr == null || arr.length ==0){
//            return -1;
//        }
//        boolean found = false;
//
//        for (int index = 0; index<arr.length; index++){
//            if(target == arr[index]){
//                return  index;
//
//
//            }
//
//        }
//
//  return -1;

        int[] arr = {33, 2, 64, 666, 89, 30, 23};
        int target = 30;

        System.out.println(SearchInRange(arr,target,3,5));


    }
     static int SearchInRange(int [] arr, int target,int start,int end){

       if(arr ==null||arr.length==0){
           return -1;
       }
        for (int i =start; i<=end; i++) {
            if (target ==arr[i]){
                return  i;
            }
        }
        return -1;
     }


}