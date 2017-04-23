package cn.serge;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
		assertEquals("", new User("", null, null, null).getUserId());
	}

}
