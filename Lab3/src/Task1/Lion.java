package Task1;

import Task1.Animal;

public class Lion extends Animal {
    private String gender;
    private int id;
    public Lion(){
        super();
        gender = "unavailable";
    }
    public Lion(String new_name, String new_gender){
        super(new_name);
        this.gender = new_gender;
    }

    public String getGender(){
        return gender;
    }
    public void setGender(String newGen){
        gender = newGen;
    }
    public void setId(int new_id){
        id += new_id;
    }

    public void DoIt(String gender){
        gender = "unavailable";
    }
    public void DoIt(int id){
        id = 0;
    }
}