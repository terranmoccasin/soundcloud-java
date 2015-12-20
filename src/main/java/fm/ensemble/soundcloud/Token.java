package fm.ensemble.soundcloud;

import org.joda.time.DateTime;

public class Token {
  private String accessToken;
  private String refreshToken;
  private DateTime expiryTime;

  public static Token create(String accessToken, String refreshToken, DateTime expiryTime) {
    Token token = new Token();
    token.setAccessToken(accessToken);
    token.setRefreshToken(refreshToken);
    token.setExpiryTime(expiryTime);
    return token;
  }

  public String getAccessToken() {
    return accessToken;
  }
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }
  public String getRefreshToken() {
    return refreshToken;
  }
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }
  public DateTime getExpiryTime() {
    return expiryTime;
  }
  public void setExpiryTime(DateTime expiryTime) {
    this.expiryTime = expiryTime;
  }
}
