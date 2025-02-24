package dio.springboot.app;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class ConversorJson {
    private Gson gson = new Gson();
    public ViaCepResponse converter(String json) {
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
