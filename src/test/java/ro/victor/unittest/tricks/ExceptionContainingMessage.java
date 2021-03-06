package ro.victor.unittest.tricks;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionContainingMessage {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Test
	public void test1() {
		expectedException.expectMessage("a");
		throwMe();
		
	}
	
	
	public void throwMe() {
		if (true) throw new IllegalArgumentException("a");
		if (true) throw new IllegalArgumentException("b");
		if (true) throw new IllegalArgumentException("c");
		if (true) throw new IllegalArgumentException("c");
	}
}
