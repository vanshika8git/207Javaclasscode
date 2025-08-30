interface Institute{
    void Register();  
    void Infrastructure(); 
    void Staff(); 
    abstract void Students();
    void medFacility();

    static void staticConcrete(){ 
        System.out.println("Static concrete allowed in interface");
    }
    default void defConcrete(){ 
        System.out.println("Default concrete allowed in interface");
        privConcrete(); 
    }
    private void privConcrete(){ 
        System.out.println("Private concrete allowed in interface");

    }
}
class ABES implements Institute{ 
    public void Register(){ 
        System.out.println("Registered with AKTU.");
    }
    public void Infrastructure(){
        System.out.println("Modern infra.");
    }
    public void Staff(){
        System.out.println("Well trained.");
    }
    
    public void Students(){
        System.out.println("Cool kids.");
    }
    public void medFacility(){
        System.out.println("Own Hospital.");
        
    }
}


public class AbstractInterface{
    public static void main(String[] args) {
        Institute i;
        i=new ABES(); 
        i.Register();
        i.Infrastructure();
        i.Students();
        i.Staff();
        i.medFacility();


        Institute.staticConcrete(); 
        i.defConcrete();
        
        
    }
}