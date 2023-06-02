package set;

import java.util.HashSet;
import java.util.Iterator;

public class TestClass02_01 {
	
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();

		
		hs.add("123");
		hs.add("456");
		hs.add("45");
		
		
		Iterator<String> it = hs.iterator();
		
		// 시작 | hs 값들 | 끝

//		if(it.hasNext()) System.out.println(it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println(hs);
	
	
	}
}
