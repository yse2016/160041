// Test_20170131.java

/* 要件
	- ボタンクリックでサイトにアクセスするアプリ
	- 手動でURLを入力してアクセスする
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;

public class Test_20170131{
	public static void main(String[] args) {
		Window win = new Window();
	}
}

class Window implements ActionListener{
	// field
	String window_Name;	// window の名前データ
	JFrame frame_Main;
	JPanel panel_Main;

	JLabel text1;		// window 内に表示する文字
	JButton btn_1;		// ボタン
	JButton btn_2;
	JButton btn_3;
	JButton btn_4;
	JButton btn_5;
	JButton btn_6;
	ImageIcon ico_1 = new ImageIcon("img/icon_yahoo.png");	// ボタンに表示する画像
	ImageIcon ico_2 = new ImageIcon("img/icon_google.png");
	ImageIcon ico_3 = new ImageIcon("img/icon_bing.png");
	ImageIcon ico_4 = new ImageIcon("img/icon_hatena.png");
	ImageIcon ico_5 = new ImageIcon("img/icon_yse.png");

	// method
	public Window(){
		// window の名前を決める
		this.window_Name = "Test_20170131";

		// フレームを生成
		frame_Main = new JFrame( window_Name );			// window の名前
		frame_Main.setLocation( 400, 250 );				// 表示する場所
		frame_Main.setSize( 284, 160 );					// window の大きさ

		// "x"クリックで終了するようにする処理
		frame_Main.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// サイズを固定する処理
		frame_Main.setResizable(false);

		// パネル,ボタンの類を生成
			// パネル
			panel_Main = new JPanel();

			// テキスト
			text1 = new JLabel("アクセスしたいサイトをクリックしてください");

			// ボタン
				// btn_1
					// ボタンの設定
					btn_1 = new JButton( ico_1 );		// ボタンに表示する画像
					btn_1.setText("Yahoo!");			//                 文字
					btn_1.addActionListener(this);
					btn_1.setActionCommand("btn_1");
				// btn_2
					// ボタンの設定
					btn_2 = new JButton( ico_2 );
					btn_2.setText("Google");
					btn_2.addActionListener(this);
					btn_2.setActionCommand("btn_2");
				// btn_3
					// ボタンの設定
					btn_3 = new JButton( ico_3 );
					btn_3.setText("Bing");
					btn_3.addActionListener(this);
					btn_3.setActionCommand("btn_3");
				// btn_4
					// ボタンの設定
					btn_4 = new JButton( ico_4 );
					btn_4.setText("はてな");
					btn_4.addActionListener(this);
					btn_4.setActionCommand("btn_4");
				// btn_5
					// ボタンの設定
					btn_5 = new JButton( ico_5 );
					btn_5.setText("YSE");
					btn_5.addActionListener(this);
					btn_5.setActionCommand("btn_5");
				// btn_6
					// ボタンの設定
					btn_6 = new JButton("手動でURLを指定する");
					btn_6.addActionListener(this);
					btn_6.setActionCommand("btn_6");

		// 載せる
			// panel_Main に field を載せる
			panel_Main.add( text1 );
			panel_Main.add( btn_1 );
			panel_Main.add( btn_2 );
			panel_Main.add( btn_3 );
			panel_Main.add( btn_4 );
			panel_Main.add( btn_5 );
			panel_Main.add( btn_6 );

			// window に panel_Main を載せる
			Container con = frame_Main.getContentPane();
			con.setLayout( new BorderLayout( 1, 1 ) );
			con.add( panel_Main );

		// window に表示
		frame_Main.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		// コマンドを調べる
		String ac_Cmd = ae.getActionCommand();

		// 各ボタンがクリックされた時の処理
		if( ac_Cmd.equals("btn_1") ){
			Button_1 b1 = new Button_1();
		} else if( ac_Cmd.equals("btn_2") ){
			Button_2 b2 = new Button_2();
		} else if( ac_Cmd.equals("btn_3") ){
			Button_3 b3 = new Button_3();
		} else if( ac_Cmd.equals("btn_4") ){
			Button_4 b4 = new Button_4();
		} else if( ac_Cmd.equals("btn_5") ){
			Button_5 b5 = new Button_5();
		} else if( ac_Cmd.equals("btn_6") ){
			Button_6 b6 = new Button_6();
		}
	}
}

class Button_1{
	public Button_1(){
		// field
		String url_b1 = "http://www.yahoo.co.jp/";
		Desktop desktop = Desktop.getDesktop();

		// method
		try{
			URI uri = new URI( url_b1 );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Button_2{
	public Button_2(){
		// field
		String url_b2 = "https://www.google.co.jp/";
		Desktop desktop = Desktop.getDesktop();

		// method
		try{
			URI uri = new URI( url_b2 );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Button_3{
	public Button_3(){
		// field
		String url_b3 = "https://www.bing.com/";
		Desktop desktop = Desktop.getDesktop();

		// method
		try{
			URI uri = new URI( url_b3 );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Button_4{
	public Button_4(){
		// field
		String url_b4 = "http://www.hatena.ne.jp/";
		Desktop desktop = Desktop.getDesktop();

		// method
		try{
			URI uri = new URI( url_b4 );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Button_5{
	public Button_5(){
		// field
		String url_b5 = "http://www.yca.ac.jp/";
		Desktop desktop = Desktop.getDesktop();

		// method
		try{
			URI uri = new URI( url_b5 );
			desktop.browse( uri );

		// 例外処理
		} catch( Exception e ){
			e.printStackTrace();
		}
		// ボタンをクリックされたら window を閉じる
		System.exit(1);
	}
}

class Button_6 implements ActionListener{
	// field
	String window_Name;	// window の名前データ
	JFrame frame_Sub;
	JPanel panel_Sub;

	JLabel text2;
	JLabel text_err;
	JTextField field_Url;		// URL入力欄
	JButton btn_Url_Ok;			// 決定ボタン
	Desktop desktop = Desktop.getDesktop();

	// method
	public Button_6(){
		// window の名前を決める
		this.window_Name = "URL入力";

		// フレームを生成
		frame_Sub = new JFrame( window_Name );
		frame_Sub.setLocation( 450, 300 );
		frame_Sub.setSize( 360, 128 );

		// サイズを固定する処理
		frame_Sub.setResizable(false);

		// パネル,ボタンの類を生成
			// パネル
			panel_Sub = new JPanel();

			// テキスト
			text2 = new JLabel("アクセスしたいURLを入力してください");
			text_err = new JLabel("");

			// 入力欄
			field_Url = new JTextField("http://", 20 );

			// ボタン
				// btn_Url_Ok
				btn_Url_Ok = new JButton("OK");
				btn_Url_Ok.addActionListener(this);
				btn_Url_Ok.setActionCommand("ok");

		// 載せる
			// panel_Sub に field を載せる
			panel_Sub.add( text2 );
			panel_Sub.add( field_Url );
			panel_Sub.add( btn_Url_Ok );
			panel_Sub.add( text_err );

			// window に panel_Sub を載せる
			Container con = frame_Sub.getContentPane();
			con.setLayout( new GridLayout( 1, 1 ) );
			con.add( panel_Sub );

		// window に表示
		frame_Sub.setVisible(true);
	}

	public void actionPerformed( ActionEvent ae ){
		// コマンドを調べる
		String ac_Cmd = ae.getActionCommand();

		// ボタンがクリックされた時の処理
		if( ac_Cmd.equals("ok") ){
			// 入力されたURLを変数として保存する
			String result_Url = field_Url.getText();

			try{
				URI uri = new URI( result_Url );
				desktop.browse( uri );

				// ボタンをクリックされたら window を閉じる
				System.exit(1);

			// 例外処理
			} catch( Exception e ){
				text_err.setText("エラーです");
				field_Url.setText("http://");
			}
		}
	}
}