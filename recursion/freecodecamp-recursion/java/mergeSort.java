public class mergeSort{
	
	public static void myMergeSort(int[] data, int start, int end){
		if(start < end){
			int mid = (start + end) / 2;
			myMergeSort(data, start, mid);
			myMergeSort(data, mid + 1, end);
			merge(data, start, mid, end);
		}
	}

	public static void merge(int[] data, int start, int mid, int end){
		//build temp array to avoid modifying the original contents
		int[] temp = new int[end - start + 1];
		//tracking/counting variables
		int i = start;
		int j = mid + 1; 
		int k = 0;
		// while both sub-array have values, then try and merge them in sorted order	
		while (i <= mid && j <= end){
			if(data[i] <= data[j]){
				//checking if the value in the left subarray is less than the right subArray
				//k = [0] in the first turn
				temp[k++] = data[i++];
			}else{
				temp[k++] = data[j++];
			}

		}
		// add the rest of the values from the left sub-array into the result
		while (i <= mid){
			temp[k] = data[i];
			k++; i++;
		}
		// add the rest of the values from the right sub-array into the result	
		while(j <= end){
			temp[k] = data[j];
			k++; j++;
		}
		
		for (i = start; i <= end; i++){
			data[i] = temp[i - start];
		}
	}

	public static void main(String[] args){
		int[] data = new int[]{-5, 20, 10, 3, 2 ,0};
		myMergeSort(data, 0, data.length - 1);
		for (int i : data) {
			System.out.println(i);
		}
		System.out.println("Stop");
	}
}
