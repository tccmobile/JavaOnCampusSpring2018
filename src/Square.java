public class Square extends Rectangle {

    public Square() {
    }

    public Square(int side) {
        super(side, side);
    }

    public void setSide(int side){
        setHeight(side);
        setWidth(side);
    }

    public int getSide(){
        return getHeight();
    }

    @Override
    public String toString() {
        return "Square{ side="+getSide()+" } ";
    }

    @Override
    public double calcArea() {
        return super.calcArea();
    }
}
