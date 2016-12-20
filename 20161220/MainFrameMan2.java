// MainFrameMan2.java
// 入力欄を作る

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrameMan2{
	public static void main(String[] args) {

		// FrameMan クラスを呼び出す
		FrameMan2 fm2 = new FrameMan2();
	}
}



// ↓"ActionListener"を実装する(implements)
class FrameMan2 implements ActionListener{

	// 変数( field )
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JLabel label;
	JButton button;
	JTextField text_field;

	// 処理( method )
	// コンストラクタ: 呼び出し時に一度だけ実行される処理
	public FrameMan2(){

		System.out.println("Successed.");

		// windowを作る・設定する

			// window の名前
			frame = new JFrame("FrameMan2");

			// window の場所・サイズ
			frame.setBounds( 1920/3, 1080/5, 512, 320 );

			// windowが "x" クリックでプログラムが終了するようにする
			frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

			// レイアウトの設定(貼り付けの設定)
			frame.setLayout( new BorderLayout() );

		// パーツを作る
		panel1 = new JPanel();
		panel2 = new JPanel();
		label = new JLabel("Hello!");
		button = new JButton("OK");
		text_field = new JTextField(15);

		// ボタンに ActionListener をつける
		button.addActionListener(this);

		// パーツを載せる

			// パーツをwindow( JFrame )に乗せる
			frame.add( panel1 );

			// パーツをパネル( JPanel )に乗せる
			panel1.add( text_field );
			panel1.add( button );
			panel2.add( label );
			frame.add( panel1, BorderLayout.NORTH );
			frame.add( panel2, BorderLayout.CENTER );


		// windowを表示する
		frame.setVisible(true);
	} // コンストラクタの終わり

	// クリックに反応する処理
	public void actionPerformed( ActionEvent e ){
		String data = text_field.getText();
		label.setText( data );
	}
}