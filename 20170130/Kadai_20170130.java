// Kadai_20170130.java

/* 要件
	- 主要なポータルサイトにアクセスするアプリ
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class Kadai_20170130{
	public static void main(String[] args) {
		Window win = new Window();
	}
}

// window 関連
class Window implements ActionListener{
	// field
	JFrame frame_Main;
	JPanel panel_Main;

	JLabel text;			// 画面内に表示するテキスト
	JButton btn_Yahoo;		// ボタン
	JButton btn_Google;
	JButton btn_Bing;
	JButton btn_Hatena;
	ImageIcon ico_Yahoo;	// ボタンに表示する画像
	ImageIcon ico_Google;
	ImageIcon ico_Bing;
	ImageIcon ico_Hatena;

	// method
	public Window(){
		// フレームを生成
		frame_Main = new JFrame("Kadai_20170130");
		frame_Main.setLocation( 400, 250 );
		frame_Main.setSize( 360, 180 );

		// " x "クリックで終了するようにする
		frame_Main.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// window サイズを固定する
		frame_Main.setResizable(false);

		// パネル,テキスト,ボタンの類を生成
			// パネル
			panel_Main = new JPanel();

			// テキスト
			text = new JLabel("アクセスしたいサイトをクリックしてください");

			// ボタン
				// Yahoo
					// ボタンの画像
					ico_Yahoo = new ImageIcon("img/yahoo_logo.png");
					// ボタンの設定
					btn_Yahoo = new JButton( ico_Yahoo );
					btn_Yahoo.addActionListener(this);
					btn_Yahoo.setActionCommand("yahoo");

				// Google
					// ボタンの画像
					ico_Google = new ImageIcon("img/google_logo.png");
					// ボタンの設定
					btn_Google = new JButton( ico_Google );
					btn_Google.addActionListener(this);
					btn_Google.setActionCommand("google");

				// Bing
					// ボタンの画像
					ico_Bing = new ImageIcon("img/bing_logo.png");
					// ボタンの設定
					btn_Bing = new JButton( ico_Bing );
					btn_Bing.addActionListener(this);
					btn_Bing.setActionCommand("bing");

				// はてな
					// ボタンの画像
					ico_Hatena = new ImageIcon("img/hatena_logo.png");
					// ボタンの設定
					btn_Hatena= new JButton( ico_Hatena );
					btn_Hatena.addActionListener(this);
					btn_Hatena.setActionCommand("hatena");

		// 載せる
			// panel に field を載せる
			panel_Main.add( text );
			panel_Main.add( btn_Yahoo );
			panel_Main.add( btn_Google );
			panel_Main.add( btn_Bing );
			panel_Main.add( btn_Hatena );

			// window に panel を載せる
			Container con = frame_Main.getContentPane();
			con.setLayout( new GridLayout( 1, 1 ) );
			con.add( panel_Main );

		// window に表示
		frame_Main.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		// コマンドを調べる
		String ac_Cmd =ae.getActionCommand();

		// 各ボタンがクリックされた時の処理
		if( ac_Cmd.equals("yahoo") ){
			Yahoo y = new Yahoo();
		} else if( ac_Cmd.equals("google") ){
			Google g = new Google();
		} else if( ac_Cmd.equals("bing") ){
			Bing b = new Bing();
		} else if( ac_Cmd.equals("hatena") ){
			Hatena h = new Hatena();
		}
	}
}

class Yahoo{
	public Yahoo(){
		// データ
		String url_Yahoo = "http://www.yahoo.co.jp/";
		Desktop desktop = Desktop.getDesktop();

		// 処理
		try{
			URI uri = new URI( url_Yahoo );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Google{
	public Google(){
		// データ
		String url_Google = "https://www.google.co.jp/";
		Desktop desktop = Desktop.getDesktop();

		// 処理
		try{
			URI uri = new URI( url_Google );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Bing{
	public Bing(){
		// データ
		String url_Bing = "https://www.bing.com/";
		Desktop desktop = Desktop.getDesktop();

		// 処理
		try{
			URI uri = new URI( url_Bing );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Hatena{
	public Hatena(){
		// データ
		String url_Hatena = "http://www.hatena.ne.jp/";
		Desktop desktop = Desktop.getDesktop();

		// 処理
		try{
			URI uri = new URI( url_Hatena );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}