// ShowText.java

import java.io.*;

public class ShowText{
	public static void main(String[] args) {
		try{

			// 0. データを準備
			File f            = new File("data.txt");
			FileReader fr     = new FileReader( f );
			BufferedReader br = new BufferedReader( fr );

			// 1. ファイルを開く
			System.out.println("file open...done.");

			// 2. 読み込む
			String data;

				// 最後の行まで読み込む

					// 1.読み込む
					while(true){

						// 1行だけ読む
						data = br.readLine();

						// null だったら読み込みを終える
						if( data == null ){
							break;
						}

						// 出力する
						System.out.println( data );
					}

			// 3. ファイルを閉じる
			br.close();


		// 例外処理
		} catch( IOException e ){
			System.out.println("エラーです");
			e.printStackTrace();
		}
	}
}