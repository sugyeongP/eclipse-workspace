package overrideGame;

import java.util.Scanner;

public class ExcMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Poket p = null;
		System.out.println("���ϸ��� �����Ͻÿ�.");
		System.out.println("1. ��ī��\n2. �̻��ؾ�\n3. ���α�");
			int x = sc.nextInt();
			System.out.println("�̸��� �Է��Ͻÿ�.");
			String name = sc.next();
			
			if(x==1)
				p = new Picachu(name);
			else if(x==2)
				p = new Lee(name);
			else if(x==3)
				p = new Gobook(name);
			boolean flag = true;
			
			while(flag) {
				System.out.println("�޴�");
				System.out.println("1. ��\n2. ��\n3. �\n4. ����\n5. ��");
				x = sc.nextInt();
				switch(x) {
				case 1 :
					p.eat();
					p.print();
					break;
					
				case 2 :
					p.sleep();
					p.print();
					break;
				case 3 :
					p.exercise();
					p.print();
					if(p.energy <= 0) {
						System.out.println("���� ����");
						flag = false;
					}break;
				case 4 :
					p.attack();
					p.print();
					if(p.energy <= 0) {
						System.out.println("���� ����");
						flag = false;
					} break;
				case 5 :
					flag = false;
				}
			}sc.close();
	}

}