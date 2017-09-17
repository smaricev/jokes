package me.marichely.controller;

import me.marichely.entity.Category;
import me.marichely.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by stjep on 16/09/2017.
 */
@RestController
@RequestMapping ("/category")
public class CategoryController {
    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public List<Category> insertCategory(@RequestBody Category category){
        categoryRepository.save(category);
        return categoryRepository.findAll();

    }


}
