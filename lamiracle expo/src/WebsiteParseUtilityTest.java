import static org.junit.Assert.*;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WebsiteParseUtilityTest {

	WebsiteParseUtility wp;

	@Before
	public void setUp() throws Exception {
		wp = new WebsiteParseUtility("Daft Punk", "Get Lucky");
	}

	@After
	public void tearDown() throws Exception {
		wp = null;
	}

	@Test
	public void testUrl() {
		assertEquals("https://www.azlyrics.com/lyrics/daftpunk/getlucky.html", wp.getUrl());
	}
	
	@Test
	public void testFindLyrics(){
		String lyrics;
		lyrics = wp.findLyrics();
		Scanner in = new Scanner(lyrics);
		assertEquals("Like the legend of the Phoenix", in.nextLine());
	}

}
