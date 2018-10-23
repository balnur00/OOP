public abstract class Person {
     String name;

    public String getName() {
        return name; }

    public void setName(String name1){
        name = name1;
    }

    public Person(String name){

        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        if(this.name == p.name)
            return true;
        return false;
    }
    public String ToString(){
        return "Name:" + this.name;
    }
}
