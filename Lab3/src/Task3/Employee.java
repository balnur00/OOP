public class Employee extends Person {
    private int salary;
    private int year;
    private String insuranceNumber;

    public Employee(String name, String iN, int s, int y){
        super(name);
        this.salary = s;
        this.insuranceNumber = iN;
        this.year = y;
    }
    public String ToString(){
        return "Name:" + this.name + " Salary:" + this.salary + "Insurance Number: " + this.insuranceNumber + "Year: " + this.year;
    }

    @Override
    public boolean equals(Object o){
        Employee e = (Employee) o;
        if(super.equals(o)){
            if(this.salary == ((Employee) o).salary){
                if(this.insuranceNumber == ((Employee) o).insuranceNumber){
                    if(this.year == ((Employee) o).year){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
