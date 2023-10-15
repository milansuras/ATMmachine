import java.util.Scanner;

public class ATM {
    float Balance;
    int PIN=5714;  // just assuming

    public void checkpin() {
        System.out.println("Enter your pin :-");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter valin pin:-");
        }
    }

        public void menu(){
            System.out.println("Enter your choice:-");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4.  Exit");

            Scanner sc=new Scanner(System.in);
            int opt=sc.nextInt();

            if(opt==1){
                checkBalance();
            }
            else if(opt==2){
                WithdrawMoney();
            }

            else if(opt==3){
                depositMoney();
            }

            else if(opt==4){
                return;
            }

            else{
                System.out.println("Enter valid option");
            }

        }
    public void checkBalance(){
        System.out.println("Balance : " + Balance);
        menu();
    }

    public void WithdrawMoney(){
        System.out.println("Enter amount to withdraw:-");
        Scanner sc=new Scanner(System.in);
        float amount =sc.nextFloat();

        if(amount>Balance){
            System.out.println("Insufficent amount:-");
        }
        else{
            Balance=Balance-amount;
            System.out.println("Money Withdrawn Successfully:-");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount to deposit:-");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposited Successfully");
        menu();
    }


}
