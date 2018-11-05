public class HelloWorld{
	public static void main(String... args){
		//メッセージを表示します
		System.out.println("Hello Java World");
		/*
		このような記号を囲めば
		複数行のコメントを記載することもできます
		*/
		//宣言文・定義文・演算子
		int numberA;
		int numberB = 20;
		numberA = 10;
		int numberC = numberA + numberB;
		//インクリメント(++)とデクリメント(--)は記述する位置によって挙動を帰る(前置演算/後置演算)
		System.out.println(numberA++ + --numberB - numberC); //-1を出力
		boolean result = numberA > numberB;
		System.out.println(result);
		//条件演算子
		int numberD = numberA > 0 ? 1: -1;
		System.out.println(numberD);
		//論理演算子
		boolean conditionA = true;
		boolean conditionB =false;
		boolean result1 = conditionA || conditionB;
		System.out.println(result1);

		
	}
}

