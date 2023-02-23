package com.gdsc.beeye.controller;

import com.gdsc.beeye.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping(value = "/d")
    public String detectText() throws IOException {
//        String filePath = "C:\\Users\\blues\\Desktop\\3-2\\GDSC\\korean.jpg";
        String filePath = "C:\\Users\\blues\\Desktop\\3-2\\GDSC\\english.jpg";
        return testService.detectText(filePath);
    }

    @GetMapping(value = "/t")
    public String translateText() throws Exception {
        String filePath = "C:\\Users\\blues\\Desktop\\3-2\\GDSC\\korean.jpg";
//        String filePath = "https://storage.cloud.google.com/beeye-storage/english.jpg";
        return testService.translateText(testService.detectText(filePath));
    }
}