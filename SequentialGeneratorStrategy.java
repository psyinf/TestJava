
public class SequentialGeneratorStrategy implements IGeneratorStrategy
{
	@Override
	public int[] make(int count, int start) {
		int[] result = new int[count];
		for (int i = 0; i < count; ++i)
		{
			result[i] = i + start;
		}
		return result;
	}
}
