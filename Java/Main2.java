// Main2.java

public class Main2{
	public static void main(String[] args) {
		System.out.println("IntroduceOneself");
		IntroduceOneself ios = new IntroduceOneself();
	}
}

class IntroduceOneself{
	// field
	String name = "佐藤";	// 名前
	String age = "20";		// 年齢
	double height = 165.8;	// 身長
	String sx = "男";		// 性別

	// method
	public IntroduceOneself(){
		System.out.println("名前は " + name + " です");
		System.out.println("年齢は " + age + " 歳です" );
		System.out.println("身長は " + height + "cm です");
		System.out.println("性別は " + sx + " です");
	}
}