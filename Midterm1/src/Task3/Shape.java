package Task3;

public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape(){}
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String n_color){
        color = n_color;
    }
    public boolean isFilled(){
        if(filled == true)
            return true;
        return false;
    }
    public void setFilled(boolean bool){
        filled = bool;
    }
    public abstract double getArea();
    public abstract double getPerim();

    public String toString(){
        return "Color:\t" + getColor() + "\n" + "Filled:\t" + isFilled() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Shape sh = (Shape) obj;
        if(sh.color == ((Shape) obj).color){
            if(sh.filled == ((Shape) obj).filled)
                return true;
        }
        return false;
    }
}
