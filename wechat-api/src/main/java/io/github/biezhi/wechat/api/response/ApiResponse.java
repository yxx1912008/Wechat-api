package io.github.biezhi.wechat.api.response;

import java.lang.reflect.Type;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {

    private static final Gson gson = new Gson();

    protected String          rawBody;

    public <T> T parse(Class<T> type) {
        return gson.fromJson(rawBody, type);
    }

    public <T> T parse(Type type) {
        return gson.fromJson(rawBody, type);
    }

    public JsonObject toJsonObject() {
        return new JsonParser().parse(rawBody).getAsJsonObject();
    }

}