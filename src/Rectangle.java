public class Rectangle {
    public int height;
    public int width;
    public Point topLeft;

    public Rectangle(int height,int width,Point topLeft){
        this.height = height;
        this.width = width;
        this.topLeft = topLeft;
    }

    public int getArea(){
        return this.width * this.height;
    }

    public int getPerimeter(){
        return 2*(this.width + this.height);
    }

    public Point getBottomRight(){
        int bottomRightX = this.topLeft.x + this.width;
        int bottomRightY = this.topLeft.y + this.height;
        return new Point(bottomRightX,bottomRightY);
    }
}
