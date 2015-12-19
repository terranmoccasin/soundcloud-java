package fm.ensemble.soundcloud;

import java.net.URI;

import com.soundcloud.api.ApiWrapper;
import com.soundcloud.api.Token;

public class SoundCloud {

  private final ApiWrapper apiWrapper;

  public static Builder newBuilder(String clientId, String clientSecret) {
    return new Builder(clientId, clientSecret);
  }

  public static class Builder {
    private String clientId;
    private String clientSecret;
    private URI redirectUri;
    private Token token;

    private Builder(String clientId, String clientSecret) {
      this.clientId = clientId;
      this.clientSecret = clientSecret;
    }

    public Builder setRedirectUri(URI redirectUri) {
      this.redirectUri = redirectUri;
      return this;
    }

    public Builder setToken(String accessToken, String refreshToken) {
      this.token = new Token(accessToken, refreshToken);
      return this;
    }

    public SoundCloud build() {
      return new SoundCloud(new ApiWrapper(clientId, clientSecret, redirectUri, token));
    }
  }

  private SoundCloud(ApiWrapper apiWrapper) {
    this.apiWrapper = apiWrapper;
  }
}
