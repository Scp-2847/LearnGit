
public class printPrimeNum {
	public static void main(String[] args) {
		
			int num=0;
			int n;
			int i;
			int flag=0;
			//最费时的函数，暴力遍历，可以用 “埃氏筛选法” 进行优化
			for(n=1;n<=20000;n++)
			{
				flag=0;
				for(i=2;i<=Math.sqrt(n);i++)
				{
					if(n%i==0)
						{
							flag=1;
							break;
						}
				}
				if(flag==0) {
					System.out.printf("%d ",n);
					num++;
					if(num%5==0)
						System.out.printf("\n");
				}
			}
	}
}
