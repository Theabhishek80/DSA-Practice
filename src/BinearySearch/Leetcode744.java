package BinearySearch;

public class Leetcode744 {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
         char target = 'f';

        System.out.println(FindTheLargestChar(letters,target));


    }
    static char FindTheLargestChar(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid = start +(end -start)/2;
            if (target<letters[mid]) {
                end = mid - 1;
            }
            else {

                start = mid + 1;

            }
        }
        return letters[start%letters.length];
    }


}