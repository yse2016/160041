// AlohaWindow.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class AlohaWindow{
	public static void main(String[] args) {
		AlohaWindowMan awm = new AlohaWindowMan();
	}
}



class AlohaWindowMan implements ActionListener{
	// field: データ
	JFrame frame;
	JButton btn_Open;
	JButton btn_Save;
	JPanel panel;
	JTextField fileName;
	JTextArea textArea;
	JScrollPane scrollPane;

	// method: 処理
	public AlohaWindowMan(){
		// フレーム( window )を作る
		frame = new JFrame("AlohaWindow");	// window の名前
		frame.setLocation( 800, 300 );		// window の場所
		frame.setSize( 300, 300 );			// window の大きさ
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );	// 閉じる処理

		// ボタンとフィールドをパネルに載せる
			// ボタン
			btn_Open = new JButton("OPEN");				// 開くボタンに表示する名前
			btn_Open.addActionListener(this);		// アクション
			btn_Open.setActionCommand("open");

			btn_Save = new JButton("SAVE");				// 保存ボタンに表示する名前
			btn_Save.addActionListener(this);		// アクション
			btn_Save.setActionCommand("save");

			// テキストエリア
			textArea = new JTextArea( 10, 30 );

			// スクロール
			scrollPane = new JScrollPane( textArea );

			// フィールド
			fileName = new JTextField("Aloha", 20 );	// 表示する文字と大きさ

			// パネル
			panel = new JPanel();	// パネルを生成
			panel.add( fileName );	// テキストエリアを表示
			panel.add( btn_Open );	// 開くボタンを表示
			panel.add( btn_Save );	// 保存ボタンを表示

		// ContetntPaneを作り、パネルを載せる
		Container con = frame.getContentPane();
		con.setLayout( new GridLayout( 2, 1 ) );
		con.add( panel );
		con.add( scrollPane );

		// 表示する
		frame.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		String cmd = ae.getActionCommand();

		// 各ボタンがクリックされた時の処理
		if( cmd.equals("open") ){
			fileName.getText();

			// ファイル名を取得
			String textFile = fileName.getText();

			// ファイル入出力↓
			FileReader fr;
			BufferedReader br;

			try{
				fr = new FileReader( textFile );
				br = new BufferedReader( fr );

				String data;
				while((data = br.readLine()) != null){
					textArea.append( data + '\n' );
				}
				textArea.setText( data );		// 書き込み・表示

			} catch( IOException e ){
				System.out.println("エラー");
			}
		} else if( cmd.equals("save") ){
			fileName.setText("Save");
		}
	}
}