package fibonacci;

public class demo1 {
    public static void main(String[] args) {
        int i=0;
        //first 20 num in fibonacci series
        for (int j=0; j<=20; j++ ) {
            i = fib(j);
            System.out.print(i + " ");
        }

    }
    //creat a method called fib
    public static int fib(int n){
        //base case
        if (n==0 ){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        //glue case
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }
}//end class

