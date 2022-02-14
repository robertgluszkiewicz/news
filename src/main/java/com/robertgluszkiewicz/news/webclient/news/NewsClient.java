package com.robertgluszkiewicz.news.webclient.news;

import com.robertgluszkiewicz.news.model.NewsDto;
import com.robertgluszkiewicz.news.webclient.news.dto.OpenNewsNewsDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class NewsClient {
    private static final String TOP_HEADLINES_NEWS_URL = "https://newsapi.org/v2/top-headlines";
    private static final String API_KEY = "db2a29559fa04ecb92bce507099f6af9";
    private RestTemplate restTemplate = new RestTemplate();

    public NewsDto getNewsForCategory(String category) {
        OpenNewsNewsDto openNewsNewsDto = callGetMethod("?apiKey={apiKey}&country=pl&category={category}",
                OpenNewsNewsDto.class,
                API_KEY, category);
        return NewsDto.builder()
                .title(openNewsNewsDto.getArticle().getTitle())
                .description(openNewsNewsDto.getArticle().getDescription())
                .author(openNewsNewsDto.getArticle().getAuthor())
                .build();
    }

    private <T> T callGetMethod(String url, Class<T> responseType, Object...objects) {
        return restTemplate.getForObject(TOP_HEADLINES_NEWS_URL + url,
                responseType, objects);
    }
}
