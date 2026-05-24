package LiniearSearch;
public class EvenDigiit {
                public static void main(String[] args) {

                    int[] nums = {12, 345, 2, 6, 7896};

                    int count = 0;

                    for (int num : nums) {
                        System.out.println(num);
                        if (even(num)) {

                            count++;

                        }
                    }

                    System.out.println(count);
                }

                // check digits are even or not
                static boolean even(int num) {
                    int numberOfDigits = digit(num);
                    return numberOfDigits % 2 == 0;
                }

                // count number of digits
                static int digit(int num) {

                    if (num == 0) return 1; // IMPORTANT fix

                    int count = 0;

                    while (num > 0) {
                        count++;
                        num = num / 10;
                    }

                    return count;
                }
            }
