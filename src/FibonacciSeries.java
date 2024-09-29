import java.util.LinkedHashMap;
import java.util.Map;

public class FibonacciSeries {

private static Map<Integer, Integer> memo = new LinkedHashMap<>();
	
	public static void main(String arg[]) {
		System.out.println("Welcome");
		
		int num = 8;
		
		System.out.println("\nFibonacci Series of [ "+num+" ] "+ fib(num));
		System.out.println(fibRecursive(num));
		System.out.println(memo);
	}

	private static int fibRecursive(int num) {
		if(num <= 1) {
			return num;
		}
		
		if (memo.containsKey(num)) {
            return memo.get(num);
        }
		
		int result =  fibRecursive(num -1) + fibRecursive(num -2);
		memo.put(num, result);
		return result;
	}

	private static int fib(int num) {
		int first = 0;
		int second = 1;
		//System.out.print(first+ " " + second + " ");
		for(int index = 2; index <= num; index++) {
			int next = first + second;
			System.out.print(next+ " ");
			 
			first = second;
			second = next;
			
		}
		
		return second;
	}

}
