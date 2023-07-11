import java.util.Scanner;//import the Scanner class

public class demo2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int i = 0; i < n; i++){
            Circle Circle1, Circle2;
            //users will input value about first circle

            double x1 = kb.nextDouble();
            double y1 = kb.nextDouble();
            double r1 = kb.nextDouble();
            Circle1 = new Circle(x1, y1, r1);
            //print the first circle
            System.out.println("\nThe first Circle's centre is: " + x1 + ", " + y1);
            System.out.println("It's radius is: " + r1);
            System.out.printf("It's area is: %.1f ", Circle1.getArea());
            System.out.printf("\nIt's circumference is: %.1f ", Circle1.getCircumference());

            double x2 = kb.nextDouble();
            double y2 = kb.nextDouble();
            double r2 = kb.nextDouble();
            Circle2 = new Circle(x2, y2, r2);
            //print the second circle
            System.out.println("\nThe Second Circle's centre is: " + x2 + ", " + y2);
            System.out.println("It's radius is: " + r2);
            System.out.printf("It's area is: %.1f", Circle2.getArea());
            System.out.printf("\nIt's circumference is: %.1f ", Circle2.getCircumference());
            //check the first circle contains by another circle or not
            boolean contain;
            contain = Circle1.contains(Circle2);
            if(contain){
                System.out.println("\nThe 'contains' method returns: true");
            }
            else{
                System.out.println("\nThe 'contains' method returns: false");
            }
            //check the first circle is touches another circle or not
            boolean touches;
            touches = Circle1.touches(Circle2);
            if(touches){
                System.out.println("The 'touches' method returns: true");
            }
            else {
                System.out.println("The 'touches' method returns: false");
            }
        }
    }
}//end class
