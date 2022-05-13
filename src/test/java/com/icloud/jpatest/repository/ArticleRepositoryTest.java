package com.icloud.jpatest.repository;

import com.icloud.jpatest.entity.Article;
import com.icloud.jpatest.value.ArticleContent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
class ArticleRepositoryTest {

    @Autowired
    ArticleRepository repository;

    @PersistenceContext
    EntityManager em;

    @Test
    void test() {
        assertNotNull(repository);
    }

    @Test
    void test2() {
        ArticleContent articleContent = new ArticleContent("test_article_content", "test_article_content_type");
        Article article = new Article("test_article_title", articleContent);
        repository.save(article);

        em.flush();
        em.clear();

        Article findArticle = repository.findAll().get(0);
        assertNotNull(findArticle);
        assertEquals(articleContent, findArticle.getContent());

    }

}