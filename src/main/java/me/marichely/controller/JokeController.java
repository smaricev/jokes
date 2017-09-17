package me.marichely.controller;

import me.marichely.entity.Category;
import me.marichely.entity.Joke;
import me.marichely.repository.CategoryRepository;
import me.marichely.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by stjep on 16/09/2017.
 */
@RestController
@RequestMapping ("/jokes")
public class JokeController {
    private JokeRepository jokeRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    private JokeController(JokeRepository jokeRepository,CategoryRepository categoryRepository){
        this.jokeRepository = jokeRepository;
        this.categoryRepository=categoryRepository;
    }

    @RequestMapping (method = RequestMethod.GET)
    public List<Joke> findAllJokes(){
        return jokeRepository.findAll();
    }

    @RequestMapping ("/{category}")
    public List<Joke> findJokesWithCategoryID(@PathVariable String category){
        return jokeRepository.findByCategory(categoryRepository.findOne(Integer.parseInt(category)));
    }
}
