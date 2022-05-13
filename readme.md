# SecondaryTable 어노테이션을 이용한 별도 테이블 저장 및 조회 로직 구현

목표
---

* Article 엔티티와 ArticleContent 엔티티는 서로 1:1 연관관계다.
* Article은 엔티티로 구현하되, ArticleContent는 엔티티가 아닌 밸류 타입으로 취급하여야 한다.
* Article 엔티티를 제외한 나머지 밸류 타입은 리포지토리가 존재하면 안된다.
* Article을 조회할 때 article_content 테이블에서도 ArticleContent 밸류를 가져와서 Article 엔티티 안에 매핑할 수 있어야 한다.
* Article 엔티티를 생성할 때 해당 엔티티 안에 있는 ArticleContent 값도 같이 설정 시에 article 테이블 뿐만 아니라 article_content 테이블에도 저장되어야 한다.