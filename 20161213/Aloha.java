public class Aloha{
	public static void main(String[] args) {

		// Data
		String mainMsg;

		// method
		//for( int i=0; i<20; i++ ){

			// 3回に1回
		//	if ( i%3 == 0 ){
		//		System.out.println(i + ": " + args[0] );
		//} else {
		//		System.out.println(i + ": " + args[1] );
		//	}
		//}

		// 無限ループの処理
		while(true){
			System.out.println("exitを入力するまで終了できません >");
			mainMsg = new java.util.Scanner(System.in).nextLine();

			// 無限ループ終了の処理
			if( mainMsg.equals("exit") ){
				break;
			}
		}

		//System.out.println("2nd >");
		//String subMsg = new java.util.Scanner(System.in).nextLine();

		// 無限ループの脱出結果を表示する
		System.out.println( "end." );
	}
}