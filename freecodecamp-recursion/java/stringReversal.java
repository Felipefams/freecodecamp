public class stringReversal{
	public static String reverseString(String input){
		if(input.equals("")){
			return "";
		}
		return reverseString(input.substring(1)) + input.charAt(0);
	}
	public static void main(String[] args){
		String input = "first";
		System.out.println(reverseString(input));
	}
}
