package Week1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int k =10; 
		boolean isprime = true;
		if( k <=1 )
		{ isprime = false;
		} 
		
		for (int i = 2; i < k; i++) 
		{ if (k % i == 0)
		{ isprime = false; break;
		} 
		} if (isprime) 
		{ System.out.println(k + " is a Prime Number.");
		} else
		{ System.out.println(k + " is Not a Prime Number.");
		} 
		}

	
	}


