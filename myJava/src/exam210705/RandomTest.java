package exam210705;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];	// �迭 ����
		int num;
		int ran;	// �������� �����ϴ� ����
		ran = (int)(Math.random() * 10 + 1);
		
		System.out.println((double)Math.random()); 	// 0.1xx ~ 0.99 , 0 �� 9 ������ ����
		System.out.println((int)(Math.random()*10));	// 0 ~ 9
		System.out.println((int)(Math.random()*10 + 1));	// 1 ~ 10
		System.out.println((int)(Math.random()*100));	// 0 ~ 99
		System.out.println((int)(Math.random()*100 + 1));	// 1 ~ 100
		
		/*
		System.out.print("���� ��� ���� ������ ���Դϱ�? >> ");
		num = sc.nextInt();

		arr = new int[num]; // �迭 ���� ( �迭�� index �� ���� ����

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < i; j++)
				if (arr[i] == arr[j])
					i--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i % 10 == 0 && i != 0)
				System.out.println();
			System.out.printf(arr[i] + " ");

		}
		sc.close();
		*/
	}

}