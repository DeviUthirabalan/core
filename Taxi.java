package day1;

public class Taxi extends car{
	public Taxi(){
		System.out.println("Taxi cons empty");	
	}
	public Taxi(int i){
		
		//super(i);
		//this();
		System.out.println("Taxi cons one arg");
	}
public static void main(String s[]){
	Taxi Taxi=new Taxi();
	
}
}
