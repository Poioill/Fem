package com.example.quiz.controller;

import com.example.quiz.entity.News;
import com.example.quiz.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;

    @GetMapping("/news")
    public String newsPage(Model model){
        model.addAttribute("news", newsService.allNews());
        return "news";
    }

    @PostMapping("/addNews")
    public String addNews(Model model, News news){
        newsService.addNews(news);
        return "redirect:/";
    }

//    @PostMapping("/deleteNews")
//    public String deleteNews(Model model,)
}
