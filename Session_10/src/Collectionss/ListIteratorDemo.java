package Collectionss;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		
		ListIterator<String> itr = l.listIterator();
		
		while(itr.hasNext()) {
			String i = itr.next();
			if(i.equals("A")) itr.set("P");
			if(i.equals("B")) itr.add("Q");
			if(i.equals("D")) itr.remove();
		}
		
		System.out.println(itr);
	}
}
