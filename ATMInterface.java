import java.util.Scanner;  
public class ATMInterface
{  
    public static void main(String args[])  
    {  
        int balance = 0, withdrawal, deposit;  
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("ATM Interface- Enter your choice!");  
            System.out.println("1. Deposit");  
            System.out.println("2. Withdraw");  
            System.out.println("3. Check your Account Balance");  
            System.out.println("4. Exit");  
            System.out.print("Which operation do you want to perform?");  
            int option = sc.nextInt();  
            switch(option)  
        {  
        case 1:  
        System.out.print("Enter the amount to be deposit:");  
        deposit = sc.nextInt();  
        balance = balance + deposit;  
        System.out.println("The amount has been successfully deposited");  
        System.out.println("");  
        break;  
        case 2:  
        System.out.print("Enter the amount to withdraw:");  
        withdrawal = sc.nextInt();  
        if(balance >= withdrawal)  
        {  
        balance = balance - withdrawal;  
        System.out.println("The withdraw is successful");  
        }  
        else  
        {  
        System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
        case 3:  
        System.out.println("Your Account Balance is: "+balance);  
        System.out.println("");  
        break;  
        case 4:  
        System.exit(0);  
        sc.close();
            }  
        }  
    }  
}  