import java.util.Scanner;
public class createArray {
	public int[] Array() {
	Scanner reader = new Scanner(System.in);
	System.out.println("����������Ԫ�ظ���"); 
	int n = reader.nextInt();
	int[] Arr = new int[n];
	for(int i=0; i<n; i++) {
		int num = i+1;
		System.out.println("�������" + num + "������");
		Arr[i]=reader.nextInt();
	}
	return Arr;
	}
}
