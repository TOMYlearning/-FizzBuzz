/*
 * クラス名：FizzBuzz
 * 1から100までの数値をループで処理する
 * 3で割り切れる数値の場合、「Fizz」と表示する
 * 5で割り切れる数値の場合、「Buzz」と表示する
 * 3と5の両方で割り切れる数値の場合、「FizzBuzz」と表示する
 * それ以外の数値は、その数値をそのまま表示する
 */
public class FizzBuzz {

	public static void main(String[] args) {
		int a =3;
		int b =5;
		for(int count = 1; count < 101; count++) {
			if(count % a == 0 ) {
				if(count % b == 0 ) {
				System.out.println("FizzBuzz");
				}
				else System.out.println("Fizz");
			}
			else if(count % b == 0 ) {
				System.out.println("Buzz");
				}
			else System.out.println(count);
		}
	}
}
