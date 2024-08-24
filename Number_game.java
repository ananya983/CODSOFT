import java.util.*;
class number
{
    int no, r=101,total=10,start=0;
    char c='Y';
    Scanner obj=new Scanner(System.in);
    Random rand=new Random();
    void check()
    {
        while(c=='Y')
        {
            no=rand.nextInt(100);
            System.out.println("Welcome to Number Game");
            System.out.println("***********");
            while(r!=no && start<total)
            {
                System.out.println("Enter a number");

                r=obj.nextInt();
                        ++start;
                if(r>no)
                {
                         System.out.println((total-start)+"attempts left the no. is too high try again: ");
                }
                 else
                {
                        System.out.println((total-start)+"attempts left the no. is too low try again: ");
                }
            }
            if(start<total)
            {
                System.out.println("you have scored correctly , the number is :"+r+"\n You scored "+((total-start-1)*10)+"%\nwanna play again? (Y/N) :");
             }
            else
            {
                System.out.println("you failed, the no. was "+no+"\nwanna play again? (Y/N) :");
             }
            c=obj.next().charAt(0);
            start=0;
        }
    }
}
class Number_game
{
    public static void main(String s[])
    {
        number obj=new number();
        obj.check();
        
    }
}
