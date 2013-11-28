package com.jnunez2.domain;

public class TestIsSubString {
    
    /*
     * Write a isSubString method that searches for a specific string within
     * another string; the method must return true if the former exists in the
     * latter string. Otherwise, the method return false.
     */
        
    
    public static void main(String[] args) {
        String text = "The cat in the hat.";
        
        System.out.println("isSubString(\"cat\", \"The cat in the hat.\") "
                + isSubString("cat", text));
        
        System.out.println("isSubString(\"bat\", \"The cat in the hat.\") "
                + isSubString("bat", text));
        
        System.out.println("isSubString(\"The\", \"The cat in the hat.\") "
                + isSubString("The", text));
        
        System.out.println("isSubString(\"hat.\", \"The cat in the hat.\") "
                + isSubString("hat.", text));
        
    }
    
    public static boolean isSubString(String txt1,String txt2) {
    	for (int i = 0; i < txt2.length(); i++) {
    		if (txt2.charAt(i) == txt1.charAt(0)) {
    			for (int j = 0; j < txt1.length(); j++ ) {
    				System.out.println("wut");
    				return true;
    			}
    		}
    	}
    	return false;
    }
}
