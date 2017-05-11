package com.kyuwan.java.collection;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {

		// 1. List 계열
		// .add(값) : 값입력
		// .get(순서) : 값출력 
		ArrayList<Integer> list = new ArrayList<>();
		int a = 33;
		
		list.add(457); // 제네릭을 사용하지 않는 컬렉션은 입력되는 값을 Object로 Casting 한다 
		list.add(1234);
		//list.add("AAAA");
		
		// 스트링 첫번째 글자 출력하기 
		System.out.println("ABCDE".substring(0, 1));
		
		
		for(int i = 0 ; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		// 향상된 for 문
		for(Object item : list){
			String string = item + "";
			int number = Integer.parseInt(string);
			System.out.println(number + 3);
		}
		
		// 2. Map 계열
		
		// 3. Set 계
		
	}

}
