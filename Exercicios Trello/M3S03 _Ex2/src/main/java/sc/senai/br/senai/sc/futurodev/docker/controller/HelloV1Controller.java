package sc.senai.br.senai.sc.futurodev.docker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello/v1")
public class HelloV1Controller {

    @GetMapping
    public ResponseEntity<String> findAll() {
        String helloWord = "Hello Word!";
        return ResponseEntity.ok().body(helloWord);
    }

}