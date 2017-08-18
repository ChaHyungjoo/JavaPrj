package oop.collec.col;

import java.util.Iterator;

public class GenericList<용주> implements Iterable<용주>{
	//generic 무엇이든 될 수 있는
	private int index;
	private int capacity;
	private 용주[] list;
//	private int current;
	
	public GenericList() {
		list = (용주[])new Object[3];
		index = 0;
		capacity = 3;
		//current = -1;
	}

	public void add(용주 object) {
		if(index>=capacity) {
			용주[] temp = (용주[])new Object[capacity+2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			list = temp;
			
			capacity+=2;
		}
		list[index++] = object;
	}

	public 용주 get(int i) {
		return list[i];
	}

	public int size() {
		return index;
	}
	
	//------------데이터를 조회하는 서비스------------
	class GIterator implements Iterator<용주>{
		private int current;

		public GIterator() {
			current = -1;
		}
		
		public boolean hasNext() {
			current++;
			return index>current;
		}

		public 용주 next() {
			return list[current];
		}
	}

	public Iterator iterator() {
		return new GIterator();
	}
	
}
