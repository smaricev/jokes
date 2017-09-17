package me.marichely.controller;
import me.marichely.entity.Joke;
import me.marichely.comparators.JokeDifferenceComparator;
import me.marichely.repository.JokeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by stjep on 16/09/2017.
 */
@Controller
public class ViewIndexController {

    private JokeRepository jokeRepository;

    ViewIndexController(JokeRepository jokeRepository){
        this.jokeRepository=jokeRepository;
    }

    @RequestMapping("/")
    public String index(Model model){
        List<Joke> listOfJokes = jokeRepository.findAll();
        int numPages = listOfJokes.size()/10;
        Integer lastpage = 0;
        lastpage = listOfJokes.size()> (10) ? 10:listOfJokes.size();


        listOfJokes.sort(new JokeDifferenceComparator());
        model.addAttribute("jokes",listOfJokes.subList(0,lastpage));
        model.addAttribute("numpages",numPages);
        model.addAttribute("pageNo",0);
        return "index";
    }
    @RequestMapping(value ="/{page}",method = RequestMethod.GET)
    public String getPage(@PathVariable String page, Model model){
        Integer pageNum = 0;
        try{
           pageNum = Integer.parseInt(page);
        }
        catch (Exception e){e.printStackTrace();};
        if(pageNum==0)return "redirect:/";
        Integer lastpage = 0;
        List<Joke> listOfJokes = jokeRepository.findAll();
        int numPages = listOfJokes.size()/10;

        listOfJokes.sort(new JokeDifferenceComparator());
        lastpage = listOfJokes.size()> (pageNum*10+10) ? (pageNum)*10+10:listOfJokes.size();

        model.addAttribute("jokes",listOfJokes.subList((pageNum+1)*10-10,lastpage));
        model.addAttribute("numpages",numPages);
        model.addAttribute("pageNo",pageNum);
        return "index";
    }

    @RequestMapping (value = "/like/{joke}/{page}",method = RequestMethod.POST)
    @PostMapping
    public String likeJoke(@PathVariable String joke,@PathVariable String page,Model model){
        Integer pageNum = Integer.parseInt(page);
        Joke foundJoke = jokeRepository.findOne(Integer.parseInt(joke));
        foundJoke.setLikes(foundJoke.getLikes()+1);
        jokeRepository.save(foundJoke);
        return "redirect:/"+pageNum;
    }
    @RequestMapping (value = "/dislike/{joke}/{page}",method = RequestMethod.POST)
    public String disLikeJoke(@PathVariable String joke,@PathVariable String page,Model model){
        Integer pageNum = Integer.parseInt(page);
        Joke foundJoke = jokeRepository.findOne(Integer.parseInt(joke));
        foundJoke.setDislikes(foundJoke.getDislikes()+1);
        jokeRepository.save(foundJoke);
        return "redirect:/"+(pageNum);
    }

}
