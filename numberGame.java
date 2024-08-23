import java.util.*;

class numberGame
{
	public static void main(String s[])
	{
		int a,b=101,d=10,e=0;
		char c='Y';
		Scanner obj =new Scanner(System.in);
		Random rand = new Random();
		while(c=='Y')
		{
			a=rand.nextInt(100);
			System.out.println("guess the no.");
			while(b!=a && e<d)
    		{
				b=obj.nextInt();
        	        	++e;
        	if(b>a)
        		System.out.println((d-e)+" attempts left the no. is too high try again: ");
        	else if(b<a)
        		System.out.println((d-e)+" attempts left the no. is too low try again: ");
    		}
    		if(e<d)
    		{
			System.out.println("you have guessed correctly, the no. is "+b+"\nyou scored "+((d-e-1)*10)+"%\nwanna play again? (Y/N) :");
		}
    		else
    		{
			System.out.println("you failed, the no. was "+a+"\nwanna play again? (Y/N) :");
		}
    		c=obj.next().charAt(0);
		e=0;
		}
	}
}

			