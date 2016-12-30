import static org.junit.Assert.*;

import org.junit.Test;

public class BabySitterTest {

	@Test
	public void WhenBabysitterIsPassedAStartTimeItsAfterStartTime() {
		Babysitter babysitter = new Babysitter();
		assertEquals("You entered a good start time!", babysitter.pay(2, "AM"));
	}

}
