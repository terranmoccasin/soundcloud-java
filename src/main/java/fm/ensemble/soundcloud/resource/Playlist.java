package fm.ensemble.soundcloud.resource;

import java.util.List;

public class Playlist {
  private int id;
  private String title;
  private List<Track> tracks;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public List<Track> getTracks() {
    return tracks;
  }
  public void setTracks(List<Track> tracks) {
    this.tracks = tracks;
  }
}
