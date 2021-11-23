import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NameExceptionTest {

	private ACCOUNTS objtest;
	@Before
	public void object()
	{
		objtest=new ACCOUNTS();
	}
	@Test(expected=IllegalArgumentException.class)
	public void testNullname()
	{
		objtest.setname(null);
	}

	@Test(expected=IllegalArgumentException.class)
		public void testNameshort()
		{
			objtest.setname("K");
		}
	@Test(expected=IllegalArgumentException.class)
	public void testNameLong()
	{
		objtest.setname("Muhammad Abu Bakar Hussain Khalid raza");
	}

}                                    