//Class Task4
//  main()
//      num start = 10
//      num end = 0
//      num i = start
//      for (i = start; i >= end; i = i - 2)
//          output i
//      endfor
//  return
//EndClass
public class Task4
{
	public static void main(String[] args)
    {
		// Count down from 10 to 0 by 2 using a for-loop
		double start = 10.0;
		double end = 0.0;
		double i = start;

		for (i = start; i >= end; i = i - 2)
        {
			System.out.print((int) i + " ");
		}
	}
}
