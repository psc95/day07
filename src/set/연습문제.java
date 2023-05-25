package set;

import java.util.ArrayList;
import java.util.Scanner;


public class 연습문제 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String na, nu;
	ArrayList<String> name = new ArrayList<>();
	ArrayList<String> num = new ArrayList<>();
	boolean bool = true;
	int menu =0, result = 0;
	
	while(bool) {
		System.out.println("1.연락처 등록 : ");
		System.out.println("2. 연락처 보기");
		System.out.println("3. 연락처 삭제");
		System.out.println("4.모든 연락처 보기");
		System.out.println("5. 종료");
		System.out.println(">>>");
		menu = input.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("이름 입력 : ");
			na = input.next();
			if(name.indexOf(na) == -1) {
				System.out.println("번호 입력 : ");
				nu = input.next();
				name.add(na); 
				num.add(nu);
			}else {
				System.out.println("이미 존재하는 이름 입니다.");
			}
			break;
			
		case 2:
			System.out.println("찾을 이름 입력 : ");
			na = input.next();
			result = name.indexOf(na);
			if(result == -1) {
				System.out.println("없는 이름입니다.");
			}else {
				System.out.println("이름 : "+name.get(result));
				System.out.println("전화번호 : "+num.get(result));
			}break;
		case 3:
			System.out.println("삭제할 이름을 입력하세요 : ");
			na = input.next();
			result = name.indexOf(na);
			if (result == -1) {
				System.out.println("없는 이름입니다.");
			}else {
				name.remove(result);
				num.remove(result);
				System.out.println(na+"님의 이름과 번호가 삭제되었습니다.");
			}
			
		case 4:
			System.out.println("모든 연락처를 보여드리겠습니다.");
			for(int i = 0; i < name.size(); i++) {
				System.out.println("이름 : "+name.get(i)+ " | 전화번호 : "+num.get(i));
			}break;
		case 5:
			System.out.println("종료합니다!!!");
			bool =false;
			
		default:
			System.out.println("올바른 번호를 입력하세요!!!");
			
		
		
		
		
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
