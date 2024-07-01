package umc.spring2.study.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring2.study.domain.FoodCategory;

public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {
}