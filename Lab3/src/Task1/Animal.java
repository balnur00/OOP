package Task1;

public class Animal {
    private String name;
    private int id;

    public Animal(){
        name = "no_name";
    }
    public Animal(String new_name){
        this.name = new_name;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setId(int new_id){
        id = new_id;
    }
}


