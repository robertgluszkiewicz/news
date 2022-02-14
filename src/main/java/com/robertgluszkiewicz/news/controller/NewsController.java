package com.robertgluszkiewicz.news.controller;

import com.robertgluszkiewicz.news.model.NewsDto;
import com.robertgluszkiewicz.news.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/news")
    public NewsDto getNews() {
        return newsService.getNews();
    }
}
