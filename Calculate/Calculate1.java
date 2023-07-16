package Calculate;

import java.util.Scanner;
public class Calculate1 {
    public static void main(String[] args){
        //creat a scanner method
        Scanner kb = new Scanner(System.in);
        int base = 0, pow = 0, ex = 0;
        System.out.print("Enter the base: ");
        base = kb.nextInt();
        System.out.print("Enter the exponent: ");
        ex = kb.nextInt();
        pow = power(base,ex);
        System.out.println("Factorials\n1!=1");
        System.out.println("2!=2");
        System.out.println("3!=6\n...");
        System.out.println(base + " to the power of " + ex + " is " + pow);
    }
    //power method can return the base to the power ex
    public static int power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        else{
            return (x * power(x, n-1));
        }
    }
}//end class
