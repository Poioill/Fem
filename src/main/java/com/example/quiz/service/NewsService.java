package com.example.quiz.service;

import com.example.quiz.entity.News;
import com.example.quiz.repository.NewsRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsRepo newsRepo;

    public List<News> allNews(){
        return newsRepo.findAll();
    }

    public void addNews(News news){
        log.info("Saving new News: title {}, text {}", news.getTitle(), news.getText());
        newsRepo.save(news);
    }
}
