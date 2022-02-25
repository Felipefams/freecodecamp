public class r_palindrome{
	public static boolean isPalindrome(String s){
	//caso base/condicao de parada
		if(input.length() == 0 || input.length() ==1){
			return true;
		}
	//motor da recursao	
		if(input.charAt(0) == input.charAt(input.lenght() - 1)){
			return isPalindrome(input.substring(1, input.length() - 1));
		}	
		return false;
	}
	public static void main(String[] args){
	//pegar o input do outro problema do palindromo
	}
}
