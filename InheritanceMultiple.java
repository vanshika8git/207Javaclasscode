//no confusion in compiler using interface
interface Teaching {
    void work();
}

interface Research {
    void work();
}
class Professor implements Teaching, Research{
    public void work(){
        System.out.println("Professor performs Teaching and Research work both.");
    }
}

public class InheritanceMultiple {
    public static void main(String[] args) {
    
    Professor p=new Professor();
    p.work();    
 }
}




// class Teaching {
//     void work() {
//         System.out.println("Teaching work");
//     }
// }

// class Research {
//     void work() {
//         System.out.println("Research work");
//     }
// }

// class Professor extends Teaching, Research {
//     // Error
// }

// public class InheritanceMultiple {
//     Professor p=new Professor();

// }