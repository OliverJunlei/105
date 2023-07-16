package Calculate;

import java.util.Scanner;
public class Calculate2 {
    public static void main(String[] args){
        //creat a Scanner method
        Scanner kb = new Scanner(System.in);
        int x = 0;
        //ask users to enter a integer
        System.out.println("Enter a integer:");
        x = kb.nextInt();
        //use countDown method
        countDown(x);
        System.out.print("BlastOff!");
    }
    //creat a method called countDown
    public static void countDown(int x){
        //Discussion by situations
        if (x==1){//if uses type 1 then the result is 1
            System.out.print("1\t");
        }
        else if (x==0){//if users type 0 then return BlastOff!
            return;
        }
        else{
            System.out.print(x + "\t");
            countDown(x - 1);
        }
    }
}//end class

