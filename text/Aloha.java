// Aloha.java

public class Aloha{
	public static void main(String[] args) {
		// テキストデータを作る
		String src = "Kyoko was a high school student. Jennifer, a student from Canada, was staying with Kyoko's family.";

		// 単語数をカウント
			// 区切る( 不要な部分の削除 )
			String kekka = src.replace(".", "");
			kekka = kekka.replace(",", "");
			kekka = kekka.replace("'s", "");

			String[] kekka2 = kekka.split(" ");

			// 配列の要素を数える
			int num = kekka2.length;

			// 1単語1行で表示する
			for( int i = 0; i < num; i++ ){
				System.out.println( kekka2[i] );
			}

			// "Kyoko" をカウント
			String target = "from";	// 調べたい単語
			int num_Kyoko = 0;			// 調べた単語の数

			for( int i = 0; i < num; i++ ){
				if( kekka2[i].equals( target ) ){
					num_Kyoko++;
				}
			}

			// "Kyoko" の数を出力
			System.out.println( target + "の数: " + num_Kyoko );

	}
}