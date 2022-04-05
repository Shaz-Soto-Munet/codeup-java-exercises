package shapes;

public class Square  extends Rectangle{

//    private int side;

    public Square(int side){
        super(side, side);
    }

    public int getArea(){
        System.out.println("Square class getArea() ran");
        return this.getWidth() * this.getWidth();
    }

    public int getPerimeter(){
        System.out.println("Square class getPerimeter() ran");
        return 4 * this.getWidth();
    }
}
