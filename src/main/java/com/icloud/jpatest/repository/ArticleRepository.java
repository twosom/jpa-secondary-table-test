package com.icloud.jpatest.repository;

import com.icloud.jpatest.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
