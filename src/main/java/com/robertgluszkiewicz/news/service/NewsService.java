package com.robertgluszkiewicz.news.service;

import com.robertgluszkiewicz.news.model.NewsDto;
import com.robertgluszkiewicz.news.webclient.news.NewsClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class NewsService {
    private final NewsClient newsClient;

    public List<NewsDto> getNews() {
        return newsClient.getNewsForCategory("business");
    }
}
