import java.util.*;
public class HelloWorld
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int sum=0,count=0,temp=0,act=0;
		
		int id[]={1,2,3,4};
		String director[]={"","","",""};
		int rating[]={1,2,3,4};
		int budget[]={1,2,3,4};
		
		for(int i=0;i<4;i++)
		{
		    id[i]=sc.nextInt();sc.nextLine();
		    director[i]=sc.nextLine();
		    rating[i]=sc.nextInt();sc.nextLine();
		    budget[i]=sc.nextInt();sc.nextLine();
		}
		
		String checkDirector=sc.nextLine();
		int checkRating=sc.nextInt();sc.nextLine();
		int checkBudget=sc.nextInt();sc.nextLine();
		
		for(int j=0;j<4;j++)
		{
		    if(director[j].equals(checkDirector))
		    {
		        sum+=budget[j];
		        count++;
		    }
		}
		
		int avgBudget;
		avgBudget=sum/count;
		
		for(int k=0;k<4;k++)
		{
		    if(rating[k]==checkRating && budget[k]==checkBudget)
		    {
		        for(int x=1;x<=budget[k];x++)
		        {
		            if(budget[k]%x==0)
		            {
		                if(x==rating[k])
		                {
		                    temp=1;
		                    act=id[k];
		                    break;
		                }
		            }
		        }
		    }
		}
		
		if(sum==0)
		{
		    System.out.println("The given director has not yet directed any movie.");
		}
		else
		{
		    System.out.println(avgBudget);
		}
		
		int fun;
		
		if(temp==0)
		{
		    System.out.println("Sorry - No movie in available with the specified rating and budget requirement");
		}
		else
		{
		    System.out.println(act);
		}
		
		
	}
}
