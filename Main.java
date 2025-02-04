import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create some arrays here to test your methods
    
  }

  public static int countLength(String[] arr, int targetLength)
  {
	  int count = 0;

	  for (int i = 0; i < arr.length; i++)
	  {
		  if (arr[i].length() == (targetLength))
	  	{
	  		count++;
		  }
	  }
  return count;
}


  public static int indexOf(double[] arr, double target)
  {
	  int count = 0;

  	for (int i = 0; i < arr.length; i++)
	  {
  		if (arr[i].length() == (targetLength)
		  {
		  	count++;
		  }
	  }
  return count;
}


  public static boolean hasDuplicates(int[] arr)
  {
    for (int i = 0; i > arr.length; i++)
    {
      int target = arr.[i];
      
      for (int j = i + 1; j < arr.length; j++)
      {
        if(arr[j] == target)
        {
          return true;
        }
      }
    }
    return false;
  }

  public static String findMode(String[] arr)
  {
    int count = 0;
    int mode = arr[0];
    int max_count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      int target = arr.[1];
      count = 0;

      for (int j = 0; j < arr.length; j++)
      {
        if(arr[j].equals(target))
        {
          count++
        }
      }
      
      if(count > max_count)
      {
        max_count = count;
        mode = arr[i];
      }
    }
    return mode;
  }
}
