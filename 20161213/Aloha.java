public class Aloha{
	public static void main(String[] args) {

		// Data
		System.out.println("1st >");
		String mainMsg = new java.util.Scanner(System.in).nextLine();

		System.out.println("2nd >");
		String subMsg = new java.util.Scanner(System.in).nextLine();

		// method
		for( int i=0; i<20; i++ ){

			// 3回に1回
			if ( i%3 == 0 ){
				System.out.println(i + ": " + args[0] );
		} else {
				System.out.println(i+": " + args[1] );
			}
		}

		// String の結果を表示する
		System.out.println( mainMsg );
		System.out.println( subMsg );
	}
}