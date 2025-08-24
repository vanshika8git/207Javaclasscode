
public class copyConst2{
    int Emp_id;
    String Emp_name;
    
    copyConst2(int id, String name){
        Emp_id=id;
        Emp_name=name;
    }
    copyConst2(copyConst2 e){ 
        Emp_id=e.Emp_id;
        Emp_name=e.Emp_name;
    }
    void getDetails(){
        System.out.println("Details are: "+Emp_id+" "+Emp_name);

    }
    public static void main(String[] args){
        copyConst2 e1=new copyConst2(101,"Vanshika");
        e1.getDetails();

        //Method2:
        copyConst2 e2_copy;
        e2_copy=e1;
        e2_copy.getDetails();

        
        e2_copy.Emp_id=102;
        e2_copy.Emp_name="Aditi";

        //Details after change
        System.out.println("Details after changing by copy: ");
        System.out.println("e2_copy details: ");
        e2_copy.getDetails();
        System.out.println("e1 details: ");
        e1.getDetails();
        //both e2 and e1 details are changed

    }
}