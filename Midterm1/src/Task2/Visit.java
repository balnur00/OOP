package Task2;

public class Visit {
    public Customer customer;
    public String date;
    public double serviceExpense;
    public double ptoductExpense;

    public Visit(Customer customer, String date){
        this.date = date;
    }
    public String getName(){
        return customer.name;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getPtoductExpense() {
        return ptoductExpense;
    }

    public String getDate() {
        return date;
    }

    public void setPtoductExpense(double ptoductExpense) {
        this.ptoductExpense = ptoductExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public double getTotalExpense() {
        return getPtoductExpense() + getServiceExpense();
    }

    @Override
    public String toString() {

        return "Name:" + getName() + "Date:" + getDate() + "Product:" + getPtoductExpense() + "Service:" + getServiceExpense();
    }
}
