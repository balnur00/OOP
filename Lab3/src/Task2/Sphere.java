package Task2;

public abstract class Sphere extends Shapes{
    private int radius;

    public Sphere(String name, int radius){
        super(name);
        this.radius = radius;
    }
    public double Volume(int r){
        return 4/3* Math.PI * r*r*r;
    }
    public double Area(int r){
        return Math.PI * r*r;
    }
}
