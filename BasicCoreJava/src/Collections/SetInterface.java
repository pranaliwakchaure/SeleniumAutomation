package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetInterface {

	public static void main(String[] args)
	{
		/*//Random values print in Hashset
		//Hashset - does not sort randomly
		Set<String> set =new HashSet<>();
		set.add("Pranali");
		set.add("Daya");
		set.add("Pooja");
		set.add("Anand");
		set.add("Anand");*/
		
		//Linked Haset - preservese insertion order
		Set<String> set1 =new LinkedHashSet<>();
		set1.add("Pranali");
		set1.add("Daya");
		set1.add("Pooja");
		set1.add("Anand");
		set1.add("Anand");
		
		//Treeset-Sort alphabetically
		
		/*Set<String> set2 =new TreeSet<>();
		set2.add("Pranali");
		set2.add("Daya");
		set2.add("Pooja");
		set2.add("Anand");
		set2.add("Anand");*/
		
		for(String s:set1)
		{
			System.out.println(s);
		}
	

	}

}
