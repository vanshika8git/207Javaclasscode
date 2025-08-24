public class EmpStatic3 {
    
    int Emp_ID;
    static String Org; //static-> object independent
    static{
        Org="Kiet";
    }

    static void staticMethod(){
        System.out.println("This is a static method.");
    }

    void Details(){
        System.out.println("Details: "+Emp_ID+" "+Org);
    }
    public static void main(String[] args) {
        
        EmpStatic3 es=new EmpStatic3();
        es.Emp_ID=101;
        // es.Org="Kiet";
        es.Details();

        EmpStatic3 es2=new EmpStatic3();
        es2.Emp_ID=102;
        // es.Org="Kiet";
        es2.Details();
        staticMethod(); 
    }
}