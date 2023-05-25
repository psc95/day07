package set;

import java.util.ArrayList;
import java.util.HashSet;

import javax.print.attribute.HashAttributeSet;

public class TestClass01 {
public static void main(String[] args) {
	/*
	 	set -> HashSet
		- 순서를 유지하지 않는다.
		- 순서가 없기 때문에 index를 사용할 수 없다
		- index대신에 iterator를 사용한다
		- 기본 배열(저장소)의 크기를 16개 만들어 놓고 시작한다.
		  데이터를 저장하다 75%가 채워지면 이어서 16개의 공간을 늘린다.
		- 데이터의 중복을 허용하지 않는다. 유일한 데이터라는 것을 보장받는다
		- list보다 처리속도가 빠르다
	 */
	
	HashSet<String> hs = new HashSet<>();
	ArrayList<String> arr = new ArrayList<>();
	
	hs.add("라면"); hs.add("김밥");		// set 은 중복된 데이터는 나오지않고 순서도 랜덤으로 나옴 그래서 index사용가능 x
	hs.add("순대"); hs.add("김밥");
	
	arr.add("라면"); arr.add("김밥");
	arr.add("순대"); arr.add("김밥");
	
	System.out.println( hs );
	System.out.println( arr );
	
	hs.remove("순대");		//삭제하는거는 ArrayList랑 똑같음
	System.out.println( hs ); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
