package Collectionss;

import java.util.Enumeration;
import java.util.Vector;

public class EnmuerationDemo {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(10);
		v.addElement(25);
		v.addElement(30);
		v.addElement(45);
		
		Enumeration<Integer> e = v.elements();
		
		while(e.hasMoreElements()) {
			int i = e.nextElement();
			
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println(v);
	}

}
