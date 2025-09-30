package Week1.Day2;

public class Palindrome {

	public static void main(String[] args) {
	
		int inp = 123;
        int out = 0;
        int rem;
        int exp = inp;
        
        while (inp > 0) {
            rem = inp % 10;      
            out = out * 10 + rem; 
            inp = inp / 10;      
        }
        
        if (exp == out) {
            System.out.println(exp + " is a Palindrome.");
        } else {
            System.out.println(exp + " is not a Palindrome.");
        }
    }
	}


