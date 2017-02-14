// Aloha.java

import java.util.HashMap;

public class Aloha{
	public static void main(String[] args) {
		// データを作る
		String src = "Kyoko was a high school student. Jennifer, a student from Canada, was staying with Kyoko's family. Kyoko and Jennifer were going to have job experiences together at a bakery for a week. They were going to work as salespersons. Kyoko wasn't interested in it, but Jennifer was because she wanted to have her own bakery in the future.";

		// データを整理する( replace() )
		src = src.replace(".", "");
		src = src.replace(",", "");
		src = src.replace("'", "");

		System.out.println( src );

		// 単語に区切る( split() )
		String[] kekka = src.split(" ");

		// 単語数を調べる
		System.out.println("単語数: " + kekka.length );

		// HashMap を作る
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// 単語リスト
		String[] words = new String[kekka.length];

		// 単語数
		int num_Words = 0;

		for( int i = 0; i < kekka.length; i++ ){
			// 単語を target に変換
			String target = kekka[i];
			System.out.println( target );

			// target に存在するかどうか確認する処理
			if( hm.containsKey( target ) ){
				// true: 登録済みの場合
				System.out.println( target + " は登録済みなので、++");

				// 現在の数値を調べる
				int age_Value = hm.get( target );

				// 数値を++する
				age_Value++;

				// 新しい数値を保存
				hm.put( target, age_Value );

			} else {
				// false: 未登録の場合
				System.out.println( target + "は未登録なので、新たに登録");
				hm.put( target, 1 );

				// 単語リストに新しく追加する
				words[num_Words] = target;

				// 単語数を増やす
				num_Words++;

				// 単語数を表示
				System.out.println("現在の単語数: " + num_Words );
			}
		}

		// 単語を全て表示
		for( int i = 0; i < num_Words; i++ ){
			String word = words[i];
			int count = hm.get( word );
			System.out.println( word + ": " + count );
		}
	}
}