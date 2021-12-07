package com.damoa.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiController {

    @GetMapping("/api/user/notice/{id}")
    public String getNoticeById(@PathVariable Long id){
        return "{\"result\" : \"success\"}";
    }
}
