//Class Task2
//  main()
//      num start = 30
//      num end = 0
//      num i = start
//      for (i = start; i >= end; i = i - 1)
//          output i
//      endfor
//  return
//EndClass
public class Task2 {
	public static void main(String[] args)
    {
		// Count down from 30 to 0 using a for-loop
		double start = 30.0;
		double end = 0.0;
		double i = start;

		for (i = start; i >= end; i = i - 1)
        {
			System.out.print((int) i + " ");
		}
	}
}
