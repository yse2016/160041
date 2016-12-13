public class Aloha{
	public static void main(String[] args) {

		// 1.
		for( int i=0; i<20; i++ ){
			if ( i%3 == 0 ){
				System.out.println(i + ": " + args[0] );
		} else {
				System.out.println(i+": " + args[1] );
			}
		}
	}
}