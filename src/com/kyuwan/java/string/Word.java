package com.kyuwan.java.string;

public class Word {
	
	public static void main(String[] args){
		
		String name = "�ȳ��ϼ���";
		
		// 1. ���� �ڸ���
		String secondWorld = name.substring(1, 2);
		
		System.out.println(secondWorld);
		
		// 2. ���ڿ� ���� 
		int ���ڿ����� = name.length();
		System.out.println(���ڿ�����);
		
		// 3. �ѱ��ڸ� ��Ÿ���� 
		char �ѱ��� = name.charAt(0);
		System.out.println(�ѱ���);
		
		// 4. ���°�� �ִ��� �˷��� �� �� 
		// "�ϼ�"��� ���ڿ��� ���°�� �ִ��� �˷��� 
		int ���° = name.indexOf("�ϼ�");
		System.out.println(���°);
		
		// 5. ���ڸ� �ɰ��� �����Ҷ� 
		String �ε���[] = name.split("��");
		System.out.println(�ε���[0]);
		System.out.println(�ε���[1]);
		
		// 6. ���ڸ� ġȯ�Ҷ� 
		String �ٲ�� = name.replace("��", "������");
		System.out.println(�ٲ��);
	}

}
