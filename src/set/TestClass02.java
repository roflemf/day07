package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestClass02 {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		
		arr.add("1111");
		arr.add("2222");
		arr.add("3333");
		
		Iterator<String> it = arr.iterator(); //bof = 시작점 , eof = 끝
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.hasNext());

		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
//		System.out.println("hasNext: " + it.hasNext());
		
		HashSet<String> hs = new HashSet<>();
		hs.add("1111");
		hs.add("222");
		hs.add("333");
	
		System.out.println(hs);
	
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
		String n = i.next();
		System.out.println(n);
		}
	}
}

















