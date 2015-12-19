package fm.ensemble.soundcloud;

import java.net.URI;

import org.joda.time.DateTime;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.soundcloud.api.ApiWrapper;
import com.soundcloud.api.Token;

import fm.ensemble.soundcloud.util.JodaDateTimeDeserializer;

public class SoundCloud {

  private final ApiWrapper apiWrapper;
  private final Gson gson = new GsonBuilder()
      .registerTypeAdapter(DateTime.class, new JodaDateTimeDeserializer())
      .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
      .create();

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
