import java.util.*;
class EmployeeEncap{
    Scanner sc=new Scanner(System.in);
    private int Acc_balance; //pvt for data hiding
    private int upi_pin=998899;

    public void setBalance(int balance){
        
        System.out.print("Please enter UPI PIN: ");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            Acc_balance=balance;
            System.out.println("Congratulations! Salary is credited.");
        }else{
            System.out.println("Salary not credited.");
        }
    }
    public void getBalance(){
        
        System.out.print("Check Balance? Enter (Y/N): ");
        String choice=sc.next();
        if(choice.toUpperCase().equals("Y")){
            System.out.println("Please enter the UPI PIN: ");
            int pin=sc.nextInt();
            if(pin==upi_pin){
                System.out.println("Your Balance: "+Acc_balance);
            }else{
                System.out.println("!!WRONG PIN!! Unable to fetch balance.");
            }
        }
        
    }
}


public class Encapsulation {
    public static void main(String[] args) {
        EmployeeEncap e=new EmployeeEncap();
        e.setBalance(10000000);
        e.getBalance();
    }
}
