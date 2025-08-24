public class EmpStatic {
    
    int Emp_ID;
    static String Org; //static-> object independent

    void Details(){
        System.out.println("Details: "+Emp_ID+" "+Org);
    }
    public static void main(String[] args) {
        EmpStatic.Org="Kiet"; 
        EmpStatic es=new EmpStatic();
        es.Emp_ID=101;
        // es.Org="Kiet";
        es.Details();

        EmpStatic es2=new EmpStatic();
        es2.Emp_ID=102;
        // es.Org="Kiet";
        es2.Details();
    }
}