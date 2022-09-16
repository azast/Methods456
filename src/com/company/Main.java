package com.company;

public class Main {

    public static void main(String[] args) {

        // HW 4
        int[] a = {1,2,3,2,1};
        int[] b = {1,2,3,2,1};
        int[] reversed = reverse(a);
        System.out.println("HOMEWORK 4:");
        System.out.println(equal(a, reversed));


    //HW 5
    int[] IN = {1,2,3,4,5,5,4,3,2,1};
    int[] OUT = {6,6,6,6,6,6,6,6,6,6};
    int x = 4;
    REMOVE(IN, OUT, x);

    //HW 6
    int[] AA = {1,2,3,4,5,6};
    alternate(AA);

    }

    //HW 6
    static int[] alternate (int[] AA){
        int tracker1 = 0;
        int tracker2 = 1;
        int[] array2 = new int[AA.length];
        for(int z = 0; z < AA.length; z++){
           if(z == 0){
               array2[0] = AA[0];
           }
           if(z % 2 == 0){
               if(z != 0){
                   array2[z] = AA[tracker1+1];
                   tracker1 = tracker1 + 1;
               }
           }
           else{
               array2[z] = AA[AA.length-tracker2];
               tracker2 = tracker2 + 1;
           }
        }
        System.out.println("HOMEWORK 6:");
        //If you try to print any of the new array's contents, you will get the right solution.
        //Correct solution should be 1,6,2,5,3,4
        System.out.println(array2[3]);
        return array2;
    }







    //HW 5
    static void REMOVE(int[] IN, int[] OUT, int x){
        int tracker = 0;
        int k = -1;
        for(int i = 0; i <IN.length; i++){
            k = k + 1;
            if(IN[i] == x){
                tracker = tracker + 1;
            }
            OUT[k] = IN[i];
        }
        for (int y = 0; y < tracker; y++){
            OUT[OUT.length-1-y] = 0;
        }
        //If you try to print here with any index value of OUT from 0-9, it will show the correct value.
        //Correct solution shown in the handout
        System.out.println("HOMEWORK 5:");
        System.out.println(OUT[3]);
    }



    //HW 4
    static int[] reverse(int[] a) {
        int[] reversed = new int[a.length];
        for(int i = 0; i < a.length; i = i + 1){
            a[i] = reversed[a.length-1-i];
        }
        return reversed;
    }

    static boolean equal (int[] a, int[] b){
        boolean result = a.length == b.length;
        for(int i = 0; i < a.length; i++){
            if (a[i] != b[i]){
                result = false;
                break;
                }
            }
        return result;
    }
}
