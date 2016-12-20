// WindowTest.java

import java.awt.*;
import javax.swing.*;

public class WindowTest{
	public static void main(String[] args) {

		// 変数を作る
		JFrame frame   = new JFrame();
		JPanel panel = new JPanel();
		JLabel label   = new JLabel("Hello!");
		JButton button = new JButton("OK");

		// windowの設定をする

			// windowのサイズ,場所の指定
			frame.setBounds( 1920/3, 1080/5, 512, 512 );

			// windowが "x" クリックでプログラムが終了するようにする
			frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

			// レイアウトの設定(貼り付けの設定)
			frame.setLayout( new FlowLayout() );

		// ラベルとボタンを貼り付ける
		Container ctnr = frame.getContentPane();
		ctnr.add( label );
		ctnr.add( button );

		// windowを表示する
		frame.setVisible(true);

	}
}