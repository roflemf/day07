package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass01_01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> arr = new ArrayList<>();
	arr.add("11");
	arr.add("22");
	
	System.out.println(arr);
	System.out.println(arr.indexOf("11"));
	System.out.println(arr.indexOf("22"));
	
	System.out.print("찾을 값 입력 : ");
	String str = sc.next();
	
	System.out.println("인덱스 위치 : " + arr.indexOf(str));
	
	
	System.out.println(arr.get(0));
	// add, indexof(String), get(index)
	// 추가, 문자열이있는 인덱스위치, 해당 인덱스에 있는 값
	
//	String[] str = {"11", "22"};
//	System.out.println(str);
}
}
