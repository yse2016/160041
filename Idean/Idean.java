// Idean.java

/* 要件
	- ボタン2つ
	- アイデアを入力するテキストフィールド
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



class IdeanMan{
	// field
	JFrame frame;
	JTextField idea_Name1;
	JTextField idea_Name2;
	JPanel field_Panel;
	JButton btn1;
	JButton btn2;


	// method
	public IdeanMan(){
		// フレームを作る
		frame = new JFrame("Idean");
		frame.setLocation( 600, 300 );
		frame.setSize( 300, 300 );

		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// テキストフィールド,パネル,ボタンを作る

			// テキストフィールド( idea_Name1, idea_Name2 )
			idea_Name1 = new JTextField("",10);
			idea_Name2 = new JTextField("",10);

			// パネル
			field_Panel = new JPanel();

			// ボタン
				// btn1
				btn1 = new JButton("btn1");

				// btn2
				btn2 = new JButton("btn2");

		// 載せる

			// panel に field を載せる
			field_Panel.add( idea_Name1 );
			field_Panel.add( idea_Name2 );
			field_Panel.add( btn1 );
			field_Panel.add( btn2 );

			// window に panel を載せる
			Container con =frame.getContentPane();
			con.setLayout( new GridLayout( 2, 1 ) );
			con.add( field_Panel );

		// window に表示
		frame.setVisible(true);

	}
}