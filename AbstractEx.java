abstract class College{
    abstract void Register();   
    abstract void Infrastructure(); 
    abstract void Staff();
    abstract void Students();
    void medFacility(){
        System.out.println("Medical facilities are optional.");
    }
}
class KITE extends College{ 
    void Register(){
        System.out.println("Registered with AKTU.");
    }
    void Infrastructure(){
        System.out.println("Modern infra.");
    }
    void Staff(){
        System.out.println("Well trained.");
    }
    
    void Students(){
        System.out.println("Cool kids.");
    }
    void medFacility(){
        System.out.println("Own Hospital.");
        
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        College c;
        c=new KITE(); 
        c.Register();
        c.Infrastructure();
        c.Students();
        c.Staff();
        c.medFacility();

    }
}
