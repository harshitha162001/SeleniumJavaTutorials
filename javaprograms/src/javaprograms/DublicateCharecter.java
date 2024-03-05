package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DublicateCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDublicate("rtws");
		

	}
	public static void printDublicate(String str) {
		if(str.isEmpty())
		{
			System.out.println("empty string");
		}
		if(str.length()==1) {
			System.out.println("single charecter string");
			
		}
	char words[] =	str.toCharArray();//java
	Map<Character,Integer> CharMap=new HashMap<Character,Integer>();
	
	for(Character ch :words) {
		if(CharMap.containsKey(ch)){
			CharMap.put(ch,CharMap.get(ch)+1);
		}
		else {
			CharMap.put(ch, 1);//jav
		}
	}
	
	//printin
	Set<Map.Entry<Character, Integer>> entryset= CharMap.entrySet();
	
	for(Map.Entry<Character,Integer> entry :entryset)	{
		if(entry.getValue()>1) {
			System.out.println("Duplicate element is");
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		else {
			System.out.println("not repeating  element is");
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		
	}
		
	}

}
