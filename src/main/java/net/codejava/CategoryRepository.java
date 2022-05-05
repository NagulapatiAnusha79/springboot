package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
