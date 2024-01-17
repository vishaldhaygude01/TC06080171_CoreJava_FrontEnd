package Collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		int no = 10;
		Integer i = new Integer(no);
		
		
		/*
		int a = i.intValue();
		
		int b = 100;
		Integer m = b;
		int c = m;
		
		*/
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(35);
		l.add(30);
		l.add(null);
		
		
		
		System.out.println(l);
		
		l.add(3, 70);
		System.out.println(l);
		
		
		l.remove(1);
		System.out.println(l);
		
		
		System.out.println(l.contains(20));
		
		List l1 = Collections.synchronizedList(l);
	}

}
