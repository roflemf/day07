package array_list;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.transform.Templates;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String > name = new ArrayList<>();
		ArrayList<String> phNum = new ArrayList<>();
		int i = 0, num = 0;
		String n = null , p = null;
		while(true) {
			System.out.println("1.연락처 등록");
			System.out.println("2.연락처 보기");
			System.out.println("3.연락처 삭제");
			System.out.println("4.모든 연락처 보기");
			System.out.println("5.종료");
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("이름 입력: ");
				n = sc.next();
				if(name.indexOf(n) == -1) {
					System.out.print("연락처 입력: ");
					p = sc.next();
					name.add(n); phNum.add(p);
					System.out.println("등록 완료");
					System.out.println("등록하신 이름은: " + n + "\n번호는: " + p + "입니다.");
				}else {
					System.out.println("이름이 존재합니다");
				}break;
			case 2:
				System.out.println("연락처 보기");
				System.out.print("이름 검색: ");
				n = sc.next();
				if(name.indexOf(n) == -1) {
					System.out.println("등록되어 있지 않습니다.");
				}else {
					int temp = name.indexOf(n);
	
					System.out.println("검색하신 이름: " + n + "\n 연락처: " + phNum.get(temp) );
				}break;
			case 3:
				
				if (name.isEmpty() == true) {
					System.out.println("목록에 없습니다.");
				} else {
				
					System.out.println("삭제하실 이름을 입력하세요.");
					n = sc.next();
					if (name.remove(n) == true) {
						System.out.println("삭제되었습니다.");
					}
				}
				break;
			case 4:
				for(int j = 0; j<name.size();j++) {
					System.out.println(name.get(j) + ": ");
					System.out.println(phNum.get(j));
				}break;
			case 5:
				System.out.println("종료");
				return;
				
			}
		}
		
	}
}
