﻿package _02_;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값：");	
		int a = stdIn.nextInt();
		System.out.print("b의 값：");	
		int b = stdIn.nextInt();
		System.out.print("c의 값：");	
		int c = stdIn.nextInt();
		
		int max = a;
		
		
		if(max >= b) {
			max = max;
		}
		else {
			max = b;
		}
		
		if(max >= c) {
			max = max;
		}
		else {
			max = c;
		}

		System.out.println("최댓값은 " + max + "입니다.");
		stdIn.close();
	}
	
}