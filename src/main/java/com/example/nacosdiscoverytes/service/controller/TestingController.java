package com.example.nacosdiscoverytes.service.controller;

import com.example.nacosdiscoverytes.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@AllArgsConstructor
public class TestingController {
    private final TestService testService;
    @GetMapping("/report/page")
    public void findReportPage() {
        testService.showInfo();
    }

}
