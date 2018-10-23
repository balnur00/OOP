package Task2;

import Task2.Shapes;

public abstract class Cylinder extends Shapes {
    private int radius;
    private int height;

    public Cylinder(String name, int rad, int h){
        super(name);
        this.height = h;
        this.radius = rad;
    }
    public double Volume(int radius, int height){
        return Area(radius)*height;
    }
    public double Area(int radius){
        return Math.PI * radius*radius;
    }
}
