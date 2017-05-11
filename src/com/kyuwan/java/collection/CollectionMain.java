package com.kyuwan.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {

		// 1. List �迭
		// ���������� ���� �ԷµǸ� ���� �Բ� ������ ����Ǵ� ���� 
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
		for(int item : list){
			System.out.println(item + 3);
		}
		
		// 2. Map �迭
		// - (Ű, ��) �� ���·� ����ȴ� 
		HashMap<String,String> map = new  HashMap<>();
		map.put("key1", "�̼���");
		map.put("key2", "ȫ�浿");
	
		System.out.println(map.get("key1"));
		
		// 3. Set ��
		
	}

}
