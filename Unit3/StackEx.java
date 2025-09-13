package Unit3;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        //push,pop,peek,search,empty

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        st.pop(); //pops the top ele
        System.out.println("Element popped: "+st.pop());
        int x= st.peek(); //returns the top ele 
        System.out.println("Top element : "+x); //4 at top

        System.out.println("Index is: "+st.search(2)); //gives 3 (1 - based indexing)
        
        System.out.println("Is Stack empty?: "+st.empty());//is empty -> true false



    }
}
