public class LyricsDataElement {
	
	private static String artist = "", album = "", track = "", url = "";
	
	
	public LyricsDataElement(String artist, String album, String track) {
		this.artist = artist;
		this.album = album;
		this.track = track;
		
	}
	
	public LyricsDataElement(){
	
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

}
