public class r_binarySearch{

	/*
	left - the index of the leftmost number of the array
	right - the index of the rightmost numer of the array (array.length() - 1)
	x - the number we are looking for 
	*/
	public static int binarySearch(int[] array, int left, int right, int x){
		//exception 
		if(left > right){
			return - 1;
		}
		int mid = (left + right) / 2;
		//return the number when found 
		if(x == array[mid]){
			return mid;
		}
		//if the number we are looking for is bigger than the mid number, go to the left
		if(x < array[mid]){
			return binarySearch(array, left, mid - 1, x);
		}
		//else, go to the right
		return binarySearch(array, mid+1, right, x);
		
	}	

	public static void main(String[] args){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(array,0 , array.length - 1, 9));
		System.out.println("Number in the position: " + array[8]);
	}
}
