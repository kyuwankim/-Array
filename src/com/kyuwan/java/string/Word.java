package com.kyuwan.java.string;

public class Word {
	
	public static void main(String[] args){
		
		String name = "안녕하세요";
		
		// 1. 글자 자르기
		String secondWorld = name.substring(1, 2);
		
		System.out.println(secondWorld);
		
		// 2. 문자열 길이 
		int 문자열길이 = name.length();
		System.out.println(문자열길이);
		
		// 3. 한글자만 나타낼때 
		char 한글자 = name.charAt(0);
		System.out.println(한글자);
		
		// 4. 몇번째에 있는지 알려고 할 때 
		// "하세"라는 문자열이 몇번째에 있는지 알려줌 
		int 몇번째 = name.indexOf("하세");
		System.out.println(몇번째);
		
		// 5. 문자를 쪼개서 저장할때 
		String 두덩이[] = name.split("하");
		System.out.println(두덩이[0]);
		System.out.println(두덩이[1]);
		
		// 6. 글자를 치환할때 
		String 바뀐글 = name.replace("하", "하하하");
		System.out.println(바뀐글);
		
		// 숫자 갯수 구하기 (1부터 10000까지 8이라는 숫자가 총 몇번 나오는가?)
		int count = 0;
		for(int i = 0 ; i <= 10000 ; i ++){
			String string = i+"";
			int truth = 0 ;
			truth = string.indexOf("8");
			if(truth == -1){
				truth = truth * 0 ;
			}
			count = count + truth;
		}
		System.out.print(count);
	}
	
	

}
