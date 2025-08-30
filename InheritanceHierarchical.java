//parent with 2 children
class Emp{
    int Emp_id;
    String Emp_name;
    static String Organisation="KIET";
    
    void details(){
        System.out.println("  Emp ID: " +Emp_id +"\n"+"  Name: "+Emp_name+"\n"+"  Organisation: "+Organisation);
    }
}

class fclty extends Emp{
    String Department;
    String subject;
    String Designation;
    void facultyDetails(){
        System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
    }  
    
}

class Staff extends Emp{
    String expertise;
    char shift;
    void staffDetails(){
        System.out.println(Emp_name+" is working as "+expertise+"\n"+"  Shift is: " +shift);
    }
}

public class InheritanceHierarchical {

    public static void main(String[] args) {

    fclty f=new fclty();
    f.Emp_id=101;
    f.Emp_name="Aditi";
    f.Department="AIML";
    f.subject="English";
    f.Designation="Assitant Prof";


    System.out.println("Details of the Faculty are:" );    
    f.details();
    f.facultyDetails();

    System.out.println("------------------------------");

    Staff s1=new Staff();

    s1.Emp_id=111;
    s1.Emp_name="Krish";
    s1.expertise="Librarian";
    s1.shift='A';

    System.out.println("Details of Staff Members:");
    s1.details();
    s1.staffDetails();
        
    }
    
}