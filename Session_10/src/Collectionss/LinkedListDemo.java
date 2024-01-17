package Collectionss;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;



public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList  l = new LinkedList();
		l.add("Vishal");
		l.add(40);
		l.add(null);
		l.add(40);
		
		System.out.println(l);
		
		l.set(0, "XYZ");
		System.out.println(l);
		
		l.removeLast();
		l.addFirst("PQR");
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
	}
}
