package com.icloud.jpatest.value;

import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
public class ArticleContent {
    private String content;
    private String contentType;

    public ArticleContent(String content, String contentType) {
        this.content = content;
        this.contentType = contentType;
    }

    protected ArticleContent() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleContent that = (ArticleContent) o;
        return Objects.equals(content, that.content) && Objects.equals(contentType, that.contentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, contentType);
    }
}
