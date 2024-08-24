import java.util.*;
public class std_grade_cal
{
	public static void main(String s[])
	{
		int n,total=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Student Grade Calculator");
		System.out.println("Enter total number of subjects");
		n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter number of marks scored in "+(i+1)+" subject: ");
			int marks=obj.nextInt();
			total=total+marks;
		}
		double  avg_per=(double)total/n;
	char Grade;
	if(avg_per>90){
		Grade='O';
	}
	else if(avg_per>80){
		Grade='E';
	}
	else if(avg_per>70){
		Grade='A';
	}
	else if(avg_per>60){
		Grade='B';
	}
	else if(avg_per>50){
		Grade='C';
	}
	else if(avg_per>40){
		Grade='D';
	}
	else{
		Grade='F';
	}
	System.out.println("Total marks scored is "+total);
	System.out.println("Average percentage gained is: "+avg_per+"%");
	System.out.println("Grade:"+Grade);
	}
}