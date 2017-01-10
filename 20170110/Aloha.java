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
		am.sayAloha(20,3);
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
		// "Aloha"と出力
		System.out.println( this.msg1 );
	}

	public void sayAloha( int n ){
		// "Aloha"と n 回出力
		for( int i=0; i<n; i++ ){
			System.out.println( this.msg1 );
		}
	}

	public void sayAloha( int n, int x ){
		// "Aloha"と n 回出力し、x 回に1回、"Hello"と出力
		for( int i=0; i<n; i++ ){
			if( i%3 == 0 ){
				System.out.println( i +": "+ msg2 );
			} else {
				System.out.println( i +": "+ msg1 );
			}
		}
	}
}