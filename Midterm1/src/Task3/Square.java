package Task3;

public abstract class Square extends Rectangle{
    double side = length;
    public Square(){};
    public Square(double side){
        //side = length;

        length = side;
        width = side;
    }
    public Square(double side, String color, boolean filled){
        super(color, filled);
        length = side;
        width = side;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double side1){
        side = side1;
    }

    @Override
    public void setWidth(double new_width) {
        super.setWidth(new_width);
    }

    @Override
    public void setLength(double new_length) {
        super.setLength(new_length);
    }

    @Override
    public String toString() {
        return super.toString() + "Side:\t" + side + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Square c = (Square) obj;
        if (c.width == ((Rectangle) obj).width) {
            if (c.length == ((Rectangle) obj).length) {
                if (c.filled == ((Rectangle) obj).filled) {
                    if (c.color == ((Rectangle) obj).color) {
                        return true;
                    }
                }
            }
        }
    }
}
