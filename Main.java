
import java.util.Scanner;



class ATM{
    static int pinNumber=1234;
    static  float balance;

    static void menu(){
        System.out.println("1. Enter Pin");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkPin();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                checkBalance();
                break;
            case 5:
                System.exit(1);
        }
    }

    static  void checkPin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Pin :");
        int pin = sc.nextInt();
        if (pin==pinNumber) {
            System.out.println("Login Successful");
        }else {
            System.out.println("Invalid Pin");
        }

        menu();
    }

    static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be deposited");
        float amount= sc.nextFloat();
        balance+=amount;
        System.out.println("Rs. "+ amount + "deposited successfully");

        menu();
    }
    
    static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("The current balance : "+balance);
        System.out.println("Enter amount to be withdrawn :");
        float amount = sc.nextFloat();
        if(amount<=balance){
            balance-=amount;
            System.out.println("Successfully withdrawn");
        }else{
            System.out.println("Insufficent Balance");
        }

        menu();
    }

    static void checkBalance(){
        System.out.println("The current Balance is Rs. "+balance);

        menu();
    }
}







public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.menu();
    }
}