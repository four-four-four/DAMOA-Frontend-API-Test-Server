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

    @GetMapping("/api/user/notice/")
    public String getNotice(){
        return "{\"data\": [\n" +
                "    {\"notice_id\": 1, \"title\": \"앱 업데이트\", \"content\": \"앱이 업데이트 됐어\", \"date\": \"2021-01-01\", \"author\": \"GM\"},\n" +
                "    {\"notice_id\": 2, \"title\": \"앱 업데이트1\", \"content\": \"앱이 업데이트 됐어1\", \"date\": \"2021-01-02\", \"author\": \"GM1\"},\n" +
                "    {\"notice_id\": 3, \"title\": \"앱 업데이트2\", \"content\": \"앱이 업데이트 됐어2\", \"date\": \"2021-01-03\", \"author\": \"GM2\"},\n" +
                "    {\"notice_id\": 4, \"title\": \"앱 업데이트3\", \"content\": \"앱이 업데이트 됐어3\", \"date\": \"2021-01-02\", \"author\": \"GM3\"},\n" +
                "    {\"notice_id\": 5, \"title\": \"앱 업데이트4\", \"content\": \"앱이 업데이트 됐어4\", \"date\": \"2021-01-02\", \"author\": \"GM4\"},\n" +
                "    {\"notice_id\": 6, \"title\": \"앱 업데이트5\", \"content\": \"앱이 업데이트 됐어5\", \"date\": \"2021-01-02\", \"author\": \"GM5\"},\n" +
                "    {\"notice_id\": 7, \"title\": \"앱 업데이트6\", \"content\": \"앱이 업데이트 됐어6\", \"date\": \"2021-01-02\", \"author\": \"GM6\"},\n" +
                "    {\"notice_id\": 8, \"title\": \"앱 업데이트7\", \"content\": \"앱이 업데이트 됐어7\", \"date\": \"2021-01-02\", \"author\": \"GM7\"},\n" +
                "    {\"notice_id\": 9, \"title\": \"앱 업데이트8\", \"content\": \"앱이 업데이트 됐어8\", \"date\": \"2021-01-02\", \"author\": \"GM8\"},\n" +
                "    {\"notice_id\": 10, \"title\": \"앱 업데이트9\", \"content\": \"앱이 업데이트 됐어9\", \"date\": \"2021-01-02\", \"author\": \"GM9\"},\n" +
                "    {\"notice_id\": 11, \"title\": \"앱 업데이트10\", \"content\": \"앱이 업데이트 됐어10\", \"date\": \"2021-01-02\", \"author\": \"GM10\"},\n" +
                "    {\"notice_id\": 12, \"title\": \"앱 업데이트11\", \"content\": \"앱이 업데이트 됐어11\", \"date\": \"2021-01-02\", \"author\": \"GM11\"},\n" +
                "    {\"notice_id\": 13, \"title\": \"앱 업데이트12\", \"content\": \"앱이 업데이트 됐어12\", \"date\": \"2021-01-02\", \"author\": \"GM12\"},\n" +
                "    {\"notice_id\": 14, \"title\": \"앱 업데이트13\", \"content\": \"앱이 업데이트 됐어13\", \"date\": \"2021-01-02\", \"author\": \"GM13\"},\n" +
                "    {\"notice_id\": 15, \"title\": \"앱 업데이트14\", \"content\": \"앱이 업데이트 됐어14\", \"date\": \"2021-01-02\", \"author\": \"GM14\"},\n" +
                "    {\"notice_id\": 16, \"title\": \"앱 업데이트15\", \"content\": \"앱이 업데이트 됐어15\", \"date\": \"2021-01-02\", \"author\": \"GM15\"},\n" +
                "    {\"notice_id\": 17, \"title\": \"앱 업데이트16\", \"content\": \"앱이 업데이트 됐어16\", \"date\": \"2021-01-02\", \"author\": \"GM16\"}\n" +
                "]}";
    }
}
