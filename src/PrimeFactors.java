import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
	 * @author michellelam
	 *
	 *
	 *Factorize a positive integer number into its prime factors.

	For example:
		 1 - [ ]
		 2 - [2]
		 3 - [3]
		 4 - [2,2]
		 5 - [5]
		 6 - [2,3]
		 7 - [7]
		 8 - [2,2,2]
		 9 - [3,3]
		12 - [2,2,3]
		15 - [3,5]

	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 */
public class PrimeFactors {

	@Test
	void factors() {
		assertEquals(factorsOf(1), Utility.listOf());
		
		
	}
	@Test
	void factors2() {
		assertEquals(factorsOf(2), Utility.listOf(2));
	}
	
	@Test
	void factors3() {
		assertEquals(factorsOf(3), Utility.listOf(3));
		
	}
	
	@Test
	void factors4() {
		assertEquals(factorsOf(4), Utility.listOf(2,2));
		
	}
	@Test
	void factors5() {
		assertEquals(factorsOf(5), Utility.listOf(5));
		
	}
	
	@Test
	void factors6() {
		assertEquals(factorsOf(6), Utility.listOf(2,3));
		
	}
	
	@Test
	void factors7() {
		assertEquals(factorsOf(7), Utility.listOf(7));
	
		
	}
	
	@Test
	void factors8() {
		assertEquals(factorsOf(8), Utility.listOf(2,2,2));
		
	}
	
	@Test
	void factors9() {
		assertEquals(factorsOf(9), Utility.listOf(3,3));
		
	}
	
	@Test
	void factors12() {
		assertEquals(factorsOf(12), Utility.listOf(2,3,2));
		
	}
	
	private List<Integer> factorsOf(int n){
		List<Integer> factors = new ArrayList<>();
		int divisor = 2; 
		while (n >1) {
			while (n% divisor ==0) {
				factors.add(divisor);
				n /= divisor;
			}
//			while (n%3 ==0) {
//				factors.add(3);
//				n /= 3;
			
			
		
		++divisor;		
		}
		return factors;
	}
	
	
}
