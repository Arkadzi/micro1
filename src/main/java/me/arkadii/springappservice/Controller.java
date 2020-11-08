package me.arkadii.springappservice;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class Controller {
    private static HttpEntity<?> getHeaders() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return new HttpEntity<>(headers);
    }

    @GetMapping("/calculator")
    @ResponseBody
    public String calculate(@RequestParam("value") String value) {
        String baseUrl = "http://calc:8085/api/calculate/pow?value=" + value;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = null;
        try {
            response = restTemplate.exchange(baseUrl,
                    HttpMethod.GET, getHeaders(), String.class);
            return response.getBody();
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }
}
