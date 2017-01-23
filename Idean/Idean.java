// Idean.java

/* 要件
	- インタフェース
		- ボタン
			- 単語2個表示ボタン
			- メモを保存するためのボタン
		- 単語を表示するテキストフィールド( 2つ )
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
	public static void main(String[] args) {
		IdeanMan idm = new IdeanMan();
	}
}



class IdeanMan implements ActionListener{
	// field
	JFrame frame;
	JTextField idea_Name1;
	JTextField idea_Name2;
	JTextField file_Name;
	JTextArea memo_Area;
	JPanel field_Panel;
	JButton btn_Idea;
	JButton btn_Save;

	// method
	public IdeanMan(){
		// フレームを作る
		frame = new JFrame("Idean");
		frame.setLocation( 600, 300 );
		frame.setSize( 512, 512 );

		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// テキストフィールド,パネル,ボタンを作る
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

		// 載せる
			// panel に field を載せる
			field_Panel.add( idea_Name1 );
			field_Panel.add( idea_Name2 );
			field_Panel.add( btn_Idea );
			field_Panel.add( memo_Area );
			field_Panel.add( file_Name );
			field_Panel.add( btn_Save );

			// window に panel を載せる
			Container con =frame.getContentPane();
			con.setLayout( new GridLayout( 2, 1 ) );
			con.add( field_Panel );

		// window に表示
		frame.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		// 配列
		String[] idea1 = {"A","B","C"};
		String[] idea2 = {"1","2","3"};

		// コマンドを調べる
		String cmd = ae.getActionCommand();

		// 各ボタンがクリックされた時の処理
			// btn_Idea
			if( cmd.equals("idea")){
				// 配列からデータを持ってくる
				idea_Name1.setText( idea1[1] );
				idea_Name2.setText( idea2[1] );

			// btn_Save
			} else if( cmd.equals("save")){
				// ファイル名を調べる
				String text_File_Name = file_Name.getText();

				// データを準備する
				FileWriter fw = null;
				PrintWriter pw = null;

				try{
					// ファイルを開く
					fw = new FileWriter( text_File_Name );
					pw = new PrintWriter( fw );

					// 2つのアイデアフィールドを読み取る
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