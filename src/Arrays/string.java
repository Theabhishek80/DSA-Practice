package Arrays;

import java.util.Scanner;

public class string {

    public static void main(String [] args){

        // ways to create the string
       /*  first way - stiring litrals = here we use the string pools like
        if we create the sring through string literlas than it save on strin pool
        and we create same seqence of char string than it point same string other referce also


        */
//        String str = "abhishek";
//        // second way to create the string
//        String sc = new String("abhishek");
//
//        if (str == sc) {
//            System.out.println("string are eqal");
//        }
//        else{
//            System.out.println("not equal");
//        }
//

        // input methd in string

//        Scanner sc = new Scanner(System.in);
//        System.out.println("provide the string content");
//        String str = sc.nextLine();
//        System.out.println("value :" + str);
//        String str2 = sc.next();

// common string methods


        String str = " my, name, is,abhishek ,kumar";

       String[] wrods =  str.split(",");
       for ( String str1: wrods){
           System.out.println(str1);
       }

//        System.out.println(str.length());   // to find the string lenghth
//        System.out.println(str.charAt(4));  // to find at index what char
//        System.out.println(str.substring(2,5)); // to find substring based on range of the indexes
//        System.out.println(str.equals(str2));  // to find the string are eqals or not with case senstinve small and capitial notice
//        System.out.println(str.equalsIgnoreCase(str2)); // here we igonore the case senstiveness same cahr if they are one capital and another small than they are also eqal
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toLowerCase());
//
//        System.out.println(str.length());
//        str = str.trim();
//        System.out.println(str.length());
//
//        System.out.println(str.contains("shek"));


// to convert any data tupe into string we use the value of method
//
//int  num = 38;
//        System.out.println(num+2);
//String str1 = String.valueOf(num);

//        System.out.println(str1+2);

//        String h = "abhishek";
//        char [] crr = h.toCharArray();
//        for (char ch: crr){
//            System.out.print(ch);
//        }


    }


}
