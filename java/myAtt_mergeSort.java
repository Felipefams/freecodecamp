//all wrong
public class myAtt_mergeSort{
	/*
	first attempt at mergesort before watching the video
	*/
	public static int[] mergeSort(int[] array, int left, int right){	
		int mid = (left + right)/2;
		if(array.length == 2){
			if(array[0] > array[1]){
			//	swap
				int tmp = array[0];
				array[0] = array[1];
				array[1] = tmp;
			}
			int[] newArray = new int[2];
			for(int i = 0; i < 2; i++){
				newArray[i] = array[i];
			}
			return mergeSort(newArray, left, right);
		}
		if(array.length > 2){
		//	here i should find a way to concatenate the two arrays
			return mergeSort(array, left, mid - 1) + mergeSort(array, mid + 1, right);	
		}
		return array;		
	} 
	public static void main(String[] args){
		int[] array = {4,1,3,2,0,-1,7,10,9,20};	
		System.out.println(mergeSort(array, 0, 9));
	}
}

