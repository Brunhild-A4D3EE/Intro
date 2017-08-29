public class Intro {
	//main
	public static void main(String[] args){
		//Iterator<Integer> covator = new Iterator<Integer>();
		//Integer nummy = Integer;
		//Iterater niter = nummy;
		System.out.println("test for Q1: " + ret());
		System.out.println("test for Q2: " + logic(true, true, true));
		System.out.print("test for Q3.1: ");
		tower(5);
		System.out.println("test for Q3.2: ");
		stars(6);
		System.out.println("test for Q4: " + coins(44));
	}
	
	//1. Write a method, called ret, 
	//that takes in no arguments and returns 17
	public static int ret () {
		return 17;
	}
	
	//2. Write a method, takes in 3 parameters, 
	//return logical and of the parameters together
	//(find and return value of a and b and c)
	public static boolean logic(boolean a, boolean b, boolean c){
		return a || b || c;
	}
	
	//3.1 This problem involves printing a left-justified triangle
	//using the * character. For example, if the function gets
	//the input 5, the output would be
	public static void tower(int k){
		for (int j = 0; j <= k; j++){
			for (int g = 0; g < j; g++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//3.2 Write a function that takes in a number and return a
	//string of the multiline triangle of stars. Make sure that
	//you use \n as the character that represents a ne-line.
	public static void stars(int n){
		for (int j = 0; j <= n; j++){
			for (int g = n; g > j; g--){
				System.out.print(" ");
			}
			System.out.print("*");
			for (int g = 0; g < 2*j; g++){
				System.out.print("*");
			}
			System.out.println();			
		}
	}
	
	//4. Jim has a large supply of coins that he likes to maintain.
	//However, when his friend asked him to exchange coins, he agreed.
	//His friend told him that he wanted to exchange for 5 cent and 2
	//cent coins(the 2 cent coin exists when Jim is). Jim wants to 
	//exchange as few coins as possible. so return the minimun number
	//of 5c and 2c coins Jim need to use. If the exchange isn't possible, 
	//retrun -1. 
	public static int coins(int n){
		int nOf5c = n / 5;
		int nOf2c = (n - nOf5c*5)/2;
		int check = (n - nOf5c*5 - nOf2c*2);
		if (check == 0) {
			return nOf5c + nOf2c;
		} else if (((n % 2) == 0)&& check != 0) {
			return n/2;
		} else {
			return -1;
		}
	}
}