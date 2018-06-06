import java.util.Scanner;

public class BasicIO {
	@SuppressWarnings("resource")
	public static void main(String arg[]){
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Element Array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)	{
			System.out.println("Array Element"+a[i]);
			
		}
	
	}

}
