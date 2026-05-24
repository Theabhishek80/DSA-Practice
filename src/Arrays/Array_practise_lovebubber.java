package Arrays;

import java.util.Arrays;
// here the problem is the to find the largest and second largest element
public class Array_practise_lovebubber {

    public static void main(String[] args) {
        int []arr = {2,3,5,6,7,2,324,6,433,64,63};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i =0; i< arr.length; i++){
            if (arr[i]> largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!= largest){
                secondLargest = arr[i];

            }
        }

        System.out.println("largest elment :" + largest);
        System.out.println("secondlargest elment :" + secondLargest);


    }





}


