public class r_palindrome{
	public static boolean isPalindrome(String s){
	//caso base/condicao de parada
		if(s.length() == 0 || s.length() ==1){
			return true;
		}
	//motor da recursao	
		if(s.charAt(0) == s.charAt(s.length() - 1)){
			return isPalindrome(s.substring(1, s.length() - 1));
		}	
		return false;
	}
	public static void main(String[] args){
	//pegar o input do outro problema do palindromo
	}
}
