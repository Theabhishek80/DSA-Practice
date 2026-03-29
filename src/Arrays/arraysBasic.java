package Arrays;

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


        int [][] arr = {
                {1,3,5,6,},
                {3,4},
                {3,3,3}
        };

        for (int i = 0; i <arr.length ; i++) {
          for (int j=0; j<arr[i].length; j++){
              System.out.print(arr[i][j]+" ");
          }
            System.out.println();
        }

   }
}