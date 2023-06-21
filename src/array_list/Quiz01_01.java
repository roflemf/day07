package array_list;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 연락처 등록 프로그램
 * 
 * System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			System.out.print(">>> ");

			등록
			삭제
 */
public class Quiz01_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		int choice1;
		String name="";
		String phone="";



		boolean bool = true;

		while(bool) {

			System.out.println("1. 연락처 등록");
			System.out.println("2. 연락처 보기");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			choice1 = sc.nextInt();

			switch (choice1) {
			case 1: {
				System.out.println("이름을 입력하세요 : ");
				name = sc.next();
				arr.add(name);
				//arr.add(sc.next());
				System.out.println("연락처를 등록하세요 : ");
				phone = sc.next();
				arr2.add(phone);
				break;
			}
			case 2: {
				System.out.println("찾을 이름 : ");
				String searchName  = sc.next();

				if(arr.contains(searchName)) {
					//찾을이름이 연락처에 존재하면 이부분 실행됨
					int tempNum = arr.indexOf(searchName); //변수에 찾을이름의 인덱스번호를 담음.

					System.out.println(arr2.get(tempNum)); // arr2의 tempNum번째 인덱스에있는값을 출력.

				}else {
					//없으면 이부분 실행됨
					System.out.println("찾는 연락처 없음");
				}
				System.out.println();
				break;
			}
			case 3: {
				System.out.println("삭제할 이름 : ");
				String deleteName = sc.next();

				//arr.remove(인덱스번호);
				if(arr.contains(deleteName)) {
					int tempNum2 = arr.indexOf(deleteName);
					arr.remove(tempNum2);
					arr2.remove(tempNum2);
					System.out.println("삭제 완료");
				}else {
					System.out.println("삭제할 이름 없음");
				}

				break;
			}
			case 4: {
				System.out.println("모든 연락처");

				//			System.out.println(arr.get(0) + " : " + arr2.get(0));
				//			System.out.println(arr.get(1) + " : " + arr2.get(1));
				//			System.out.println(arr.get(2) + " : " + arr2.get(2));
				//			System.out.println(arr.get(3) + " : " + arr2.get(3));
				//			System.out.println(arr.get(4) + " : " + arr2.get(4));
				//			System.out.println(arr.get(5) + " : " + arr2.get(5));

				for(int i=0; i<arr.size();i++) {
					System.out.print(arr.get(i));	
					System.out.println(":" + arr2.get(i));	
				}
				break;
			}
			case 5: {
				bool=false;
				// return; <- 리턴형이 없는(void)의 메소드에서 return;은 메소드 종료를 의미
			}

			}
			System.out.println("종료됐습니다.");
		}
	}
}