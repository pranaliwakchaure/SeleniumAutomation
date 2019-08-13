package Collections;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterface {

	public static void main(String[] args) 
	{
		/*//ArrayList
		 * List<String> list=new ArrayList<>(); 
		 * list.add("Pranali"); 
		 * list.add("Daya");
		 * list.add("Pooja"); 
		 * list.add("Anand");
		 * 
		 * //Enhance for loop for(String s:list)
		 *  { System.out.println(s); }
		 
		
		//LinkedList
		List<String> list=new LinkedList<>();
		list.add("Pranali");
		list.add("Daya");
		list.add("Pooja");
		list.add("Anand");*/
		
		//Vector
		
		
		List<String> list=new Vector<>();
		list.add("Pranali");
		list.add("Daya");
		list.add("Pooja");
		list.add("Anand");
		list.add("Anand");

		
		
//Enhance for loop
		for(String s:list)
		{
			System.out.println(s);
		}
	
	}

}
