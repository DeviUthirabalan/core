package day1;

public class array {
	public static void main(String args[]) {
	int N=78945;
	int t = N;
	int array[] = new int[10];
	int i=0;
	while(t > 0){
	int remainder=t%10;
	array[i]=remainder;
	i++;
	t=t/10;
	}
	for(i=0;i<10;i++)
	System.out.println(array[i]);
	}
	
}
