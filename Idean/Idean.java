// Idean.java

/* 要件
	- インタフェース
		- ボタン
			- 単語2個表示ボタン
			- メモを保存するためのボタン
		- テキストフィールド
			- 単語を表示する場所( 2つ )
		- テキストエリア
			- メモを入力する場所
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Idean{
	public static void main(String[] args) {
		IdeanMan idm = new IdeanMan();
	}
}



class IdeanMan implements ActionListener{
	// field
	JFrame frame;
	JTextField idea_Name1;	// アイデア出力欄
	JTextField idea_Name2;
	JTextField file_Name;	// ファイル名入力欄
	JTextArea memo_Area;	// メモ欄
	JPanel field_Panel;
	JButton btn_Idea;		// アイデア表示ボタン
	JButton btn_Save;		// ファイル保存ボタン
	JLabel label_Plus;

	// method
	public IdeanMan(){
		// フレームを作る
		frame = new JFrame("Idean");
		frame.setLocation( 600, 250 );
		frame.setSize( 512, 275 );

		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// テキストフィールド,パネル,ボタン,ラベルを作る
			// アイデア出力欄( idea_Name1, idea_Name2 )
			idea_Name1 = new JTextField("ここにアイデアが出ます",15);
			idea_Name2 = new JTextField("ここにアイデアが出ます",15);

			// メモ欄( memo_Area )
			memo_Area = new JTextArea( 10, 30 );

			// ファイル名入力欄
			file_Name = new JTextField("ファイル名を入力.txt",15);

			// パネル
			field_Panel = new JPanel();

			// ボタン
				// btn_Idea
				btn_Idea = new JButton("単語2個表示");
				btn_Idea.addActionListener(this);
				btn_Idea.setActionCommand("idea");

				// 保存ボタン
				btn_Save = new JButton("保存");
				btn_Save.addActionListener(this);
				btn_Save.setActionCommand("save");

			// ラベル(window に表示するテキスト)
			label_Plus = new JLabel("+");

		// 載せる
			// panel に field を載せる
			field_Panel.add( idea_Name1 );
			field_Panel.add( label_Plus );
			field_Panel.add( idea_Name2 );
			field_Panel.add( btn_Idea );
			field_Panel.add( memo_Area );
			field_Panel.add( file_Name );
			field_Panel.add( btn_Save );

			// window に panel を載せる
			Container con = frame.getContentPane();
			con.setLayout( new GridLayout( 1, 1 ) );
			con.add( field_Panel );

		// window に表示
		frame.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		// 配列関連
			// 配列
			String[] idea1 = {"ペン","水素","片栗粉","ちくわ","時計","チョコレート","音楽","トランプ","シイタケ"};
			String[] idea2 = {"りんご","酸素","鶏肉","パフェ","カレンダー","バナナ","ゲーム","アメリカ","こんにゃく"};

			// 配列からリストに変換
			List<String> list1 = Arrays.asList( idea1 );
			List<String> list2 = Arrays.asList( idea2 );

			// リストの並びをシャッフル
			Collections.shuffle( list1 );
			Collections.shuffle( list2 );

			// list から配列に戻す
			String[] array1 = (String[])list1.toArray(new String[list1.size()]);
			String[] array2 = (String[])list2.toArray(new String[list2.size()]);

			// シャッフルされた配列の先頭を取得
			String result1 = array1[0];
			String result2 = array2[0];

		// コマンドを調べる
		String cmd = ae.getActionCommand();

		// 各ボタンがクリックされた時の処理
			// btn_Idea
			if( cmd.equals("idea") ){
				// 配列からデータを持ってくる
				idea_Name1.setText( result1 );
				idea_Name2.setText( result2 );

			// btn_Save
			} else if( cmd.equals("save") ){
				// ファイル名を調べる
				String text_File_Name = file_Name.getText();

				// データを準備する
				FileWriter fw = null;
				PrintWriter pw = null;

				try{
					// ファイルを開く
					fw = new FileWriter( text_File_Name );
					pw = new PrintWriter( fw );

					// 3つのフィールドを読み取る
					String data1 = idea_Name1.getText();
					String data2 = idea_Name2.getText();
					String data3 = memo_Area.getText();

					// ファイルに書き込み、保存
					pw.println( data1 +" + "+ data2 );
					pw.println("↓");
					pw.println( data3 );

				// 例外処理
				} catch( IOException e ){
					System.out.println("エラー");
				} finally {
					// ファイルを閉じる
					try{
						fw.close();
						pw.close();
					} catch( IOException e ){
						System.out.println("エラー");
					}
				}

			}
	}
}