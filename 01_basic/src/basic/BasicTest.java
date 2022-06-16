package basic;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println('A' + 3);
		System.out.println((char)('A' + 3));
		System.out.println((char)('A' + 32));
		System.out.println("A" + 3);
		
		System.out.println(2 + 5);
		System.out.println('2' + '5'); //103    2(50) + 5(53)  아스키코드
		System.out.println("2" + "5"); // 25
		System.out.println((char)(55)); // 7
		System.out.println('2' -48 + '5' -48); //7
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5")); //7, 문자열을 숫자로변환, 정수형(Integer). 실수형(Double)
		
	}

}
