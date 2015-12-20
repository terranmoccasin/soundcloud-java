package fm.ensemble.soundcloud;

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.apache.http.HttpResponse;
import org.joda.time.DateTime;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.soundcloud.api.ApiWrapper;
import com.soundcloud.api.Http;
import com.soundcloud.api.Request;
import com.soundcloud.api.Token;

import fm.ensemble.soundcloud.resource.Playlist;
import fm.ensemble.soundcloud.resource.User;
import fm.ensemble.soundcloud.util.JodaDateTimeDeserializer;

public class SoundCloud {

  private final ApiWrapper apiWrapper;
  private static final Gson gson = new GsonBuilder()
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

  public String getAuthorizationUrl(String state) {
    return apiWrapper.authorizationCodeUrl("/connect", null, null, state).toString();
  }

  public fm.ensemble.soundcloud.Token exchangeAuthorizationCode(String code) throws IOException {
    Token token = apiWrapper.authorizationCode(code);
    return fm.ensemble.soundcloud.Token.create(
        token.access, token.refresh, new DateTime(token.expiresIn));
  }

  public fm.ensemble.soundcloud.Token refreshTokens() throws IOException {
    Token token = apiWrapper.refreshToken();
    return fm.ensemble.soundcloud.Token.create(
        token.access, token.refresh, new DateTime(token.expiresIn));
  }

  public Me me() {
    return new Me();
  }

  public class Me {
    private static final String ME_PATH = "/me";

    public User get() throws IOException {
      return convert(User.class, apiWrapper.get(Request.to(ME_PATH)));
    }

    public Playlists playlists() {
      return new Playlists();
    }

    public class Playlists {
      private static final String ME_PLAYLISTS_PATH = ME_PATH + "/playlists";
      public List<Playlist> get() throws IOException {
        return convertList(Playlist.class, apiWrapper.get(Request.to(ME_PLAYLISTS_PATH)));
      }
    }
  }

  private static <T> T convert(Class<T> classType, HttpResponse resp) throws IOException {
    return gson.fromJson(Http.getString(resp), classType);
  }

  @SuppressWarnings("unchecked")
  private static <T> List<T> convertList(Class<T> classType, HttpResponse resp) throws IOException {
    return Arrays.asList((T[]) convert(Array.newInstance(classType, 0).getClass(), resp));
  }
}
