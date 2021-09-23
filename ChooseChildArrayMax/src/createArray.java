import java.util.Scanner;
public class createArray {
	public int[] Array() {
	Scanner reader = new Scanner(System.in);
	System.out.println("请输入数组元素个数"); 
	int n = reader.nextInt();
	int[] Arr = new int[n];
	for(int i=0; i<n; i++) {
		int num = i+1;
		System.out.println("请输入第" + num + "个数字");
		Arr[i]=reader.nextInt();
	}
	return Arr;
	}
}
