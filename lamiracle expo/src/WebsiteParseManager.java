
public class WebsiteParseManager {
	
	String websiteData;
	
	public WebsiteParseManager(String websiteData) {
		this.websiteData = websiteData;
	}
	
	public String chop() {
		int firstIndex, lastIndex;
		String rawLyrics, formattedLyrics;
		firstIndex = websiteData.indexOf("<!-- Usage of azlyrics.com content by any third-party lyrics provider is prohibited by our licensing agreement. Sorry about that. -->");
		System.out.println(firstIndex);
		lastIndex = websiteData.indexOf("</div><br><br>");
		rawLyrics = websiteData.substring(firstIndex+133, lastIndex);
		formattedLyrics = rawLyrics.replaceAll("<br>", "\n");
		return formattedLyrics;
	}
}
