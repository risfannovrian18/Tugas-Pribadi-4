public class HalfPyramidNumbersPattern {

	public static void halfPyramidNumbersPattern(int n) {
		int i, j;
		for (i = 1; i < n; i++)
		{
			for (j = 1; j<= i; j++)
			{

				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int k = 6;
		halfPyramidNumbersPattern (k);
	}
}