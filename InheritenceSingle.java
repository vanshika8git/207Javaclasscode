class Emp{
    int id;
    String name;
    String org;

    void Det(){
        System.out.println("Details: "+id+" "+name+" "+org);
    }
}
class Fac extends Emp{
    String dept;
    String sub;

    void print(){
        System.out.println("Teaching: "+sub+" "+dept);
    }

}

public class InheritenceSingle {
    public static void main(String[] args) { 
        Fac f1=new Fac();
        f1.id=1;
        f1.name="Meenu";
        f1.org="KIET";
        f1.sub="ML";
        f1.dept="AIML";
        f1.Det();
        f1.print();

    }
    
}

