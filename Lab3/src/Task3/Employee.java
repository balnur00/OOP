package Task3;

public class Employee extends Person {
    private int salary;
    private int year;
    private String insuranceNumber;
    Employee(){

    }

    public Employee(String name, String iN, int s, int y){
        super(name);
        this.salary = s;
        this.insuranceNumber = iN;
        this.year = y;
    }
    public double getSalary(){
        return salary;
    }
    public int getYear(){
        return year;
    }
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
    public String toString(){
        return "Employee's name:\t" + getName() +"\n"+
                "Income:   \t" + getSalary()+"\n" +
                "Year of intrance:\t" + getYear() + "\n" +
                "Insurance number:\t" + getInsuranceNumber() + "\n";
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
