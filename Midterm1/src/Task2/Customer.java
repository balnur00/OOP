package Task2;

public class Customer {
    public String name;
    public boolean member = false;
    public String memberType;

    public Customer(String name, boolean member, String memberType){
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public boolean isMember(){
        if(member == true)
            return true;
        return false;
    }
    public void setMember(boolean member1){
        member = member1;
    }
    public String getMemberType(){
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Name:" + getName()+ "Membership:" + isMember() + "Member Type:" + getMemberType();
    }
}
