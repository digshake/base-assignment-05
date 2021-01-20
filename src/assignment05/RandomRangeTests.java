package assignment05;

import org.junit.jupiter.api.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Methods that test the filledArray() method
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)


class RandomRangeTests {

	/**
	 * A Generic test case 
	 * 
	 * This will repeatedly request random numbers in the given range. 
	 * It will track the sum, min, and max. 
	 * When done, it will confirm that that the min, max, and average are acceptably close
	 * to what's expected for a normal distribution.  ("Acceptable close" is based on  
	 * the epsilon parameter)
	 * 
	 * @param start The "Start" of the range to test (passed to randomInRange())
 	 * @param stop The "stop" of the range to test (passed to randomInRange())
	 * @param runs The number of runs to do (samples)
	 * @param epsilon The maximum error allowed for the max/min/averages found
	 */
	public void test(final double start, final double stop, final int runs, final double epsilon) {
    	double max = Double.NEGATIVE_INFINITY;
    	double min = Double.POSITIVE_INFINITY;
    	double sum = 0;
    	double expectedMean = (stop+start)/2;
    	// Generate a lot of random numbers
    	for(int i=0;i<runs;i++) {
    		double testCase = AnimatedScene.randomInRange(start, stop);
    		max = Math.max(max, testCase);
    		min = Math.min(min, testCase);
    		sum += testCase;
    	}
    	// Check that the max is close to the stop value
    	String baseMessage = "After many calls to randomInRange("+start+","+stop+"): ";
    	assertEquals(baseMessage + "No values were near the stop", stop, max, epsilon);
    	assertEquals(baseMessage + "No values were near the start",start, min, epsilon);
    	double actualMean = sum/runs;
    	assertEquals(baseMessage + "The expected mean was unexpected.",expectedMean, actualMean, epsilon);
	}
    /**
     * Test the range (0,1)
     */
    @Test
    public void testRange0to1() {
    	//   start   stop    runs    epsilon
    	test(    0,     1, 20000,     0.01);
    }


    /**
     * Test the range (0,100)
     */
    @Test
    public void testRange0to100() {
    	//   start   stop    runs    epsilon
    	test(    0,   100, 20000,       1.0);
    }

    /**
     * Test the range (-100,100)
     */
    @Test
    public void testRangeMinus100to100() {
    	//   start   stop    runs    epsilon
    	test( -100,   100, 20000,       2.0);
    }

    /**
     * Test the range (100,300)
     */
    @Test
    public void testRange100to300() {
    	//   start   stop    runs    epsilon
    	test(  100,   300, 20000,       2.0);
    }

    /**
     * Test the range (-300,-100)
     */
    @Test
    public void testRangeMinus300toMinus100() {
    	//   start   stop    runs    epsilon
    	test( -300,  -100, 20000,       2.0);
    }    
}
