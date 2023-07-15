package fibonacci;

import java.util.Scanner;
public class demo3 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int value = kb.nextInt();
        writeVertical(value);
    }
    //creat a method called writeVertical
    public static void writeVertical(int n){
        //base case
        if(n==0){
            return;
        }
        else if(n<=9){
            System.out.println("" + n);
            return;
        }
        //glue case
        else{
            writeVertical(n / 10);
            System.out.println("" + n%10);
        }
    }
}//end class