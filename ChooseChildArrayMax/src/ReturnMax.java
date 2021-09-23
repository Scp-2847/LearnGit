public class ReturnMax {
	public int returnMax() {
		int sum = 0;
		ChooseMax ChooseMax = new ChooseMax();
		createArray Arr = new createArray();
		int arr[] = new int[100];
		
		arr=Arr.Array();
		
		int N = arr.length;
		int max = arr[0];
		
		for(int i=0; i<N; i++) {
			sum = arr[i];
			for(int j = i+1; j<N; j++) {
				sum = sum + arr[j];
				if(sum > max) {
					max = sum;
				}
			}
		}
	return max;
	}
	
}
