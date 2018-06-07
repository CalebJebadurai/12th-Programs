

public class PascalsTriangle 
{
        /**
         * The constructor tests the instance method computePascals.
         */
        public PascalsTriangle()
        {
 		// declare the dimension of the 2D array
 		int arrayDimension = 6;
 
                int[][] pascalTest = computePascals( arrayDimension );
 
 		// print out the contents of the test pascal's triangle
 		print2DArray(pascalTest);
        }
 
        /** 
          * Creates first n rows of Pascal's triangle and returns the
          * 2D array holding the result.
          **/ 
        public int[][] computePascals( int n )
        {
 		int[][] pascal;  // declare the pascal's triangle as multi-dimensional array
		pascal = new int[n][];
 
 		// create rows for the triangle (but no values)
 		for (int i = 0; i < pascal.length; i++){
			pascal[i] = new int[i+1];
 		}
 
		// the first and last columns of each row of pascal's triangle is always a 1
                /* WRITE YOUR CODE TO FILL OUT THESE VALUES */
 
 		// calculate the interior values of pascal's triangle
		/* WRITE YOUR CODE HERE */
 
                // return the result
                return pascal;
        }
 
        /**
         * Prints the contents of the given 2D array of ints.
         */
 	public void print2DArray( int[][] array )
 	{
 	  /* WRITE CODE HERE TO PRINT OUT THE VALUE OF THE MULTI-DIMENSIONAL ARRAY 'array' */
 	} // end print2DArray
 
 
        /**
         * Our main method -- this will be called when this class is
         * run from the command line.
         */
 	public static void main(String [] args) {
 
		new PascalsTriangle(); // create an instance of this class to test the code
 	}
 }

