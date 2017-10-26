import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.simpleprogrammer.proteintracker.InvalidGoalException;
import com.simpleprogrammer.proteintracker.TrackingService;

public class TrackingServiceTest {
	
	TrackingService service = null;
	
	@Before
	public void setup() {
		service = new TrackingService();
	}
	
	@Test
	public void NewTrackingServiceTotalIsZero() {
		assertEquals("Tracking service total was not zero", 0, service.getTotal());		
	}
	
	@Test
	public void WhenAddingProtenTotalIncreasesByThatAmount() {	
		service.addProtein(10);
		assertEquals(10, service.getTotal());
	}

	@Test
	public void WhenRemovingProtenTotalRemainsZero() {
		service.removeProtein(5);
		assertEquals(0, service.getTotal());
	}
	
	@Test(expected = InvalidGoalException.class)
	public void whenGoalIsSetToLessThanZeroExceptionIsThrown() throws InvalidGoalException {
		service.setGoal(-5);
	}

	@Test(timeout = 200)
	public void badTest() {
		for (int i = 0; i <10000000; i++) {
			service.addProtein(1);			
		}
	}
	
}
