package com.robertgluszkiewicz.news.service;

import com.robertgluszkiewicz.news.model.NewsDto;
import com.robertgluszkiewicz.news.webclient.news.NewsClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsClient newsClient;

    public NewsDto getNews() {
        return newsClient.getNewsForCategory("business");
    }
}
