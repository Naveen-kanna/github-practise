public class Main
{
	public static void main(String[] args) {
	    int count1=0;
	    int count2=0;
	    boolean b=false;
		for(int i=5;i<=35;i++)
		{
		    if(i%5==0)
		    {
		        System.out.print(i+" ");
		        count1++;
		        count2=0;
		        b=true;
		    }
		    else if(i%2==0 && b==true)
		    {
		        count2++;
		        if(count1==count2)
		        {
		            System.out.print(i+" ");
		             b=false;
		        }
		    }
		    
		}
	}
}