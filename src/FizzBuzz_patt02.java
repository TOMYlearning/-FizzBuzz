
public class FizzBuzz_patt02 {

	public static void main(String[] args) {
		
		//条件値セット[ a b ]
		int a =3;
		int b =5;
		
		for(int count = 1; count <= 100; count++) {
			
			if(count % a == 0 || count % b == 0) {
				
				if(count % a == 0 ) {
				System.out.print("Fizz");	
				
				}
				if(count % b == 0 ) {
				System.out.print("Buzz");
				
				}
				System.out.println();
				
			} else 
				System.out.println(count);
			
		}

	}

}
