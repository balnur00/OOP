package Task3;

public abstract class Rectangle extends Shape {
    public double width;
    public double length;
    public Rectangle(){};
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double new_length) {
        length = new_length;
    }

    public void setWidth(double new_width) {
        width = new_width;
    }

    @Override
    public double getArea() {
        double res = width * length;
        return res;
    }

    @Override
    public double getPerim() {
        double res = 2*(width+length);
        return res;
    }

    @Override
    public String toString() {
        return super.toString() + "Width:\t" + width + "Length:\t" + length + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle c = (Rectangle) obj;
        if (c.width == ((Rectangle) obj).width) {
            if (c.length == ((Rectangle) obj).length) {
                if (c.filled == ((Rectangle) obj).filled) {
                    if (c.color == ((Rectangle) obj).color) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
