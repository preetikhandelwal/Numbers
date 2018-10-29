package devops.numbers;

import org.junit.*;

import devops.Test;
import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}

	@Test
	public void numberOneReturnsOne() {
		Assert.assertEquals( "One", "1", numberWords.toWords( 1 ) ) ;
	}
	
	@Test
	public void numberTwoReturnsTwo() {
		Assert.assertEquals( "Two", "2", numberWords.toWords( 2 ) ) ;
	}
		
}
