package exam210705;

import java.util.Scanner;

public class 문항16 {

	public static void main(String[] args) {
		String name;
		int i = 0;
		String course[] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score[] = { 95, 88, 76, 62, 55 };

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("과목 이름 >> ");
			name = scanner.next();
			if (name.equals("그만"))
				break;
			for (i = 0; i < course.length; i++) {
				if (course[i].equals(name)) {
					System.out.println(course[i] + "의 점수는 " + score[i]);
					break;
				}
				if (i == course.length - 1) {			// 인덱스는 0부터 4까지. 4까지 검사해서 맞는 name이 없으면 출력
					System.out.println("없는 과목 입니다.");
				}
			}
		}
		scanner.close();
	}

}
