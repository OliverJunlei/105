public class Circle { //import the Scanner class
    //instance variables
    private double xpos;
    private double ypos;
    private double radius;

    //constructors
    public Circle(){
    }

    public Circle(double xpos, double ypos, double radius){
        this.xpos = xpos;
        this.ypos = ypos;
        this.radius = radius;
    }

    //set method and get method
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setCenter(double xpos, double ypos){
        this.xpos = xpos;
        this.ypos = ypos;
    }

    public double getRadius(){
        return radius;
    }

    public double getXpos(){

        return xpos;
    }

    public double getYpos(){

        return ypos;
    }

    public double getArea(){

        return 3.14 * radius * radius;
    }

    public double getCircumference(){
        return 2 * 3.14 * radius;
    }

    //method to check a point(px,py) is contain by circle or not
    public boolean contains(double px, double py){
        double D = (Math.sqrt(Math.pow(xpos-px,2) + Math.pow(ypos-py,2)));
        return D<radius;
    }

    //method to check a point(px,py) is touches by circle or not
    public boolean touches(double px, double py){
        double D = (Math.sqrt(Math.pow(xpos-px,2) + Math.pow(ypos-py,2)));
        return D==radius;
    }

    //method to check a new circle is contains by circle or not
    public boolean contains(Circle c){
        double px = c.getXpos();
        double py = c.getYpos();
        double radius2 = c.getRadius();
        double D = (Math.sqrt(Math.pow(xpos-px, 2) + Math.pow(ypos-py, 2)));
        double gap = radius - radius2;
        return D<gap;
    }

    //method to check the second circle is touches the first circle or not
    public boolean touches(Circle c){
        double px = c.getXpos();
        double py = c.getYpos();
        double radius2 = c.getRadius();
        double D = (Math.sqrt(Math.pow(xpos-px, 2) + Math.pow(ypos-py, 2)));
        double gap = radius - radius2;
        double gap2 = radius + radius2;
        return D==gap || D==gap2;
    }
}
