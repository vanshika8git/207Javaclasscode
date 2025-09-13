
class invalidEmpID extends Exception{ 
    invalidEmpID(String msg){                                                                 
        super(msg); 
    }
}
class Emp_loyee{
    int id;
    String name;
    Emp_loyee(int id,String n) throws invalidEmpID{ 
        if(id<=0){
            throw new invalidEmpID("Must be positive id or not equal to 0."); 
        }
        this.id=id;
        name=n;
        System.out.println("Employee created: "+id+" "+name);
    } 
}
//tester class
public class ExceptionUserDefined {
    public static void main(String[] args) {
        try{
            Emp_loyee m=new Emp_loyee(101, "Ak"); //valid
            Emp_loyee e=new Emp_loyee(0, "Vanshika"); //invalid
            
        }
        catch(invalidEmpID e){
            System.out.println("Custom Exception: "+e);
        }
    }
    
}
