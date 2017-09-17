package me.marichely.repository;

import me.marichely.entity.Category;
import me.marichely.entity.Joke;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by stjep on 16/09/2017.
 */
@Repository
public interface JokeRepository extends JpaRepository<Joke,Integer> {
    List<Joke> findByCategory(Category category);
}
