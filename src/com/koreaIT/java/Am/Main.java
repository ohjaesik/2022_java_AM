package com.koreaIT.java.Am;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");

		Scanner sc = new Scanner(System.in);
		int 번호 = 1;
		while (true) {
			System.out.printf("명령어) ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				continue;
			}
			if (command.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			} else if (command.equals("article write")) {
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("%s", title);
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				System.out.printf("%s", body);
				
				System.out.printf("%s번글이 생성되었습니다.\n", 번호);
				번호++;

			}

			if (command.equals("system exit")) {
				break;
			} else {
				System.out.printf("%s는(은) 존재하지 않는 명령어 입니다.\n", command);
			}
		}

		sc.close();

		System.out.println("== 프로그램 끝 ==");

	}
}
