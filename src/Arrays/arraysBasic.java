package Arrays;

public class arraysBasic {
    public static void main(String[] args) {


        // liniar search problem
        //arr = [4, 7, 1, 9, 3]
        //target = 9
        //Output = 3

        //first approach
       int []arr = {4,7,1,9,3};
       int target = 0;
//        int index = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if (arr[i]==target) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

        System.out.println(liniearSearch(arr , target));
    }
    static  int liniearSearch(int [] arr ,int target ){
        for(int i =0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}