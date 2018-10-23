package Task3;

public class Manager extends Employee {

    private String team;
    private int bonus = 100;

    Manager() {
        team = "no_name";
    }

    Manager(String name, int salary, int year, String insuranceNumber, String team) {
        super(name, insuranceNumber, salary, year);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public String toString() {
        return "Manager of department:\t" + getName() + "\n" +
                "Income:   \t" + getSalary() + "\n" +
                "Year of intrance:\t" + getYear() + "\n" +
                "Insurance number:\t" + getInsuranceNumber() + "\n" +
                "Team:\t" + getTeam();
    }

    public boolean equals(Object o) {
        if (o instanceof Manager) {
            Manager m = (Manager) o;
            if (super.equals((Employee) m)) {
                if (team == m.team) {
                    if (bonus == m.bonus) {
                        return true;
                    }

                }
            }
            return false;
        }
        return false;
    }

};

    public void bonus(){
        if(getYear() <= 2009){
            bonus = 1000;

            System.out.println(String.format("Team of %s gets bonuses to salary %d", getName(), bonus));
        }
    }
    public static void main (String [] args){
        Manager mn1 = new Manager("Dariga", 200000, 2010, "6545", "Rocks");
        Manager mn = new Manager("Dana", 200000.0, 2009, "7878", "Achievers");
        String s = mn.toString();
        String ss = mn1.toString();
        boolean equals = s.equals(ss);
        System.out.println(s + "\n" + ss + "\n" + equals);
        mn1.bonus();
        mn.bonus();

    }

}
