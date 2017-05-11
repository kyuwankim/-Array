package com.kyuwan.java.collection;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain {

	public static void main(String[] args) {

		// 1. List 계열
		// 내부적으로 값이 입력되면 값과 함께 순서가 저장되는 형태 
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
		for(int item : list){
			System.out.println(item + 3);
		}
		
		// 2. Map 계열
		// - (키, 값) 의 형태로 저장된다 
		HashMap<String,String> map = new  HashMap<>();
		map.put("key1", "이순신");
		map.put("key2", "홍길동");
	
		System.out.println(map.get("key1"));
		
		// 3. Set 계
		
	}

}
