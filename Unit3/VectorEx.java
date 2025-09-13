package Unit3;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        System.out.println("---------------Type 1 constructor-------------");
        Vector<String> vc= new Vector<>();
        System.out.println("Default Capacity (empty vector): "+vc.capacity()); //by default - 10 (total available size)
        System.out.println();

        vc.add("1");
        vc.add("2");
        vc.add("3");
        vc.add("4");
        vc.add("5");



        System.out.println("---------------Type 2 constructor-------------");
        Vector<String> vc1 = new Vector<>(4); 
        vc1.add("V");
        vc1.add("A");
        vc1.add("A");
        vc1.add("K");
        //now the capacity is 4 -> sout(vc1.capacity()) ->4
        vc1.add("U");
        System.out.println(vc1.capacity());
        // now capacity becomes 8 -> doubles the size for new elements


        
        System.out.println("---------------Type 3 constructor-------------");
        Vector<Integer> vc2=new Vector<>(4,1);
        vc2.add(1);
        vc2.add(2);
        vc2.add(3);
        vc2.add(4);
        vc2.add(5);
        vc2.add(6);
        System.out.println(vc2.capacity()); //this gives 6



        System.out.println("---------------size-------------");
        System.out.println("vc vector: "+vc.size()); //.size() for current vector size
        System.out.println("vc1 vector: "+vc1.size());
        System.out.println("vc2 vector: "+vc2.size());



        System.out.println("---------------Vector printing-------------");
        System.out.println("Vector is : "+vc2); //printing vector



        System.out.println("---------------add all-------------");
        vc.addAll(vc1); //addAll must be used with same dtype vectors (add all the elements of one vector to another)
        System.out.println(vc);



        System.out.println("---------------add element (legacy method)-------------");
        vc.addElement("8"); //appends at end
        System.out.println(vc);



        System.out.println("---------------accessing/getting-------------");
        System.out.println("1st ele: "+vc1.firstElement());
        System.out.println("Last ele: "+vc1.lastElement());
        System.out.println("Get at index 3: "+vc1.get(3));
        System.out.println("Index of U: "+vc1.indexOf("U"));


        System.out.println("---------------clear-------------");
        vc.clear();
        System.out.println(vc);



    }
}
