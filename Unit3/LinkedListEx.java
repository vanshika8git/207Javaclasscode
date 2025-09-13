package Unit3;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args){
        LinkedList<String> employee=new LinkedList<>();

        employee.add("John");
        employee.add("Jeremiah"); 
        employee.add(2,"Raj");
        employee.add("Conrad");
        employee.addFirst("Arjun"); 
        employee.addLast("Sophia"); 

        System.out.println(employee);

        System.out.println("-----------access/getting--------------");
        System.out.println("Get First: "+employee.getFirst());
        System.out.println("Get Last: "+employee.getLast());
        System.out.println("Get index 2: "+employee.get(2)); //same as arraylist


        System.out.println("-----------traversal through for-each --------------");
        for(String s:employee){
            System.out.println(s);
        }


        System.out.println("-----------traversal through iterators--------------");
        Iterator itr=employee.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        
        System.out.println("-----------set--------------");
        employee.set(1,"Belly");
        System.out.println(employee);


        System.out.println("-----------remove--------------");
        employee.remove(); //removes first
        System.out.println(employee);
        employee.remove("Raj"); //remove by object
        employee.remove(1); //remove by index
        employee.removeFirst();
        employee.removeLast();
        System.out.println("LL after removing : "+employee);



        System.out.println("-----------search methods--------------");
        employee.add("John");
        employee.add("Meena");
        employee.add("John");
        System.out.println(employee);
        System.out.println("Contains 'John'? "+employee.contains("John")); //boolean value
        System.out.println("Index of John : "+employee.indexOf("John")); //first occurence
        System.out.println("Last index of John : "+employee.lastIndexOf("John"));
        
    }
}
