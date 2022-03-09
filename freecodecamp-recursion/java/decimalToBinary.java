public class decimalToBinary{
	
	public static String findBinary(int decimal, String result){
		if(decimal == 0){
			return result;
		}
		result = decimal % 2 + result; 
		return findBinary(decimal/2, result);
	}

	public static void main(String[] args){
		int decimal = 10;
		System.out.println(findBinary(decimal, ""));
	}
	
}
