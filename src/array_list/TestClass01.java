package array_list;

import java.util.*;

public class TestClass01 {

	public static void main(String[] args) {
	/*
	 컬렉션 프레임워크(collection framework)
	 - 데이터들을 편리하게 사용할 수 있게 만든 기능
	 - 표준화된 클래스를 이용한다
	 Collection
	 - 다수의 데이터들을 의미한다
	 - 무수한 데이터의 집합
	 Framework
	 - 디자인 패턴
	 - 표준화된 프로그래밍 방식
	 커렉션 프레임웍의 핵심 인터페이스
	 - List, Set, Map
	 
	 List -> ArrayList
	 - 순서가 있는 데이터의 집합.
	 - 순서가 존재해서 index를 사용할 수 있다.
	 - 데이터의 중복이 가능하다
	 */
	
	//꺽세 안에는 자료형이들어감 			size or length 크기를 비교하는거 기억해두기
	ArrayList<String> arr = new ArrayList<>();
	System.out.println( arr.size( ));
	int[] a = new int[3];
	System.out.println( a.length );
	arr.add("1111");
	arr.add("2222");
	
	System.out.println( arr.size() );
	System.out.println( arr.get(0));
	System.out.println( arr.get(1));
	
	System.out.println( arr.contains("2222"));   //arr에 2222라는 데이터가 있는지 확인하는 명령어 있으면 true 없으면 false
	System.out.println( arr.contains("1212"));
	boolean bool = arr.contains("1111");
	System.out.println("arr에 1111 : "+bool);
		
	System.out.println("===== arr =========");
	System.out.println( arr );
	//arr.remove("1111"); 	// 데이터 삭제 명령문
	arr.remove(0);			//삭제할때 데이터를 적어도 되고 인데스 번호로 지워도 됨s
	System.out.println("111삭제 후 arr : "+arr);
	System.out.println("222 확인 : "+arr.get(0) ); //0번째 데이터를 삭제하면 1번데이터가 0번으로 땡겨짐
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
