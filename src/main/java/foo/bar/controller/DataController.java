package foo.bar.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;

@RestController
public class DataController {
    @RequestMapping(value = "/chuck/norris", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> index() {
        Faker faker = new Faker();
        Map<String, String> out = new LinkedHashMap<>();
        out.put("funFact", faker.chuckNorris().fact());
        return ResponseEntity.ok().body(out);
    }
}
