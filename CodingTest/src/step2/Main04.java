package step2;

import java.util.Scanner;

public class Main04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}else if(x>0 && y<0){
			System.out.println("4");
		}else {
			System.out.println("축");
		}
		sc.close();
	}
}
