package com.kyuwan.java.array;

public class ArrayMain {

	public static void main(String[] args) {


		int arr[] = new int[10];
		int arr2[] = {1,2,3,4,5};
		
		for(int a1 : arr){
			System.out.println(a1);
		}
		
		for(int a2 : arr2){
			System.out.println(a2);
		}
		
		ArraySub subs[] = new ArraySub[10];
	
		subs[0] = new ArraySub();
		subs[1] = new ArraySub();
		subs[2] = new ArraySub();
		subs[3] = new ArraySub();
		subs[4] = new ArraySub();
		subs[5] = new ArraySub();
		subs[6] = new ArraySub();
		subs[7] = new ArraySub();
		subs[8] = new ArraySub();
		subs[9] = new ArraySub();
		
		for(ArraySub sub : subs){
			System.out.println(sub.a);
		}
	}

}
