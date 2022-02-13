package com.robertgluszkiewicz.news.controller;

import com.robertgluszkiewicz.news.model.NewsDto;
import com.robertgluszkiewicz.news.service.NewsService;
import com.robertgluszkiewicz.news.webclient.news.NewsClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NewsController {
//    private final NewsService newsService;
    private final NewsClient newsClient;

//    @GetMapping("/news")
//    public List<NewsDto> getNews() {
//        return newsService.getNews();
//    }

    @GetMapping("news2")
    public void getNews() {
        List<NewsDto> newsList = newsClient.getNewsForCategory("business");

        newsList.forEach(newsDto -> {
            System.out.println(newsDto.getTitle());
        });

    }
}
