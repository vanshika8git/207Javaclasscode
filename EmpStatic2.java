public class EmpStatic2 {
    
    int Emp_ID;
    static String Org; //static-> object independent

    static{
        Org="Kiet";
    }

    void Details(){
        System.out.println("Details: "+Emp_ID+" "+Org);
    }
    public static void main(String[] args) {
        
        EmpStatic2 es=new EmpStatic2();
        es.Emp_ID=101;
        // es.Org="Kiet";
        es.Details();

        EmpStatic2 es2=new EmpStatic2();
        es2.Emp_ID=102;
        // es.Org="Kiet";
        es2.Details();
    }
}