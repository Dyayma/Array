# Array
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        
        for( int i = 0; i < arr.length; i++){
            System.out.print("Enter Element" + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
       int [] posArray = new int [size];
       int [] negArray = new int [arr.length];
       int posCount = 0, negCount = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > 0){
               posArray[posCount] = arr[i];
               posCount++;
           }else {
               negArray[negCount] = arr[i];
               negCount+=1;
           }
       }
       System.out.print("\nOriginal Arrays: ");
       for(int i = 0; i < arr.length; i++){
           System.out.print("\t" + arr[i] + "\t");
       }
       System.out.print("\nPositive Element: ");
       for(int i = 0; i < posCount; i+=1){
           System.out.print("\t" + posArray[i] + "\t");
    }
       System.out.print("\nNegative Element: ");
       for(int i = 0; i < negCount; i+=1){
           System.out.print("\t" + negArray[i] + "\t");
       }
    }
}
    
