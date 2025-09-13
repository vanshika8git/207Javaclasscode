package Unit3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<String>(); 
        fruits.add("Apple");
        fruits.add("Guava");
        fruits.add("Strawberry");
        fruits.add(1,"Banana");//insert at particular index
        

        System.out.println("ArrayList: "+fruits);
        System.out.println("------------Traversal through for-each------------");
        for(String f:fruits){ 
            System.out.println(f);
        }


        System.out.println("-----------Traversal through Iterators------------");
        Iterator itr= fruits.iterator(); while(itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("-------------get--------------");
        System.out.println(fruits.get(3));


        System.out.println("------------------index of---------------");
        System.out.println(fruits.indexOf("Strawberry"));
        System.out.println(fruits.indexOf("Mango")); //-1 (not found)

        System.out.println("------------------set---------------");
        System.out.println(fruits.set(2,"Kiwi")); //returns the element just updated (old value)
        System.out.println("New ArrayList: "+fruits);


        System.out.println("------------------remove---------------");
        fruits.remove(2); 
        System.out.println("Array List after removing : "+fruits);

        int s = fruits.size();
        System.out.println("------------------size---------------");
        System.out.println(s);

        System.out.println("------------------contains---------------");
        System.out.println(fruits.contains("Apple")); //contains returns boolean value
        System.out.println(fruits.contains("Mango"));


        System.out.println("------------------sort---------------");
        Collections.sort(fruits);
        System.out.println(fruits);


        System.out.println("------------------search---------------");
        System.out.println(Collections.binarySearch(fruits,"Apple")); //returns index


        System.out.println("------------------clear---------------");
        fruits.clear();
        System.out.println(fruits);
    }
}
