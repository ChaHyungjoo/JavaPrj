package oop.collec.col;

import java.util.ArrayList;
import java.util.Iterator;

public class AsyncProgram {
	
/*	public static void download(ArrayList<Integer> list, int num) {
		for(int i=0; i<100; i++)
			System.out.printf("%d: %d%%\n", num, list.get(i));
	}*/
/*	public static void download(GenericList<Integer> list, int num) {
//		while(list.hasNext())			//current�ε����� �����ǰ�����
//			System.out.printf("%d: %d%%\n", num, list.next());
		GIterator iter = list.iterator();		//
		while(iter.hasNext())			//current�ε����� �����ǰ������Ƿ� �����忡 �������� ����
			System.out.printf("%d: %d%%\n", num, iter.next());
	}*/
	
	public static void download(ArrayList<Integer> list, int num) {
/*		Iterator iter = list.iterator();
		while(iter.hasNext())
			System.out.printf("%d: %d%%\n", num, iter.next());*/
		for(Integer n: list)	//iterator�� ��ȯ�� �� �ִ� ���� �ݺ������� ��ȯ��
			System.out.printf("%d: %d%%\n", num, n);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		GenericList<Integer> list = new GenericList<>();
		
//		//����
//		for(int i=0; i<100; i++)
//			list.add(i+1);
//		
//		download(list, 1);
//		download(list, 2);
		
		//thread�� �̿��� �񵿱�
		for(int i=0; i<100; i++)
			list.add(i+1);
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				download(list, 1);
			}
		});
		thread1.start();
		
/*		Thread thread1 = new Thread(()->download(list,1));	//���ٽ�
		thread1.start();*/
//		Thread thread1 = new Thread(()->download(list,1)).start();
		
		download(list, 2);
		
		System.out.println("���α׷� ����");

	}

}
