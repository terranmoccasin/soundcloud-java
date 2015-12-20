package fm.ensemble.soundcloud.resource;

import java.util.List;

import org.joda.time.DateTime;

public class Playlist {
  private int id;
  private DateTime createdAt;
  private int userId;
  private User user;
  private String title;
  private String permalink;
  private String permalinkUrl;
  private String uri;
  private String sharing;
  private String embeddableBy;
  private String purchaseUrl;
  private String artworkUrl;
  private String description;
  private String label;
  private Long duration;
  private String genre;
  private String tagList;
  private int labelId;
  private String labelName;
  private String release;
  private int releaseDay;
  private int releaseMonth;
  private int releaseYear;
  private boolean streamable;
  private boolean downloadable;
  private String ean;
  private String playlistType;
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
  public DateTime getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }
  public String getPermalink() {
    return permalink;
  }
  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }
  public String getPermalinkUrl() {
    return permalinkUrl;
  }
  public void setPermalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }
  public String getSharing() {
    return sharing;
  }
  public void setSharing(String sharing) {
    this.sharing = sharing;
  }
  public String getEmbeddableBy() {
    return embeddableBy;
  }
  public void setEmbeddableBy(String embeddableBy) {
    this.embeddableBy = embeddableBy;
  }
  public String getPurchaseUrl() {
    return purchaseUrl;
  }
  public void setPurchaseUrl(String purchaseUrl) {
    this.purchaseUrl = purchaseUrl;
  }
  public String getArtworkUrl() {
    return artworkUrl;
  }
  public void setArtworkUrl(String artworkUrl) {
    this.artworkUrl = artworkUrl;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getLabel() {
    return label;
  }
  public void setLabel(String label) {
    this.label = label;
  }
  public Long getDuration() {
    return duration;
  }
  public void setDuration(Long duration) {
    this.duration = duration;
  }
  public String getGenre() {
    return genre;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public String getTagList() {
    return tagList;
  }
  public void setTagList(String tagList) {
    this.tagList = tagList;
  }
  public int getLabelId() {
    return labelId;
  }
  public void setLabelId(int labelId) {
    this.labelId = labelId;
  }
  public String getLabelName() {
    return labelName;
  }
  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }
  public String getRelease() {
    return release;
  }
  public void setRelease(String release) {
    this.release = release;
  }
  public int getReleaseDay() {
    return releaseDay;
  }
  public void setReleaseDay(int releaseDay) {
    this.releaseDay = releaseDay;
  }
  public int getReleaseMonth() {
    return releaseMonth;
  }
  public void setReleaseMonth(int releaseMonth) {
    this.releaseMonth = releaseMonth;
  }
  public int getReleaseYear() {
    return releaseYear;
  }
  public void setReleaseYear(int releaseYear) {
    this.releaseYear = releaseYear;
  }
  public boolean isStreamable() {
    return streamable;
  }
  public void setStreamable(boolean streamable) {
    this.streamable = streamable;
  }
  public boolean isDownloadable() {
    return downloadable;
  }
  public void setDownloadable(boolean downloadable) {
    this.downloadable = downloadable;
  }
  public String getEan() {
    return ean;
  }
  public void setEan(String ean) {
    this.ean = ean;
  }
  public String getPlaylistType() {
    return playlistType;
  }
  public void setPlaylistType(String playlistType) {
    this.playlistType = playlistType;
  }
}
