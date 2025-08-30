public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        try{
        System.out.println(100/0); //risk code
        }
        catch(Exception e){
            System.out.println("Dividing by zero.");
            System.out.println(e);
        }
        finally{
            System.out.println(7); //this will run fs
        }
        System.out.println(5);
        System.out.println(6);
    }
}
