package chap02;

//구성 요소와 자료형이 int형인 배열(구성 요소수는 5: new에 의해 본체를 생성)
public class chap02_IntArray {

	public static void main(String[] args) {
		int[] a = new int[5]; //배열 선언
		 a[1] = 37;
		 a[2] = 51;
		 a[4] = a[1] * 2;
		 
		 for(int i = 0; i < a.length; i++) {
			 System.out.println("a[" + i + "] = " + a[i]);
		 }
	}

}
