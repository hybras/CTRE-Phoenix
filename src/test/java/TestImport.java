import static org.junit.jupiter.api.Assertions.assertEquals;

import com.ctre.phoenix.time.StopWatch;

import org.junit.jupiter.api.Test;

class TestImport {
	@Test
	void importStopwatch() {
		final var st = new StopWatch();
		assertEquals(st.getClass(), StopWatch.class);
	}
}
