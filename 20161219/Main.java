import java.awt.FlowLayout;
import javax.swing.*;

public class Main{
	public static void main(String[] args) {

		// 0. データを作る
		JFrame  frame   = new JFrame();
		JLabel  label   = new JLabel("Hello World!!");
		JButton button  = new JButton("押してね");

		// 1. GUIを作る
		frame.getContentPane().setLayout( new FlowLayout() );
		frame.getContentPane().add( button );
		frame.getContentPane().add( label );

		// 2. close設定( 閉じたら終了する )
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// 3. windowサイズを指定
		frame.setSize( 300, 100 );

		// 4. windowを見えるようにする
		frame.setVisible( true );
	}
}