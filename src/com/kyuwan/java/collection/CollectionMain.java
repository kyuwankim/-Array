package com.kyuwan.java.collection;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {

		// 1. List �迭
		// .add(��) : ���Է�
		// .get(����) : ����� 
		ArrayList list = new ArrayList();
		int a = 33;
		
		list.add(457);
		list.add(1234);
		list.add("AAAA");
		
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		for(Object item : list){
			System.out.println(item);
		}
		
		// 2. Map �迭
		
		// 3. Set ��
		
	}

}
