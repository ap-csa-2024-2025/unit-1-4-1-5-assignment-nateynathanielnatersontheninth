public class Problem0
{
  public static void main(String[] args)
  {
    int integer = 3.0;
    double doubler = 3;
  }
}

Is it possible to store a double into an int?  Is it possible to store an int into a double?  Explain.
It is not possible to store a double into an int because ti results in possible lossy conversion going from double to int. 