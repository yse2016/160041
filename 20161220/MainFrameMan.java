// MainFrameMan.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan{
	public static void main(String[] args) {

		// FrameMan クラスを呼び出す
		FrameMan fm = new FrameMan();
	}
}



// ↓"ActionListener"を実装する(implements)
class FrameMan implements ActionListener{

	// 変数( field )
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;

	// 処理( method )
	// コンストラクタ: 呼び出し時に一度だけ実行される処理
	public FrameMan(){

		System.out.println("Successed.");

		// windowを作る・設定する

			// window の名前
			frame = new JFrame("FrameMan");

			// window の場所・サイズ
			frame.setBounds( 1920/3, 1080/5, 512, 512 );

			// windowが "x" クリックでプログラムが終了するようにする
			frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

			// レイアウトの設定(貼り付けの設定)
			frame.setLayout( new FlowLayout() );

		// パーツを作る
		panel = new JPanel();
		label = new JLabel("Hello!");
		button = new JButton("OK");

		// ボタンに ActionListener をつける
		button.addActionListener(this);

		// パーツを載せる

			// パーツをwindow( JFrame )に乗せる
			frame.add( panel );

			// パーツをパネル( JPanel )に乗せる
			panel.add( label );
			panel.add( button );

		// windowを表示する
		frame.setVisible(true);
	} // コンストラクタの終わり

	// クリックに反応する処理
	public void actionPerformed( ActionEvent e ){
		label.setText("Aloha");
	}
}