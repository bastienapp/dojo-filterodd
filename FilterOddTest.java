import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class FilterOddTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}
	
	@Test
	public void test1() throws Exception {
		int[] tab = new int[]{1, 2, 3, 4};
		int[] odds = new int[]{1, 3};
		Assert.assertArrayEquals(tab, FilterOdd.filter(tab));
	}
}
