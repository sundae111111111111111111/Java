package p92;

public class BitOperator {

	public static void main(String[] args) {
		
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		// 비트 논리 연산
		System.out.println("[비트 연산 결과]");
		System.out.printf("%04x\n", (short)(a & b));
		System.out.printf("%04x\n", (short)(a | b));
		System.out.printf("%04x\n", (short)(a ^ b));
		System.out.printf("%04x\n", (short)(~a));
		
		byte c =20;
		byte d = -8;
		
		// 비트 시프트 연산
		System.out.println("[시프트 연산 결과]");
		System.out.println(c << 2);
		System.out.println(c >> 2);
		System.out.println(d >> 2);
		System.out.printf("%x\n", (d >>> 2));
		
	}
}
