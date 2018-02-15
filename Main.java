import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		/* ゲーム導入 */
		System.out.println("ようこそ!");

		/* キャラクター作成 */
		initCharacter();
	}

	/* キャラクター作成 */
	private static void initCharacter() {
		
		/* 職業 決定 */
		Human player = null;
		System.out.print("あなたの職業は何ですか？\n" + "1.無職\n" + "2.剣士\n" + "3.魔法使い\n>");
		int occupation = inputNum();
		/* 例外の値を入力 */
		while(occupation!=1&&occupation!=2&&occupation!=3) {
			System.out.println("「1（無職）」か「2（剣士）」「3（魔法使い）」で答えてね");
			System.out.print("あなたの職業は何ですか？\n" + "1.無職\n" + "2.剣士\n" + "3.魔法使い\n>");
			occupation = inputNum();
		}
		/* 職業ごとに初期設定 */
		switch (occupation) {
		case 1:
			System.out.println("無職ですね。");
			Human player_human = new Human();
			player = player_human;
			break;
		case 2:
			System.out.println("剣士ですね。");
			Knight player_knight = new Knight();
			player = player_knight;
			break;
		case 3:
			System.out.println("魔法使いですね。");
			Wizard player_wizard = new Wizard();
			player = player_wizard;
			break;
		}

		/* 名前 決定 */
		System.out.println("あなたの名前を教えてください!");
		String name = inputString();
		/* 名前の設定 */
		player.SetName(name);

		/* 性別 決定 */
		System.out.println("あなたの性別を教えてください!\n" + "1.男\n" + "2.女\n");
		int gender = inputNum();
		/* 例外の値を入力 */
		while (gender!=1&&gender!=2) {
			System.out.println("「1（男）」か「2（女）」で答えてね");
			System.out.println("あなたの性別を教えてください!\n" + "1.男\n" + "2.女\n");
			gender = inputNum();
		}
		/* 性別の設定 */
		player.setGender(gender-1);

		/* ステータスの状況紹介 */
		System.out.println("***あなたのキャラクターができあがったよ!***");
		player.printInfo();
	}

	/* 数値入力メソッド */
	/* 返値: 入力された数値 */
	private static int inputNum() {

		String str = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = input.readLine();
			/* 数字でなければ再度入力 */
			while (!isNumber(str)) {
				System.out.print("数字を入れてね。\n>");
				str = input.readLine();
			}
			/* エラーハンドリング */
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(str);
	}

	/* 名前入力メソッド */
	/* 返値: 入力された名前 */
	private static String inputString() {

		String str = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = input.readLine();
			/* エラーハンドリング */
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	/* 数値判定メソッド */
	/* 引数 val: 数字判定をする文字列 */
	/* 返値: 数値である True / 数値でない False */
	private static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}