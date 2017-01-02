import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BabySitterTest {

	Babysitter babysitter;
	
	@Before
	public void setUp(){
		babysitter = new Babysitter();
	}
	
	@Test
	public void WhenBabysitterIsPassedAStartTimeItsAtOrAfterFivePM() {
		assertEquals("You entered a good start time!", babysitter.pay(2, "AM", 4, "AM"));
	}
	
	@Test
	public void WhenBabysitterIsPassedAnEndTimeItEndsAtOrBeforeFourAM() {
		assertEquals("You entered a good start time!", babysitter.pay(7, "PM", 3, "AM"));
	}
	@Test
	public void WhenBabysitterIsPassedBothTimesNeitherOfThemAreNoon() {
		assertEquals("Please enter a proper time!", babysitter.pay(12, "PM", 5, "PM"));
		assertEquals("Please enter a proper time!", babysitter.pay(7, "PM", 12, "PM"));
	}
}
