package com.example.tasteofpangyoapi.domain.categorytb;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CategoryRepositoryImpl extends QuerydslRepositorySupport {
    private final JPAQueryFactory queryFactory;
    /**
     * Creates a new {@link QuerydslRepositorySupport} instance for the given domain type.
     *
     * @param domainClass  must not be {@literal null}.
     * @param queryFactory
     */
    public CategoryRepositoryImpl(JPAQueryFactory queryFactory) {
        super(CategoryTb.class);
        this.queryFactory = queryFactory;
    }

    public List<CategoryTb> findById(long id){
        QCategoryTb qCategoryTb = QCategoryTb.categoryTb;
        return queryFactory
                .selectFrom(qCategoryTb)
                .where(qCategoryTb.categoryId.eq(id))
                .fetch()
                ;
    }
}
