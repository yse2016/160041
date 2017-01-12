// Aloha.java

public class Aloha {
	public static void main(String[] args) {

		/*
		// 1.
		System.out.println("Aloha");

		// 2.
		for( int i=0; i<20; i++ ){
			if( i%3 == 0 ){
				System.out.println(i+": Aloha");
			} else {
				System.out.println("Aloha");
			}
		}
		*/

		// 3.
		Alohaman am = new Alohaman();

		// args[]の個数によって、使い分ける
		int num = args.length;

		// args[]の個数による場合分け
		if(num == 0) {
			am.sayAloha();

		} else if( num == 1 ) {
			// args[]は文字列なので、int に変換する
			int data1 = Integer.parseInt( args[0] );
			am.sayAloha( data1 );

		} else if( num == 2 ) {
			// args[]は文字列なので、int に変換する
			int data1 = Integer.parseInt( args[0] );
			int data2 = Integer.parseInt( args[1] );
			am.sayAloha( data1, data2 );
		}
	}
}



class Alohaman {

	// データ
	private String msg1;
	private String msg2;

	// 処理
	public Alohaman(){
		// コンストラクタ: インスタンス作成時に自動的に実行される
		this.msg1 = "Aloha";
		this.msg2 = "Hello";
	}

	public void sayAloha(){
		// msg1 を出力
		System.out.println( this.msg1 );
	}

	public void sayAloha( int n ){
		// msg1 を n 回出力
		for( int i=0; i<n; i++ ){
			System.out.println( this.msg1 );
		}
	}

	public void sayAloha( int n, int x ){
		// msg1 を n 回出力し、x 回に1回、msg2 を出力
		for( int i=0; i<n; i++ ){
			if( i%x == 0 ){
				System.out.println( i +": "+ msg2 );
			} else {
				System.out.println( i +": "+ msg1 );
			}
		}
	}
}