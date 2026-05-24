package sorting;

import java.util.Arrays;

public class sorting {
    //bubble sort
    public static void main(String[] args) {
        int[] arr = {10,3,77,54,2,1,64};

//        for (int i = 0; i <arr.length-1 ; i++) {
//            for(int j= 0; j<arr.length-i-1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//

        // selection sort


        for (int i = 0; i<arr.length-1; i++ ){
            int minIndex = i;
            for (int j =i+1; j<arr.length; j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }

            }
            // swaping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;


        }
        System.out.println(Arrays.toString(arr));



    }
}
