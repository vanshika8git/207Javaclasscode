public class methodCode{
    int id;
    String name;
    public methodCode(int id,String name){
        this.id=id;
        this.name=name;
    }
    
    public void displayMethod(){//user defined method
        System.out.println("Details are: "+name+" "+id);
    }
    public static void main(String[] args) {
        methodCode m1=new methodCode(101,"Vanshika");
        
        m1.displayMethod(); 
        methodCode m2=new methodCode(102,"Ak");
        m2.displayMethod();

    }    
}
