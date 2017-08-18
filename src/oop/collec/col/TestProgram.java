package oop.collec.col;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestProgram {

	public static void main(String[] args) {
//		ObjectList list = new ObjectList();
//		ArrayList list = new ArrayList();
//		GenericList<Integer> list = new GenericList<>();
/*		GenericList list = new GenericList();
		
		list.add(3);
		list.add("hello");
		list.add(4.5f);
		list.add(new Exam());*/
		
/*		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
/*		GIterator iter = list.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());*/
		
/*		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());*/
		
/*		list list = new LinkedHashlist();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(22);
		list.add(7);
		list.add(9);
		list.add(13);
		
		for(Object o: list)
			System.out.println(o);*/
		
		List list = new ArrayList();
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(22);
		list.add(7);
		list.add(9);
		list.add(13);
		
/*		for(Object o: list)
			System.out.println(o);*/
		
		System.out.println(list.get(3));
		
		
/*		Map<String, String> student = new HashMap<>();
		student.put("이름", "홍길동");
		student.put("나이", "20");
		student.put("전화번호", "010-1234-1234");
		
		for(String key : student.keySet())
			System.out.printf("key: %s  value: %s\n", key, student.get(key));*/
		
		
		
		
	}

}
