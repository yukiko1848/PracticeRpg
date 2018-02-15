
public class Human {

	/* �C���X�^���X�ϐ� */
	int hp;
	int level;
	int status;
	int mp;
	String name;
	int gender;
	int atack_power;
	int defense_power;

	/* �萔 */
	public static final String status_name[] = { "��s��", "����", "�ӂ�", "�ǂ�", "��D��" };
	public static final String gender_name[] = { "�j","��" };
	
	/* �R���X�g���N�^ */
	/* �����l�̐ݒ� */
	public Human() {
		hp = 5;
		level = 1;
		status = 3;
		mp = 0;
		atack_power = 5;
		defense_power = 5;
	}

	/* �X�e�[�^�X�����o�͂��� */
	void printInfo() {
		System.out.println(this.name + "����i" + getGender() + "�j\n"+"�E��:�Ȃ�");
		System.out.println( "���x��	:" + level + "\n" + "HP	:" + hp + "\n" + "MP	:" + mp + "\n"
				+ "���q	:" + getStatus() + "\n"
				+ "�U����	:" + atack_power + "\n"
				+ "�h���	:" + defense_power + "\n");
	}

	/* ���C�x�i���q�j�̏��𕶎���ɂ��� */
	/* �Ԓl: ���q�̏��i������j */
	String getStatus() {
		return status_name[status];
	}

	/* ���ʂ̏��𕶎���ɂ��� */
	/* �Ԓl: ���ʂ̏��i������j */
	String getGender() {
		return gender_name[gender];
	}

	/* ���ʂ�ݒ������ */
	/* ����: ���ʁi0:�j�E1:���j */
	void setGender(int gender) {
		this.gender = gender;

		/* �j�Ȃ�U���͂��T�ǉ� */
		if (gender == 0) {
			atack_power += 5;
		}
	}

	/* ���O��ݒ������ */
	/* ����: ���O */
	void SetName(String name) {
		this.name = name;
	}
	
	/* �U�����\�b�h���h�� */
}

class Knight extends Human {

	/* �R���X�g���N�^ */
	/* �����l�̐ݒ�ǉ� */
	public Knight() {
		hp += 5;
	}
	/* �X�e�[�^�X�����o�͂��� */
	void printInfo() {
		System.out.println(this.name + "����i" + getGender() + "�j\n"+"�E��:���m");
		System.out.println( "���x��	:" + level + "\n" + "HP	:" + hp + "\n" + "MP	:" + mp + "\n"
				+ "���q	:" + getStatus() + "\n"
				+ "�U����	:" + atack_power + "\n"
				+ "�h���	:" + defense_power + "\n");
	}
	
	/* �U�����\�b�h���h�� */
}

class Wizard extends Human {

	/* �R���X�g���N�^ */
	/* �����l�̐ݒ�ǉ� */
	public Wizard() {
		mp += 10;
	}

	/* �X�e�[�^�X�����o�͂��� */
	void PrintInfo() {
		System.out.println(this.name + "����i" + getGender() + "�j\n"+"�E��:�Ȃ�");
		System.out.println( "���x��	:" + level + "\n" + "HP	:" + hp + "\n" + "MP	:" + mp + "\n"
				+ "���q	:" + getStatus() + "\n"
				+ "�U����	:" + atack_power + "\n"
				+ "�h���	:" + defense_power + "\n");
	}
	
	/* �U�����\�b�h���h�� */
}