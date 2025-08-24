package KIET;

public class EmployeeKIET {
    public String Emp_name;//public access modifier
    private int Salary;//private access modifier
    protected int Emp_id;//protected access modifier
    String Organisation; //default access modifier

    void empD(){
        System.out.println("Details are: "+Emp_id+" "+Emp_name+" "+Salary+" "+Organisation);
    }
    public static void main(String[] args) {
        EmployeeKIET ek=new EmployeeKIET();
        ek.Emp_id=1;
        ek.Emp_name="Aditi";
        ek.Salary=200000;
        ek.Organisation="KIET GROUPS";

        ek.empD();
    }
}