package com.kyuwan.java.collection;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {

		// 1. List �迭
		// .add(��) : ���Է�
		// .get(����) : ����� 
		ArrayList<Integer> list = new ArrayList<>();
		int a = 33;
		
		list.add(457); // ���׸��� ������� �ʴ� �÷����� �ԷµǴ� ���� Object�� Casting �Ѵ� 
		list.add(1234);
		//list.add("AAAA");
		
		// ��Ʈ�� ù��° ���� ����ϱ� 
		System.out.println("ABCDE".substring(0, 1));
		
		
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		// ���� for ��
		for(Object item : list){
			String string = item + "";
			int number = Integer.parseInt(string);
			System.out.println(number + 3);
		}
		
		// 2. Map �迭
		
		// 3. Set ��
		
	}

}
