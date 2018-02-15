import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		/* �Q�[������ */
		System.out.println("�悤����!");

		/* �L�����N�^�[�쐬 */
		initCharacter();
	}

	/* �L�����N�^�[�쐬 */
	private static void initCharacter() {
		
		/* �E�� ���� */
		Human player = null;
		System.out.print("���Ȃ��̐E�Ƃ͉��ł����H\n" + "1.���E\n" + "2.���m\n" + "3.���@�g��\n>");
		int occupation = inputNum();
		/* ��O�̒l����� */
		while(occupation!=1&&occupation!=2&&occupation!=3) {
			System.out.println("�u1�i���E�j�v���u2�i���m�j�v�u3�i���@�g���j�v�œ����Ă�");
			System.out.print("���Ȃ��̐E�Ƃ͉��ł����H\n" + "1.���E\n" + "2.���m\n" + "3.���@�g��\n>");
			occupation = inputNum();
		}
		/* �E�Ƃ��Ƃɏ����ݒ� */
		switch (occupation) {
		case 1:
			System.out.println("���E�ł��ˁB");
			Human player_human = new Human();
			player = player_human;
			break;
		case 2:
			System.out.println("���m�ł��ˁB");
			Knight player_knight = new Knight();
			player = player_knight;
			break;
		case 3:
			System.out.println("���@�g���ł��ˁB");
			Wizard player_wizard = new Wizard();
			player = player_wizard;
			break;
		}

		/* ���O ���� */
		System.out.println("���Ȃ��̖��O�������Ă�������!");
		String name = inputString();
		/* ���O�̐ݒ� */
		player.SetName(name);

		/* ���� ���� */
		System.out.println("���Ȃ��̐��ʂ������Ă�������!\n" + "1.�j\n" + "2.��\n");
		int gender = inputNum();
		/* ��O�̒l����� */
		while (gender!=1&&gender!=2) {
			System.out.println("�u1�i�j�j�v���u2�i���j�v�œ����Ă�");
			System.out.println("���Ȃ��̐��ʂ������Ă�������!\n" + "1.�j\n" + "2.��\n");
			gender = inputNum();
		}
		/* ���ʂ̐ݒ� */
		player.setGender(gender-1);

		/* �X�e�[�^�X�̏󋵏Љ� */
		System.out.println("***���Ȃ��̃L�����N�^�[���ł�����������!***");
		player.printInfo();
	}

	/* ���l���̓��\�b�h */
	/* �Ԓl: ���͂��ꂽ���l */
	private static int inputNum() {

		String str = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = input.readLine();
			/* �����łȂ���΍ēx���� */
			while (!isNumber(str)) {
				System.out.print("���������ĂˁB\n>");
				str = input.readLine();
			}
			/* �G���[�n���h�����O */
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(str);
	}

	/* ���O���̓��\�b�h */
	/* �Ԓl: ���͂��ꂽ���O */
	private static String inputString() {

		String str = null;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = input.readLine();
			/* �G���[�n���h�����O */
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}

	/* ���l���胁�\�b�h */
	/* ���� val: ������������镶���� */
	/* �Ԓl: ���l�ł��� True / ���l�łȂ� False */
	private static boolean isNumber(String val) {
		try {
			Integer.parseInt(val);
			return true;
		} catch (NumberFormatException nfex) {
			return false;
		}
	}
}