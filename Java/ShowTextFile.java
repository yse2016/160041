// ShowTextFile.java

import java.io.*;

public class ShowTextFile{
	public static void main(String[] args) {
		try{

			// 1. データを準備
			File f            = new File( args[0] );	// ファイル名を入力
			FileReader fr     = new FileReader( f );
			BufferedReader br = new BufferedReader( fr );

			// 2. ファイルを読み取る
			int data = br.read();

			// 3. 読み取った結果を表示する
			System.out.print( (char)data );

			// 3. ファイルを閉じる
			br.close();

		// 例外処理
		} catch( IOException e ){
			System.out.println("エラー");
			e.printStackTrace();
		}
	}
}