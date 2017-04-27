package com.string;

public class isPalindromeDemo {
	
	public boolean isPalindrome(String str){
		
		if(str==null) 
			return false;
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		return sb.toString().equals(str);
	}

	public static void main(String[] args) {
		
		System.out.println(new isPalindromeDemo().isPalindrome("madam"));
		// TODO Auto-generated method stub

	}

}
