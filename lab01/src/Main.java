import java.util.Scanner;

public class Main{
    public static void sort(int [] n){
        for(int i = 0 ; i < n.length - 1 ; i++ ){
            boolean swaped = false;
            for (int j = 0 ; j < n.length -1 - i ; j++ ){
                if (n[j] > n[j+1]){
                    int temp = n[j];
                    n[j]=n[j+1];
                    n[j+1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                break;
            }
        }
    }
    public static void printArray(int [] m){
        for(int i = 0 ; i<m.length ; i++ ){
            System.out.println(m[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            System.out.print("Enter your total num : ");
            n = sc.nextInt();
            if(n<0){
                System.out.println("error");
            }
        }while (n<0);
        int num [] = new int[n];
        for(int i =0 ; i < num.length ; i++){
            System.out.print("enter your number " + (i+1) + "=");
            num[i] = sc.nextInt();
        }
        sort(num);
        printArray(num);
        sc.close();
    }
}