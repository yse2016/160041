// TestHashMap.java
//		HashMap のテスト

import java.util.HashMap;

public class TestHashMap{
	public static void main(String[] args) {
		// HashMap を作る
		HashMap<String, String> hm = new HashMap<String, String>();
		HashMap<String, Integer> hm2 = new HashMap<String, Integer>();

		// HashMap にデータを入れる
		hm.put("apple", "りんご");

		// 入れたデータを表示
		String data = hm.get("apple");
		System.out.println( data );

		// HashMap hm2 にデータを入れる
		hm2.put("Aoki", 24);
		hm2.put("Yamaguchi", 30);
		hm2.put("Miwa", 28);

		if(hm2.containsKey("Jennifer") ){
			System.out.println("登録済み");
		} else {
			System.out.println("未登録です");
			hm2.put("Jennifer", 1);
		}

		System.out.println("Jennifer: " + hm2.get("Jennifer") );

		// 入れたデータを表示
		int toshi = hm2.get("Aoki");
		System.out.println( "Aokiの年齢: " + toshi );
	}
}