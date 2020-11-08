package me.arkadii.springappservice;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/calculate")
public class Controller {
    @GetMapping("/pow")
    @ResponseBody
    public Map<String, Object> calculate(@RequestParam("value") String value) {
        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        try {
            int intValue = Integer.parseInt(value);
            stringObjectHashMap.put("result", intValue * intValue);
        } catch (Exception e) {
            stringObjectHashMap.put("error", e.getMessage());
        }
        return stringObjectHashMap;
    }
}
