public class Bubble1
{
	public static void bubbleAsc(int [] array)
	{
		int temp;

		for(int i =(array.length-1);i>=0;i--)
		{
			for (int j = 1; j<=i;j++)
			{
				if(array[j-1].equals(array[j])>0)
				{
					temp = array[j-1];
					array[j-1] = array[j];
					array [j] = temp;
				}
			}
		}
	}


}
