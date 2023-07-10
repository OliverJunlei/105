import java.util.Scanner;//import the Scanner class

public class demo1 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        for(int i=0; i<a; i++){
            Rectangle rectangle1, rectangle2;
            //user will input value about first rectangle

            double x1 = kb.nextDouble();
            double y1 = kb.nextDouble();
            double w1 = kb.nextDouble();
            double h1 = kb.nextDouble();
            rectangle1 = new Rectangle(x1,y1,w1,h1);
            //print the first rectangle and some values
            System.out.println("\nThe first Rectangle's top corner is: " + x1 + ", " + y1);
            System.out.println("It's width is: " + w1);
            System.out.println("It's height is: " + h1);

            double x2 = kb.nextDouble();
            double y2 = kb.nextDouble();
            double w2 = kb.nextDouble();
            double h2 = kb.nextDouble();
            rectangle2 = new Rectangle(x2,y2,w2,h2);
            //print the second rectangle and some values
            System.out.println("\nThe second Rectangle's top corner is: " + x2 + ", " + y2);
            System.out.println("It's width is: " + w2);
            System.out.println("It's height is: " + h2);

            //check a rectangle contain by another rectangle or not
            boolean contain;
            contain = rectangle1.contains(rectangle2);
            if(contain){
                System.out.println("\nThe 'contains' method returns: true");
            }
            else{
                System.out.println("\nThe 'contains' method returns: false");
            }
            //check a rectangle is touches another rectangle or not
            boolean touches;
            touches = rectangle1.touches(rectangle2);
            if(touches){
                System.out.println("The 'touches' method returns: true");
            }
            else{
                System.out.println("The 'touches' method returns: false");
            }
        }
    }
}//end class
