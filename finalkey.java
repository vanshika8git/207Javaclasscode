class finalkey { 
    final String Org="Kiet";
    void Det(){
        System.out.println(Org);
    }
    
}
class Faculty extends finalkey{
    
    void Det(){
        System.out.println("Welcome to method overriding"); 
        
    }
    public static void main(String[] args) {
        Faculty e=new Faculty();
        e.Det();

    }
    
}
