// TestHashMap2.java
// 		args[0] を使って単語を入力
// 		↑未登録なら「1」とする
// 		↑登録済みなら「+1」する

import java.util.HashMap;

public class TestHashMap2{
	public static void main(String[] args) {
		// HashMap を作る
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Toma", 19 );

		// HashMap を表示する
		int age = hm.get("Toma");
		System.out.println("Toma: " + age );

		// args[0] が HashMap にあるか調べる
		String target = args[0];
		System.out.println( target );

		// 新しいデータなら登録する
		if( hm.containsKey( target ) ){
			// true: 新しくないデータ( 既に存在するデータ )
			System.out.println("登録済みです。");

			// 既存の値を１増やす
			// 1. 既存の値を取得
			int age_Value = hm.get( target );

			// 2. 取得した値を 1 増やす
			age_Value++;

			// 3. 新しい値をMapに保存する
			hm.put( target, age_Value );

		} else {
			// false: 新しいデータ( まだ存在しないデータ )
			System.out.println("未登録です。新しく登録します");
			hm.put( target, 1 );
		}

		// HashMap の内容を表示
		int value = hm.get("Toma");
		System.out.println("Toma: " + value );

		value = hm.get( target );
		System.out.println( target + ": " + value );
	}
}