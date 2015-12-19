package fm.ensemble.soundcloud.util;

import java.lang.reflect.Type;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class JodaDateTimeDeserializer {
  public DateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
      throws JsonParseException {
    return DateTime.parse(json.getAsJsonPrimitive().getAsString(),
        DateTimeFormat.forPattern("yyyy/MM/dd HH:mm:ss Z"));
  }
}
