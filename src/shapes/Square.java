package shapes;

public class Square  extends Quadrilateral{

    protected int sides;

    public Square(){}

    public Square(int sides){
        super.length = sides;
        super.width = sides;
        this.sides = sides;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
