// Aloha2.java
//	HashMap:	put():			新たに配置
//				get():			取得
//				containsKey()
//				replace():		valueを更新( 置き換え )
//				remove():		削除
//		[key →	value]のセットを保存する
//		["Sato" → 20]
//		["Sato" → "Machida"]
//		[160xxx → "Sato"]

import java.util.HashMap;

public class Aloha2{
	public static void main(String[] args) {
		// データ準備
		String key = "";
		String val = "";

		// HashMap を生成
		HashMap<String, String> hm = new HashMap<String, String>();

		// データを入れる
		hm.put("Sato", "Tokyo");
		hm.put("Suzuki", "Yokohama");

		// データを取り出し、表示
		String val2 = hm.get("Sato");
		System.out.println("Sato: " + val2 );

		// args[0] を Key, args[1] を Value として新しいデータを追加する
		//key = args[0];
		//val = args[1];

		// ↑追加したデータを表示する
		//hm.put( key, val );
		//System.out.println( key + ": " + val );

		// HashMap のデータを全て表示
		hm.forEach( ( keyName, valueAddress ) -> System.out.println( keyName + ": " + valueAddress ) );

		//

	}
}