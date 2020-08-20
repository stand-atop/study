package chap02;
import java.util.Scanner;

//�� �� ��� �� ���� ����
public class chap02_DayOfYear {

	//�� ���� �ϼ�
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, //���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} //����
	};
	
	//���� year���� �����ΰ� (����:1 / ���:0)
	static int isLeap(int year) {
		return(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1: 0;
	}
	
	//���� y�� m�� d���� �� �� ��� �� ���� ����
	static int dayOfYear(int y, int m, int d) {
		int days = d; //�ϼ�
		for(int i = 1; i < m; i++) { //1��~(m-1)���� �� ���� ����
			days += mdays[isLeap(y)][i-1];
		}
		return days;
	}
	
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		int retry ; //�ٽ� �õ�
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("�� : ");
			int year = stdIn.nextInt(); //��
			System.out.print("�� : ");
			int month = stdIn.nextInt(); //��
			System.out.print("�� : ");
			int day = stdIn.nextInt(); //��
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? (1.�� / 0.�ƴϿ�)\n");
			retry = stdIn.nextInt();
		}while(retry == 1);
	}

}