package kz.gb.kanat;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findMinMax();
    }
    public static void replaceZeroOne(){
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for(int i=0; i<arr.length; i++){
        if(arr[i]==1){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void fromOneToOneHundred(){
        int[] arr = new int[100];
        for (int i=0; i<arr.length; i++){
            arr[i]+=i;
            System.out.println(arr[i]+1);
        }
    }
    public static void toDivideNumbersLessThanSix(){
        int[] arr =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<arr.length; i++){
            if (arr[i]<6){
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    public static void fillDiagonal(){
        int[][] arr = new int[4][4];
        final Random random = new Random();
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                  arr[i][j]=1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void returnMassive() {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int initialValue = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
        public static void findMinMax(){
        int[] arr = new int[9];
        final Random random = new Random();
        for (int i=0;i<arr.length; i++){
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        int min = arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int max = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
            System.out.println();
            System.out.println("Minimum: " + min +"\nMaximum: "+ max );


    }
}
