package Task3;

public abstract class Circle extends Shape {
    public double radius;
    public Circle(){};

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double new_radius) {
        radius = new_radius;
    }

    @Override
    public double getArea() {
        double res = Math.PI * radius * radius;
        return res;
    }

    @Override
    public double getPerim() {
        double res = Math.PI * radius;
        return res;
    }

    @Override
    public String toString() {
        return super.toString() + "Radius:\t" + radius + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle) obj;
        if(c.radius == ((Circle) obj).radius){
            if(c.filled == ((Circle) obj).filled){
                if(c.color == ((Circle) obj).color){
                    return true;
                }
            }
            return false;
        }

    }
}
