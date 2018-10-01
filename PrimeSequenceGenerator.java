import java.util.Arrays;

public class PrimeSequenceGenerator implements IGeneratorStrategy {

	@Override
	public int[] make(int count, int start) {
		boolean[] stroke = new boolean[count + 1];
		Arrays.fill(stroke, true);
		int count_primes = count;
		for (int p = 2; p * p < count; ++p) {
			if (stroke[p]){
				for (int i = p * 2; i <= count; i += p)	{
					if (stroke[i] == true)
						count_primes-=1;
					stroke[i] = false;
				}
			}
		}
		
		int[] result = new int[count_primes + 2];
		int last_index = 0;
		for (int i = 0; i < stroke.length; ++i){
			if (stroke[i]){
				
				result[last_index++] = i;
			}
		}
		return result;
	}

}
