package kz.gb.kanat;


public class Main {
    public static void main(String[] args) {
    fromOneToOneHundred();
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
}
