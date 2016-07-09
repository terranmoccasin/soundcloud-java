package fm.ensemble.soundcloud.resource;

import org.joda.time.DateTime;

public class Track {
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
  private User label;
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
  private String state;
  private String license;
  private String trackType;
  private String waveformUrl;
  private String downloadUrl;
  private String streamUrl;
  private String videoUrl;
  private Double bpm;
  private boolean commentable;
  private String isrc;
  private String keySignature;
  private int commentCount;
  private int downloadCount;
  private int playbackCount;
  private int favoritingsCount;
  private String originalFormat;
  private int originalContentSize;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
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
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
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
  public User getLabel() {
    return label;
  }
  public void setLabel(User label) {
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
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public String getLicense() {
    return license;
  }
  public void setLicense(String license) {
    this.license = license;
  }
  public String getTrackType() {
    return trackType;
  }
  public void setTrackType(String trackType) {
    this.trackType = trackType;
  }
  public String getWaveformUrl() {
    return waveformUrl;
  }
  public void setWaveformUrl(String waveformUrl) {
    this.waveformUrl = waveformUrl;
  }
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }
  public String getStreamUrl() {
    return streamUrl;
  }
  public void setStreamUrl(String streamUrl) {
    this.streamUrl = streamUrl;
  }
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }
  public Double getBpm() {
    return bpm;
  }
  public void setBpm(Double bpm) {
    this.bpm = bpm;
  }
  public boolean isCmomentable() {
    return commentable;
  }
  public void setCmomentable(boolean cmomentable) {
    this.commentable = cmomentable;
  }
  public String getIsrc() {
    return isrc;
  }
  public void setIsrc(String isrc) {
    this.isrc = isrc;
  }
  public String getKeySignature() {
    return keySignature;
  }
  public void setKeySignature(String keySignature) {
    this.keySignature = keySignature;
  }
  public int getCommentCount() {
    return commentCount;
  }
  public void setCommentCount(int commentCount) {
    this.commentCount = commentCount;
  }
  public int getDownloadCount() {
    return downloadCount;
  }
  public void setDownloadCount(int downloadCount) {
    this.downloadCount = downloadCount;
  }
  public int getPlaybackCount() {
    return playbackCount;
  }
  public void setPlaybackCount(int playbackCount) {
    this.playbackCount = playbackCount;
  }
  public int getFavoritingsCount() {
    return favoritingsCount;
  }
  public void setFavoritingsCount(int favoritingsCount) {
    this.favoritingsCount = favoritingsCount;
  }
  public String getOriginalFormat() {
    return originalFormat;
  }
  public void setOriginalFormat(String originalFormat) {
    this.originalFormat = originalFormat;
  }
  public int getOriginalContentSize() {
    return originalContentSize;
  }
  public void setOriginalContentSize(int originalContentSize) {
    this.originalContentSize = originalContentSize;
  }
}
