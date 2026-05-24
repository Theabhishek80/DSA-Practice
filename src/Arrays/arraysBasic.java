package Arrays;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;
import java.util.Scanner;

public class arraysBasic {
    public static void main(String[] args) {


        // liniar search problem
        //arr = [4, 7, 1, 9, 3]
        //target = 9
        //Output = 3

        //first approach
//       int []arr = {4,7,1,9,3};
//       int target = 0;
//        int index = -1;
//
//        for(int i=0; i<arr.length; i++){
//            if (arr[i]==target) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

//        System.out.println(liniearSearch(arr , target));
//    }
//    static  int liniearSearch(int [] arr ,int target ){
//        for(int i =0; i<arr.length; i++){
//            if(arr[i]==target){
//                return i;
//            }
//        }
//        return -1;
//        Scanner in = new Scanner(System.in);
//
//        int row = in.nextInt();
//        int col = in.nextInt();
//
// int [][] arr = new int [row][col];

        // for input
// for (int i =0; i<arr.length; i++){
//     for (int j =0; j<arr[i].length; j++){
//         arr [i][j] = in.nextInt();
//     }
// }


// for output
//        for(int i =0; i<arr.length; i++){
//            for(int j =0; j<arr[i].length; j++){
//                System.out.print(arr[i] [j] + " ");
//            }
//            System.out.println();
//        }
//
//
//


//        int [][] arr = {
//                {1,3,5,6,},
//                {3,4},
//                {3,3,3}
//        };
//
//        for (int i = 0; i <arr.length ; i++) {
//          for (int j=0; j<arr[i].length; j++){
//              System.out.print(arr[i][j]+" ");
//          }
//            System.out.println();
//        }
//

        // question swap the element
//        int[] arr = {3, 4, 5, 6, 2, 3};
//        swap(arr, 0, 2);
//        System.out.println(Arrays.toString(arr));
//
//
//    }
//
//    static void swap(int[] arr, int index1, int index2) {
//
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;


        // question 2 find the largest element

//        int[] arr = {10, 20, 30, 40, 50,755,80000,3485,69999999};
//        System.out.println(largestElement(arr));
//


// reverse an array

//        int[] arr = {10, 20, 30, 40, 50,755};
//        reverseArray(arr);
//        System.out.println(Arrays.toString(arr));
//

//
//
//
//

        // revese of array function code
//    static void reverseArray(int[] arr){
//        int start =0;
//        int end = arr.length -1;
//        while (start<end){
//            //swap
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start ++;
//            end --;
//
//        }


        // largest element function code
//  static int largestElement(int [] arr){
//        int maxindex = 0;
//        if(arr == null || arr.length ==0){
//            return -1;
//        }
//
//
//        for (int i =1; i<arr.length; i++){
//            if(arr[i]> arr[maxindex]){
//                maxindex = i;
//            }
//        }
//        return maxindex;


        // rivision of the basic question of the array
        //swaping values in an array


        int[] arr = {1, 2, 3, 4, 5, 6,78,96};
//        swap(arr, 0, 5);


        // find the max element in arr


        System.out.println(MaxElement(arr));

        // reverse the array
ReverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }






     static void ReverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            swap( arr, start,end);


            start++;
            end--;

        }
     }

    static int MaxElement(int [] arr){
        int maxindex = 0;
        for (int i =0; i<arr.length; i++){
            if (arr[i]>arr[maxindex]){
  maxindex =i;
            }
        }
   return maxindex ;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}