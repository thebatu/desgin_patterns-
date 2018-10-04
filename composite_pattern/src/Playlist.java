import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	public void add(IComponent song){
		playlist.add(song);
	}
	
	public void remove(IComponent song){
		playlist.remove(song);
	}

	public void play() {
		for(IComponent component : playlist){
			component.play();
		}
		
	}

	public void setPlaybackSpeed(Float speed) {
		for(IComponent component : playlist){
			component.setPlaybackSpeed(speed);
		}
	}

	public String getName() {
		return this.playlistName;
	}
	
}

	

	
	
	

