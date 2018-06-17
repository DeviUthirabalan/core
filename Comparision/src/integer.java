import java.util.*;
public class integer {
	@SuppressWarnings("rawtypes")
	public static void main(String s[]) {
	@SuppressWarnings("unchecked")
	List<Integer> l=new LinkedList();
	
	l.add(1);
	l.add(2);
	l.add(3);


	List<Integer> S=new LinkedList<Integer>();
	 S.add(4);
	 S.add(7);
	 S.add(8);
	 S.add(1);
	
	 List<List> r=new LinkedList<List>();
	 r.add(l);
	 r.add(S);
	
	for(Integer a:l)
	{
		for(Integer b:S)
		{
			if(a<b)
			{
				System.out.println(""+a);
			}
}}
}}