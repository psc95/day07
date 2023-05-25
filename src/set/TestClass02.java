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
	
	Iterator<String> it = arr.iterator();
	while( it.hasNext() ) {
		String s = it.next();
		System.out.println( s );
	}
	System.out.println("=================================s");
//	System.out.println("it.hasNext() : " + it.hasNext() );
//	System.out.println( it.next() );
	
//	System.out.println( it.hasNext() ); // 다음 위치에 값이 있습니까? 라고 물어보는 것 있으면 true
//	System.out.println( it.next() );    // 다음위치에있는 값을 꺼내옴
//	System.out.println( it.next() );
//	System.out.println( it.next() );
//	System.out.println( it.hasNext() ); // 더이상 값이 없기때문에 false 라고 나옴
//	
	
	HashSet<String> hs = new HashSet<>();
	hs.add("1111");
	hs.add("2222");
	hs.add("3333");
	System.out.println( hs );
	
	Iterator<String> i = hs.iterator();
	while( i.hasNext() ) {
		String n = i.next();
		System.out.println( n );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
