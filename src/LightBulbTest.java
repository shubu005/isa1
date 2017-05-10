import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

public class LightBulbTest {
	static LightBulb bulb;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		bulb = new LightBulb(40,20,"philips");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		bulb.increasePrice(10);
		assertEquals(30,bulb.getBulbPrice());
		
	}

	public void testWatt(){
		bulb.increasePower(60);
		assertEquals(100,bulb.getBulbWattage());
	}
}
