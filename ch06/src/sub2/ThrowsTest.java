package sub2;

import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 	날짜 : 2025/07/21
 * 	이름 : 정순권	
 * 	내용 : 자바 예외던지기 실습하기
 */
public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method1(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");		
	}
	
	public static void method1(int n) throws Exception { // 모든 예외처리 클래스를 상속하는 상위 클래스 Exception으로 선언
			method2(n);
	}
	
	// InputMismatchException, ArithmeticException을 method2를 호출한 곳에서 예외처리
	public static void method2(int n) throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);
		System.out.print("값 입력 : ");
		
		int value = sc.nextInt(); //InputMissmatchException 발생
		
		int result = n / value; // ArtithmeticException
		
		System.out.println("result : "+result);
		sc.close();
	}
}
