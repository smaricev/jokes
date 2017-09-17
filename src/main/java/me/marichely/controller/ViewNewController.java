package me.marichely.controller;

import me.marichely.entity.Category;
import me.marichely.entity.Joke;
import me.marichely.form.NewJoke;
import me.marichely.repository.CategoryRepository;
import me.marichely.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by stjep on 16/09/2017.
 */
@Controller
@RequestMapping("/new")
public class ViewNewController {
    private CategoryRepository categoryRepository;
    private JokeRepository jokeRepository;

    @Autowired
    private ViewNewController(CategoryRepository categoryRepository,JokeRepository jokeRepository){
        this.categoryRepository = categoryRepository;
        this.jokeRepository = jokeRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String newV(Model model){
        model.addAttribute("categories",categoryRepository.findAll());
        model.addAttribute("joke",new NewJoke());
        return "new";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String jokeSubmit(@ModelAttribute NewJoke joke,Model model){
        if(joke != null){
            Category jokeCategory = categoryRepository.findOne(joke.getCategory());
            String content = joke.getContent();
            model.addAttribute("categories",categoryRepository.findAll());
            model.addAttribute("joke",new NewJoke());
            if(content.compareTo("")== 0){
                model.addAttribute("message","You need to enter joke text");
                return "newSuccess";
            }
            Joke a = new Joke();
            a.setContent(joke.getContent());
            a.setCategory(jokeCategory);
            try {
                jokeRepository.save(a);
            }catch(Exception e){
                model.addAttribute("message","You need to select a joke category");
                return "newSuccess";
            }
        }
        model.addAttribute("categories",categoryRepository.findAll());
        model.addAttribute("joke",new NewJoke());
        model.addAttribute("message","Success");
        return "newSuccess";

    }


}
