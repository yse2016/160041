// TextEditor.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor{
	public static void main(String[] args) {
		//System.out.println("text");
		TextEditorMan tem = new TextEditorMan();
	}
}



class TextEditorMan implements ActionListener{
	// field
	JFrame frame;
	JTextField file_Name;		// テキストフィールド( ファイル名の指定場所 )
	JPanel field_Panel;
	JButton btn_Open;			// 開く
	JButton btn_Save;			// 保存
	JTextArea text_Area;		// テキストエリア
	JScrollPane scroll_Pane;	// スクロールペイン

	// method
	public TextEditorMan(){
		// フレームを作る
		frame = new JFrame("TextEditor");	// window の名前
		frame.setLocation( 600, 300 );		// window の場所
		frame.setSize( 512, 300 );			// window の大きさ
		// ↓終了時の処理
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// テキストフィールド,パネル,ボタンを作る

			// テキストフィールド( ファイル名の指定場所 )
			file_Name = new JTextField("Hello", 20 );

			// パネル
			field_Panel = new JPanel();

			// ボタン

				// 開くボタン
				btn_Open = new JButton("開く");
				btn_Open.addActionListener(this);
				btn_Open.setActionCommand("open");

				// 保存ボタン
				btn_Save = new JButton("保存");
				btn_Save.addActionListener(this);
				btn_Save.setActionCommand("save");

			// テキストエリア
			text_Area = new JTextArea( 10, 30 );

			// スクロールペイン
			scroll_Pane = new JScrollPane( text_Area );

		// 載せる

			// panel に field を載せる
			field_Panel.add( file_Name );
			field_Panel.add( btn_Open );
			field_Panel.add( btn_Save );

			// window に panel を載せる
			Container con = frame.getContentPane();
			con.setLayout( new GridLayout( 2, 1 ) );
			con.add( field_Panel );
			con.add( scroll_Pane );

		// window を表示する
		frame.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		// テキストエリアに書き込む
		//text_Area.setText("Aloha");

		// コマンドを調べる
		String cmd = ae.getActionCommand();

		// 各ボタンがクリックされた時の処理
			// 開くボタンがクリックされたら同じファイル名を開く
			if( cmd.equals("open")){

				// ファイル名を調べる
				String text_File_Name = "1st.";

				// 「ファイルを開く」を開く
				JFileChooser fc = new JFileChooser();

				// 表示する dir を決める
				fc.setCurrentDirectory( new File(".") );

				// ダイアログを呼び出す
				int ret = fc.showOpenDialog( frame );

				// 選ばれたファイルを調べる
				if( ret == JFileChooser.APPROVE_OPTION ){

					// 選ばれたファイル
					File file = fc.getSelectedFile();

					// ファイル名、保存場所を調べる
					text_File_Name = file.getAbsolutePath();

					// テキストフィールドに表示
					file_Name.setText( text_File_Name );
				}

				// データを準備
				FileReader fr;		// ファイル読み込み関連
				BufferedReader br;

				try{
					// ファイルを開く
					fr = new FileReader( text_File_Name );
					br = new BufferedReader( fr );

					// データを読んで表示する
					String data;
					while( (data = br.readLine() ) != null ){
						text_Area.append( data + '\n');	// '\n': 改行
					}

				// 例外処理
				} catch( IOException e ){
					System.out.println("エラー");
				}

			// 保存ボタンがクリックされたら "保存" を表示
			} else if( cmd.equals("save")){

				// ファイル名を調べる
				String text_File_Name = file_Name.getText();

				// データを準備する
				FileWriter fw = null;		// ファイル保存関連
				PrintWriter pw = null;

				try{
					// ファイルを開く
					fw = new FileWriter( text_File_Name );
					pw = new PrintWriter( fw );

					// テキストエリアの内容を読み取る
					String data = text_Area.getText();

					// ファイルに書き込み、保存する
					pw.println( data );

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