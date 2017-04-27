package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.string.isPalindromeDemo;

public class isPalindromeDemoTest {
	private isPalindromeDemo isPalindromeDemo;

	@Before
	public void setUp() throws Exception {
		isPalindromeDemo=new isPalindromeDemo();
	}

	@Test
	public void testIsPalindrome() {
		boolean actualValue=isPalindromeDemo.isPalindrome("madam1");
		assertFalse(actualValue);
	}

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

}
