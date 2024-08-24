import java.util.*;
class amt
{
    int amount=0;
    void withdraw(int amnt, int amt)
    {
    amount=amnt-amt;
    System.out.println("Withdrawl successfull.New Balance :" +amt+"Rs.");
    }
    void deposit(int amnt,int amt)
    {
    amount=amnt+amt;
    System.out.println("Deposit successfull. New Balance:" +amt+"Rs. ");
    }
}
class bank_balance extends amt
{
    void check()
    {
    char a;
    Scanner sc =new Scanner (System.in);
    System.out.println("Want to check bank balance ?");
    a=sc.next().charAt(0);
    if(a=='y')
    {
        System.out.println("Your current balance is "+amount);
    }
    else
    {
        System.out.println("Thankyou !!");
        System.exit(0);
    }
}
    int retrn()
    {
    return amount;
    }
}
public class Atm
{
    public static void main(String s[])
    {
    int a,amnt,orgamt=0,p,pin;
    Scanner sc=new Scanner(System.in);
    bank_balance obj=new bank_balance(); 
    System.out.println("Welcome to the ATM");
    System.out.println("*********************");
    System.out.println("Enter your 4 digit pin");
    p=sc.nextInt();
    while(true)
    {
        System.out.println("Enter\n1. CheckBalance \n2. Deposit\n3. Withdraw1 \n4. Exit");
        System.out.println("*********************");
        System.out.println("Enter your choice");
        a=sc.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("Checking the balance....");
            System.out.println("Your current balance is : "+orgamt);
            break;
            case 2:
            System.out.println("Enter the amount");
            amnt=sc.nextInt();
            if(amnt>5000)
            {
                System.out.println("Amount is too high to deposit");
            }
            else
            {
                System.out.println("Enter pin");
                pin=sc.nextInt();
                if(pin!=p)
                {
                     System.out.println("Wrong pin");
                }
                else
                {
                    obj.deposit(orgamt,amnt);
                    obj.check();
                    orgamt=obj.retrn();
                }
            }
            break;
            case 3:
            System.out.println("Enter the amount");
            amnt=sc.nextInt();
            if(orgamt<amnt)
            {
                    System.out.println("Sorry ,transaction is not possible due to unsuffecient amount");
            }
            if(amnt>5000)
            { 
                    System.out.println("Amount is too high to withdraw");
            }
            else
            {
                    System.out.println("Enter a pin");
                    pin=sc.nextInt();
                    if(pin!=p)
                    {
                            System.out.println("Wrong pin");
                    }
                    else
                    {
                            obj.withdraw(orgamt,amnt);
                            obj.check();
                            orgamt=obj.retrn();
                    }
            }
            break;

            case 4:
            System.out.println("Thankyou for using the ATM!!");
            System.exit(0);
            default:
            System.out.println("Wrong input");
        }
    }
}
}


