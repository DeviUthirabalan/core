package day1;

public class string {
	public static void main(String args[])
	{
		int sum=0;
		String sum1="sum";
	    for(int i=0;i<args.length;i++)
	    {
	    	sum=sum+Integer.parseInt(args[i]);
	    	sum1=sum1+args[i];
	    }
	    System.out.println(sum);
	    System.out.println(sum1);
	}
}