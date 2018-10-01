
public class StartExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGeneratorStrategy sg = new PrimeSequenceGenerator();// SequentialGeneratorStrategy();
		int[] result = sg.make(1000, 1);
		for (int item : result)
		{
			System.out.println(item + "\n");
		}
		
		System.out.println("Hello World");
	}

}
