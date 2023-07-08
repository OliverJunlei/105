public class Rectangle {
    //instance variables
    private double xpos, ypos, width, height;
    //constructors
    public Rectangle(){

    }

    public Rectangle(double xpos, double ypos, double width, double height){
        this.xpos=xpos;
        this.ypos=ypos;
        this.width=width;
        this.height=height;
    }

    //setters and getters
    public void setXpos(double xpos){
        this.xpos=xpos;
    }

    public void setYpos(double ypos){
        this.ypos=ypos;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public void setHeight(double height){
        this.height=height;
    }

    public double getXpos(){
        return this.xpos;
    }

    public double getYpos(){
        return this.ypos;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    //Method to check a point (px,py) is contained by rectangle
    public boolean contains(double px, double py){
        //if a point (px, py) is contained within this rectangle
        if( (xpos < px && px < (xpos+width)) && ((ypos < py && py < (ypos+height))) ){
            return true;
        }

        else{
            return false;
        }
    }

    //Method to check a point (px, py) toches rectangle
    public boolean touches(double px, double py){
        return ((((px == xpos) || (px == (xpos + width))) && ((py >= ypos) && (py <= (ypos + height)))) ||
                (((py == ypos) || (py == (ypos + height))) && ((px >= xpos) && (px <= (xpos + width)))));
    }

    //Method to check a rectangle is contained by another rectangle
    public boolean contains(Rectangle r){
        return (this.contains(r.getXpos(), r.getYpos()) && this.contains(r.getXpos() + r.getWidth(), r.getYpos() + r.getHeight()));
    }

    //Method to check a rectangle is touches by another rectangle
    public boolean touches(Rectangle r){
        return (this.touches(r.getXpos(), r.getYpos())) || (this.touches(r.getYpos(), (r.getXpos() + r.getWidth())))
                || (this.touches(r.getXpos(), (r.getYpos() + r.getHeight()))) || (this.touches((r.getXpos() + (r.getWidth())), (r.getYpos() + r.getHeight())));
    }
/*
    //Method to check a rectangle is overlap another rectangle or not
    public boolean overlap(Rectangle r) {
        if (((this.getXpos() == r.getXpos()) && (this.getYpos() == r.getYpos())) && (this.getWidth() == r.getWidth()) && (this.getHeight() == r.getHeight())) {
            return true;
        }
        else{return false;}
    }
*/
}
