package Task2;

public abstract class Cube extends Shapes {
    private int a;
    public Cube(String name, int b){
        super(name);
        this.a = b;
    }

    public double Volume(int a){
        return a*a*a;
    }
    public double Area(int a){
        return a*a;
    }

}
