package Collectionss;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("c://TT/abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		SerialiazationDemo s = new SerialiazationDemo(1, "Vishal", 1000.67f);
		
		oos.writeObject(s);
		System.out.println("Success");
		
		oos.close();
		fos.close();
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://abc.txt"));
		SerialiazationDemo s1 =(SerialiazationDemo)ois.readObject();
		System.out.println(s1);
	}
}
