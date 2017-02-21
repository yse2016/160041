// OverLoad.java

public class OverLoad{
	public static void main(String[] args) {
		// 準備
		OverLoadMan man = new OverLoadMan();

		// method を呼び出して使う
		man.sayAloha();
		man.sayAloha("Sato");
		man.sayAloha( 5 );
		man.sayAloha( 10, 4, "すずき");
	}
}

class OverLoadMan{
	// field
	private String nameK;	// 漢字名
	private String nameH;	// 平仮名
	private int numRepeat;	// 繰り返し
	private int numSpecial;

	// method
	// 引数なし
	public void sayAloha(){
		System.out.println("引数なし");
	}

	// 引数: 文字列１つ
	public void sayAloha( String str ){
		System.out.println("Hello " + str + "!");
	}

	// 引数: 整数１つ
	public void sayAloha( int num ){
		for( int i = 0; i < num; i++ ){
			System.out.println( i + ": Aloha");
		}
	}

	// 引数: 整数２つ + 文字列１つ
	public void sayAloha( int num, int sp, String str ){
		if( num%sp == 0 ){
			System.out.println( num + ": " + str );
		} else {
			System.out.println( num + ": " + str + "(余り)" );
		}
	}
}