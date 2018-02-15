
public class Human {

	/* インスタンス変数 */
	int hp;
	int level;
	int status;
	int mp;
	String name;
	int gender;
	int atack_power;
	int defense_power;

	/* 定数 */
	public static final String status_name[] = { "絶不調", "悪い", "ふつう", "良い", "絶好調" };
	public static final String gender_name[] = { "男","女" };
	
	/* コンストラクタ */
	/* 初期値の設定 */
	public Human() {
		hp = 5;
		level = 1;
		status = 3;
		mp = 0;
		atack_power = 5;
		defense_power = 5;
	}

	/* ステータス情報を出力する */
	void printInfo() {
		System.out.println(this.name + "さん（" + getGender() + "）\n"+"職業:なし");
		System.out.println( "レベル	:" + level + "\n" + "HP	:" + hp + "\n" + "MP	:" + mp + "\n"
				+ "調子	:" + getStatus() + "\n"
				+ "攻撃力	:" + atack_power + "\n"
				+ "防御力	:" + defense_power + "\n");
	}

	/* 元気度（調子）の情報を文字列にする */
	/* 返値: 調子の情報（文字列） */
	String getStatus() {
		return status_name[status];
	}

	/* 性別の情報を文字列にする */
	/* 返値: 性別の情報（文字列） */
	String getGender() {
		return gender_name[gender];
	}

	/* 性別を設定をする */
	/* 引数: 性別（0:男・1:女） */
	void setGender(int gender) {
		this.gender = gender;

		/* 男なら攻撃力を５追加 */
		if (gender == 0) {
			atack_power += 5;
		}
	}

	/* 名前を設定をする */
	/* 引数: 名前 */
	void SetName(String name) {
		this.name = name;
	}
	
	/* 攻撃メソッド作るドン */
}

class Knight extends Human {

	/* コンストラクタ */
	/* 初期値の設定追加 */
	public Knight() {
		hp += 5;
	}
	/* ステータス情報を出力する */
	void printInfo() {
		System.out.println(this.name + "さん（" + getGender() + "）\n"+"職業:剣士");
		System.out.println( "レベル	:" + level + "\n" + "HP	:" + hp + "\n" + "MP	:" + mp + "\n"
				+ "調子	:" + getStatus() + "\n"
				+ "攻撃力	:" + atack_power + "\n"
				+ "防御力	:" + defense_power + "\n");
	}
	
	/* 攻撃メソッド作るドン */
}

class Wizard extends Human {

	/* コンストラクタ */
	/* 初期値の設定追加 */
	public Wizard() {
		mp += 10;
	}

	/* ステータス情報を出力する */
	void PrintInfo() {
		System.out.println(this.name + "さん（" + getGender() + "）\n"+"職業:なし");
		System.out.println( "レベル	:" + level + "\n" + "HP	:" + hp + "\n" + "MP	:" + mp + "\n"
				+ "調子	:" + getStatus() + "\n"
				+ "攻撃力	:" + atack_power + "\n"
				+ "防御力	:" + defense_power + "\n");
	}
	
	/* 攻撃メソッド作るドン */
}