import java.util.*;
public class Employee {
    String name;
    int salary;
    public void getDetails(){
        System.out.println("Employee details: "+name+" "+salary);

    }
    public static void main(String[] args){
        Employee emp1=new Employee();
        Scanner sc=new Scanner(System.in);
        emp1.name=sc.nextLine();
        emp1.salary=sc.nextInt();
        emp1.getDetails();
        sc.close();

    }
}