public abstract class Shapes {
    private String name;

    public Shapes(String new_name){

        this.name = new_name;
    }
    public String getName(){

        return name;
    }
    public abstract double Volume() ;
    public abstract double Area();

}
