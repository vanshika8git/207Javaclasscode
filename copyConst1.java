public class copyConst1{
    int Emp_id;
    String Emp_name;
    
    copyConst1(int id, String name){
        Emp_id=id;
        Emp_name=name;
    }
    copyConst1(copyConst1 e){ 
        Emp_id=e.Emp_id;
        Emp_name=e.Emp_name;
    }
    void getDetails(){
        System.out.println("Details are: "+Emp_id+" "+Emp_name);

    }
    public static void main(String[] args){
        copyConst1 e1=new copyConst1(101,"Vanshika");
        e1.getDetails();

        //Method1:
        copyConst1 e2_copy;
        e2_copy=new copyConst1(e1);
        e2_copy.getDetails();

        
        e2_copy.Emp_id=102;
        e2_copy.Emp_name="Aditi";

        
        System.out.println("Details after changing by copy: ");
        System.out.println("e2_copy details: ");
        e2_copy.getDetails();
        System.out.println("e1 details: ");
        e1.getDetails();
        //only e2 details are changed and e1 remains same.

    }
}