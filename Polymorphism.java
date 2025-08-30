class EmployeePoly{
    String Emp_name;

//Method overloading or compile time polymorphism means same method name with diff parameters

    
    void details(){
        System.out.println("Name: "+Emp_name);
    }
    
    void details(int salary){
        System.out.println("Salary: "+salary);
    }
    
    void details(String company){
        System.out.println("Company: "+company);
    }
    //order can be change too
     void details(int salary,String company){
        System.out.println("Salary: "+salary +" Company: "+company);
    }
    void details(String company,int salary){
        System.out.println("Company: "+company +" Salary: "+salary );
    }
}

class Faculties extends EmployeePoly{
    
    //Overriding or runtime polymorphism
    

    void details(){
        super.details(); 
        System.out.println("Overriding in child class.");
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        EmployeePoly ep=new EmployeePoly(); 
        ep.Emp_name="Vanshika";
        ep.details();
        ep.details(3000000);
        ep.details("Kiet");
        ep.details(500000,"Google");
        ep.details("Netflix",800000);



        
        Faculties fc=new Faculties();
        fc.Emp_name="Vanshika"; 
        fc.details();
    }
}

