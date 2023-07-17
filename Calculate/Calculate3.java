package Calculate;

import java.util.Scanner;
public class Calculate3 {
    public static void main(String[] args){
        //creat scanner method
        Scanner kb = new Scanner(System.in);
        int x = 0, y = 0;
        System.out.println("Enter a value:");
        x= kb.nextInt();
        System.out.println("How many multiples do you want?");
        y = kb.nextInt();
        System.out.println("The first " + y + " multiples of " + x + " are:");
        multiples(x, y);
    }
    //creat a method calleed multiples to calculate multiples of x
    public static void multiples(int x, int y){
        if (x==0 || y<=0){
            return;
        }
        else{
            multiples(x, y - 1);
            System.out.print(x * y + " ");
        }
    }
}//end class
