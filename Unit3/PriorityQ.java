package Unit3;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PQ : "+pq); 

        System.out.println(pq.offer(25)); //bool
        

        System.out.println("New pq : "+pq); //printing happens level wise from left to right

        System.out.println("Deleted: "+pq.poll());
        System.out.println("Deleted: "+pq.poll());


        System.out.println("Element on the root/top/front : "+pq.peek());

        System.out.println("Removed: "+pq.remove());
        //remove from empty priority queue -> error and program terminate (no exception handling)

        pq.clear();
        
        System.out.println(pq.isEmpty());
        
    }
}
