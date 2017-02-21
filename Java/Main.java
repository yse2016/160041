// Main.java

public class Main{
	public static void main(String[] args){
		//int numArgs = args.length;

		// 5-1 の method
		introduceOneself(args);
	}

	// 5-1 の method
	public static void introduceOneself(String[] args ){
		// field
		String name = "佐藤";	// 名前
		int age = 20;			// 年齢
		double height = 165.8;	// 身長
		char sx = '男';			// 性別

		/*
		// usage, 引数が4個じゃない時、使い方を表示
		if( numArgs != 4 ){
			System.out.println("usage: java Main 佐藤 20 168.2 男");
		}
		*/

		// method
		System.out.println("名前は " + name + " です");
		System.out.println("年齢は " + age + " 歳です" );
		System.out.println("身長は " + height + "cm です");
		System.out.println("性別は " + sx + " です");
	}
}