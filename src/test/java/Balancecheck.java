import static org.junit.Assert.*;


import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Balancecheck {

	private ACCOUNTS objtest;
	@Before
	public void object()
	{
		objtest=new ACCOUNTS();
	}
	@Test
	public void test() {
	
		int EXPECTED=500;
		int acc=97;
		int val=objtest.checkbalance(acc);
		Assert.assertEquals(EXPECTED, val);
	//	fail("Not yet implemented");
	}
	@Test
	public void test1() {
	
		double expected=8.0;
		int acc=97;
		double val;
		Customer obj=new Customer();
		 val=obj.interest();
		 
		Assert.assertEquals(expected,val);
	}
	@Test
	public void test2() {
	
		double EXPECTED=0;
		int acc=97;
		double val=objtest.zakaat(acc);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test3() {
		
		boolean EXPECTED=true;
		int acc=97;
		boolean val=objtest.transferamount(acc,95,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test4() {
		
		int EXPECTED=550;
		int acc=97;
		int val=objtest.makedeposit(acc,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test5() {
		
		int EXPECTED=450;
		int acc=97;
		int val=objtest.swithdrawal(acc,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test6() {
		
		int EXPECTED=450;
		int acc=97;
		int val=objtest.cwithdrawal(acc,50);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test7() {
		
		boolean EXPECTED=true;
		int acc=97;
		boolean val=objtest.detail(acc);
		Assert.assertEquals(EXPECTED, val);
	}
	@Test
	public void test8() {
		
		int EXPECTED=1;
		int acc=97;
		int val=objtest.printstatement(acc,50);
		Assert.assertEquals(EXPECTED, val);
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
	
	@Test(expected=IllegalArgumentException.class)
	public void testphone()
	{
		objtest.setphn(null);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testphoneshort()
	{
		objtest.setphn("09007");
	}
	@Test(expected=IllegalArgumentException.class)
	public void testphonelomg()
	{
		objtest.setphn("0900786014568");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testacc()
	{
		objtest.setAccno(0);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testaccshort()
	{
		objtest.setAccno(1);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testacclomg()
	{
		objtest.setAccno(963);
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void testBNK()
	{
		objtest.setbnktype(null);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testsave()
	{
		objtest.setbnktype("save");
	}
	@Test(expected=IllegalArgumentException.class)
	public void testcheck()
	{
		objtest.setbnktype("check");
	}
	
	
	
	
	//These are the Test cases that will FAIL
	@Test
	public void ztest() {
	
		int EXPECTED=5000;
		int acc=97;
		int val=objtest.checkbalance(acc);
		Assert.assertEquals(EXPECTED, val);
	//	fail("Not yet implemented");
	}
	@Test
	public void ztest1() {
	
		double expected=8.9;
		int acc=97;
		double val;
		Customer obj=new Customer();
		 val=obj.interest();
		 
		Assert.assertEquals(expected,val);
	}
	@Test
	public void ztest2() {
	
		double EXPECTED=500;
		int acc=97;
		double val=objtest.zakaat(acc);
		Assert.assertEquals(EXPECTED, val);
	}
}