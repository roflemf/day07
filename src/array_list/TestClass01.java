package array_list;

import java.util.ArrayList;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 컬렉션 프레임워크(collection framework)
		 - 데이터 들을 편리하게 사용할 수 있게 만드는 기능
		 - 표준화된 클래스를 이용한다
		 
		 Collection
		 - 다수의 데이터들을 의미한다
		 - 무한한 데이터의 집합
		 
		  Framework
		  - 디자인 패턴
		  - 표준화된 프로그래밍 방식
		  
		  컬렉션 프레임웍의 핵심 인터페이스
		  - List, Set, Map
		
		  List - ArrayList
		  - 순서가 있는 데이터의 집합
		  - 순서가 존재해서 index를 사용할 수 있다.
		  - 데이터의 중복이 가능하다.
		 */
		
		ArrayList<String> arr = new ArrayList<>(); 
		System.out.println(arr.size());
		arr.add("1111");
		arr.add("2222");
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		System.out.println(arr.get(1)); // 값을 가져ㅕ옴
		
		System.out.println(arr.contains("2222"));
		System.out.println(arr.contains("1212"));
		
		boolean bool = arr.contains("22323");
		System.out.println("arr에 22323: " + bool);
		System.out.println();
		
		System.out.println("==== arr ====");
		System.out.println(arr);
		//arr.remove("1111");
		arr.remove(0);
		
		System.out.println("1111삭제 후 arr:" + arr);
		System.out.println("222 확인: " + arr.get(0));
	}
}
















