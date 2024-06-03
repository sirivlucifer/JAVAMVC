package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/deneme")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> helloTwitch(){
        return ResponseEntity.ok("Hello Twitch");
    }
    @PostMapping
    public ResponseEntity<String> helloTwitchPost(@RequestBody String newText){
        // Yeni metni kullanarak ekrandaki yazıyı değiştirme işlemleri
        // Örneğin, bir değişkeni güncelleyebilir veya başka bir işlem yapabilirsiniz
        return ResponseEntity.ok("Yeni metin: " + newText);
    }
}
