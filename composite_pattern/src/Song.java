
public class Song implements IComponent {
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	public void play() {
		//play the song using this speed.
		
	}

	public void setPlaybackSpeed(Float speed) {
		this.speed = speed;
	}

	public String getName() {
		return this.getName();
	}
	
	public String getArtist(){
		return this.getArtist();
	}
	
		
		
		
}

	

