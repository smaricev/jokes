package me.marichely.repository;

import me.marichely.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by stjep on 16/09/2017.
 */
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
