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
		assertEquals("Please enter a proper time!", babysitter.pay(4, "PM", 4, "AM"));
	}
	@Test
	public void WhenBabysitterIsPassedAnEndTimeItEndsAtOrBeforeFourAM() {
		assertEquals("Please enter a proper time!", babysitter.pay(7, "PM", 5, "AM"));
	}
	@Test
	public void WhenBabysitterIsPassedBothTimesNeitherOfThemAreNoon() {
		assertEquals("Please enter a proper time!", babysitter.pay(12, "PM", 5, "PM"));
		assertEquals("Please enter a proper time!", babysitter.pay(7, "PM", 12, "PM"));
	}
	@Test
	public void StartTimeIsBeforeEndTime(){
		/*assertEquals("You entered a good time!", babysitter.pay(7, "PM", 3, "AM"));
		assertEquals("You entered a good time!", babysitter.pay(7, "PM", 9, "PM"));
		assertEquals("You entered a good time!", babysitter.pay(12, "AM", 4, "AM")); */
		assertEquals("Please enter a proper time!", babysitter.pay(9, "PM", 7, "PM"));
		assertEquals("Please enter a proper time!", babysitter.pay(2, "AM", 12, "AM"));
	}
	@Test
	public void EveryHourWorkedBetweenFiveAndNineAddsTwelveDollars(){
		assertEquals("$36", babysitter.pay(6, "PM", 9, "PM"));
	}
	@Test
	public void EveryHourWorkedBetweenNineAndMidnightAddsEightDollars(){
		assertEquals("$28", babysitter.pay(8, "PM", 11, "PM"));
		assertEquals("$24", babysitter.pay(9, "PM", 12, "AM"));
	}
}
