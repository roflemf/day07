package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass02_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("입력할 값: ");
			String a = input.next();
			arr.add(a);
//			arr.add(input.next());
			
		}
		System.out.println(arr);
		
		
		System.out.println("수정할 값 입력 : ");
		String str = input.next();	
			if(str.contains(str)) {System.out.println("있는 값");}
			else {System.out.println("없는 값");}
		System.out.println("바꿀 값 : ");
		String str2 = input.next();
		
		int a = arr.indexOf(str);
			
		
		arr.set(a, str2);
		System.out.println(arr);
	}

}
